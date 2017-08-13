package com.ram.jsonparsing;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by ram on 7/27/2017.
 */

public class MyContactAsync extends AsyncTask<String,String,String> {
    private Context mContex;
    private ProgressDialog mProgressDialog;
    private ListView mListView;
    private MyContactsAdapter mMyContactAdapter;

    public MyContactAsync(Context mContex, ListView mListView) {
        this.mContex = mContex;
        this.mListView = mListView;
        mProgressDialog=new ProgressDialog(mContex);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        mProgressDialog.setMessage("Loading.....");
        mProgressDialog.show();
    }

    @Override
    protected String doInBackground(String... params) {
        String result=null;
        StringBuilder sb=new StringBuilder();
        try {
            URL url=new URL(params[0]);
            HttpURLConnection urlConnection=(HttpURLConnection) url.openConnection();
            urlConnection.connect();

            BufferedReader bufferedReader=new BufferedReader( new InputStreamReader (urlConnection.getInputStream()));
            while ((result=bufferedReader.readLine())!=null){
                sb.append(result);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        result=sb.toString();
        return result;

    }

    @Override
    protected void onProgressUpdate(String... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        //here we are doing json parsing
        try {
            JSONObject jsonObject=new JSONObject(s);

            JSONArray jsonArray=jsonObject.getJSONArray("contacts");//contacts is array name
            ArrayList<Contact> mContactlist=new ArrayList<>();//creating array list
            for (int i=0;i<jsonArray.length();i++){
                Contact contact=new Contact();
                contact.setId(jsonArray.getJSONObject(i).getString("id"));//setting data to pojo class
                contact.setName(jsonArray.getJSONObject(i).getString("name"));
                contact.setGender(jsonArray.getJSONObject(i).getString("gender"));
                mContactlist.add(contact);//adding data to array list
            }
            mMyContactAdapter=new MyContactsAdapter(mContex,mContactlist);//calling adapter class
            mListView.setAdapter(mMyContactAdapter);
        }catch (Exception e){
            e.printStackTrace();
        }
        mProgressDialog.dismiss();
    }
}
