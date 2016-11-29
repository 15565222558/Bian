package test.bawei.com.fragmentdemo.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import test.bawei.com.fragmentdemo.R;
import test.bawei.com.fragmentdemo.bean.Bean;

/**
 * autour: 李海宽
 * date: 2016/11/29 13:56
 * update: 2016/11/29
 */
public class OneFragment extends Fragment {

    private TextView f01;

    @Override
    public void onAttach(Activity activity) {
        Log.i("A_F", " Fragment--&_1_&--onAttach");
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i("A_F", " Fragment--&_1_&--onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstaceState) {
        View view = inflater.inflate(R.layout.one, null);
        f01 = (TextView) view.findViewById(R.id.f01);
        Log.i("A_F", " Fragment--&_1_&--onCreateView");
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("A_F", " Fragment--&_1_&--onActivityCreated");
        //设置值
        f01.setText(this.getBean().getName());
    }

    @Override
    public void onStart() {
        Log.i("A_F", " Fragment--&_1_&--onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.i("A_F", " Fragment--&_1_&--onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i("A_F", " Fragment--&_1_&--onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.i("A_F", " Fragment--&_1_&--onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.i("A_F", " Fragment--&_1_&--onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.i("A_F", " Fragment--&_1_&--onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.i("A_F", " Fragment--&_1_&--onDetach");
        super.onDetach();
    }
    //定义静态的方法   通过get.set传值
    public static Bean getBean() {
        Bean bean = new Bean();
        bean.setName("您好,我来打个招呼...");
        return bean;
    }
}
