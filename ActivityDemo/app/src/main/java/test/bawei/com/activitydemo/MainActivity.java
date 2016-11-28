package test.bawei.com.activitydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Activity", "A_____onCreate");
        Button button = (Button) findViewById(R.id.yyy);
        //点击时间
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //指定意图  跳转
                startActivity(new Intent(MainActivity.this, MainActivity_B.class));
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Activity", "A_____onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Activity", "A_____onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity", "A_____onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Activity", "A_____onStop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Activity", "A_____onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity", "A_____onDestroy");
    }

}
