package com.ram.jsonparsing;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.gson.Gson;
import com.google.gson.JsonArray;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private ListView mListView;
    private MyContactAsync mMyContactAsync;
    private JsonObjectRequest mJsonReq;
    private MyContactsAdapter mMyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView=(ListView)findViewById(R.id.listview);
       // mMyContactAsync=new MyContactAsync(MainActivity.this,mListView);
       // mMyContactAsync.execute("https://api.androidhive.info/contacts/");
        //here we creat some  json objectobject
        mJsonReq=new JsonObjectRequest("https://api.androidhive.info/contacts/",
                new Response.Listener<JSONObject>() {


                    @Override
                    public void onResponse(JSONObject response) {
                      //pass Gson object
                       // Gson gson=new Gson();
                        //contactsInfo pozo class


                        ContactsInfo contactsInfo= new Gson().fromJson(response.toString(),ContactsInfo.class);//here We convert json by using Gson and convert into pojo class i.e(contact.info)
                       /* ArrayList<Contact> mContactList=(ArrayList<Contact>)contactsInfo.getContacts();//got array list of contact
                        mMyAdapter=new MyContactsAdapter(MainActivity.this,mContactList);
                        mListView.setAdapter(mMyAdapter);*/
                       mListView.setAdapter(new MyContactsAdapter(MainActivity.this,(ArrayList<Contact>)contactsInfo.getContacts()));
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();

            }
        });
        JsonParsingApp.mInstance.getRequestQueue().add(mJsonReq);//adding the request queue in volly
    }
}
