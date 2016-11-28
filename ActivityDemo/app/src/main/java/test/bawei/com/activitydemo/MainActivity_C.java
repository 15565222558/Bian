package test.bawei.com.activitydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity_C extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity__c);
        Log.i("Activity", "C_____onCreate");
        Button qqq = (Button) findViewById(R.id.qqq);
        //点击时间
        qqq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //指定意图  跳转
                startActivity(new Intent(MainActivity_C.this, MainActivity.class));
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Activity", "C_____onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Activity", "C_____onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity", "C_____onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Activity", "C_____onStop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Activity", "C_____onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity", "C_____onDestroy");
    }
}
