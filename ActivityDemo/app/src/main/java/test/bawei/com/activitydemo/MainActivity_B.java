package test.bawei.com.activitydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity_B extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity__b);
        Log.i("Activity", "B_____onCreate");
        Button sss = (Button) findViewById(R.id.sss);
        //点击时间
        sss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //指定意图  跳转
                startActivity(new Intent(MainActivity_B.this, MainActivity_C.class));
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Activity", "B_____onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Activity", "B_____onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity", "B_____onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Activity", "B_____onStop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Activity", "B_____onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity", "B_____onDestroy");
    }
}
