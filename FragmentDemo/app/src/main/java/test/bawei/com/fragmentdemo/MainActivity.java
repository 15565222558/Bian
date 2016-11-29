package test.bawei.com.fragmentdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import test.bawei.com.fragmentdemo.fragment.OneFragment;
import test.bawei.com.fragmentdemo.fragment.ThreeFragment;
import test.bawei.com.fragmentdemo.fragment.TwoFragment;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    private Button fragment1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("A_F", " Activity--&&--onCreate");
        //找控件
        fragment1 = (Button) findViewById(R.id.fragment1);
        Button fragment2 = (Button) findViewById(R.id.fragment2);
        Button fragment3 = (Button) findViewById(R.id.fragment3);
        //给控件设置点击事件
        fragment1.setOnClickListener(this);
        fragment2.setOnClickListener(this);
        fragment3.setOnClickListener(this);
        //判断事务==于空时
        if (getFragmentManager().findFragmentById(R.id.fr) == null) {
            //创建Fragment对象
//            ArrayListFragment list = new ArrayListFragment();
            //管理一个事务
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            //替换
            transaction.replace(R.id.fr, new OneFragment(), "f01");
            transaction.addToBackStack(null);
            //提交事务
            transaction.commit();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("A_F", " Activity--&&--onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("A_F", " Activity--&&--onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("A_F", " Activity--&&--onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("A_F", " Activity--&&--onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("A_F", " Activity--&&--onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("A_F", " Activity--&&--onResume");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fragment1:
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                //替换
                transaction.replace(R.id.fr, new OneFragment(), "f01");
                transaction.commit();
                break;
            case R.id.fragment2:
                FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                //替换
                transaction2.replace(R.id.fr, new TwoFragment(), "f02");
                transaction2.commit();
                break;
            case R.id.fragment3:
                FragmentTransaction transaction3 = getSupportFragmentManager().beginTransaction();

                ThreeFragment threeFragment = new ThreeFragment();
                String text = (String) fragment1.getText();
                Bundle bundle = new Bundle();
                bundle.putString("name", text);
                threeFragment.setArguments(bundle);
                //替换
                transaction3.replace(R.id.fr, threeFragment, "f03");
                transaction3.commit();
                break;
        }
    }

    public static class ArrayListFragment extends ListFragment {

        @Override
        public void onAttach(Activity activity) {
            Log.i("A_F", " Fragment--&&--onAttach");
            super.onAttach(activity);
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            Log.i("A_F", " Fragment--&&--onCreate");
            super.onCreate(savedInstanceState);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            Log.i("A_F", " Fragment--&&--onCreateView");
            return super.onCreateView(inflater, container, savedInstanceState);
        }

        @Override
        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            Log.i("A_F", " Fragment--&&--onActivityCreated");
            String[] array = new String[]{"C++", "Java", "Android"};
            setListAdapter(new ArrayAdapter<String>(getActivity(),
                    android.R.layout.simple_list_item_1, array));
        }

        @Override
        public void onStart() {
            Log.i("A_F", " Fragment--&&--onStart");
            super.onStart();
        }

        @Override
        public void onResume() {
            Log.i("A_F", " Fragment--&&--onResume");
            super.onResume();
        }

        @Override
        public void onPause() {
            Log.i("A_F", " Fragment--&&--onPause");
            super.onPause();
        }

        @Override
        public void onStop() {
            Log.i("A_F", " Fragment--&&--onStop");
            super.onStop();
        }

        @Override
        public void onDestroyView() {
            Log.i("A_F", " Fragment--&&--onDestroyView");
            super.onDestroyView();
        }

        @Override
        public void onDestroy() {
            Log.i("A_F", " Fragment--&&--onDestroy");
            super.onDestroy();
        }

        @Override
        public void onDetach() {
            Log.i("A_F", " Fragment--&&--onDetach");
            super.onDetach();
        }

        @Override
        public void onListItemClick(ListView l, View v, int position, long id) {
            Log.i("A_F", "Item clicked: " + id);
        }
    }
}
