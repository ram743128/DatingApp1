public class MyService extends Service implements Runnable

{      @Override

public void onCreate() {

    super.onCreate();

    Thread mythread = new Thread(this);

    mythread.start();

}



    public void run() {

        Looper.prepare();

        try {

            myddownloadmethod();// calling my download method

        } catch (Exception e1) {