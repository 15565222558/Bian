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
public class TwoFragment extends Fragment {

    private TextView f02;

    @Override
    public void onAttach(Activity activity) {
        Log.i("A_F", " Fragment--&_2_&--onAttach");
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i("A_F", " Fragment--&_2_&--onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstaceState) {
        View view = inflater.inflate(R.layout.two, null);
        Log.i("A_F", " Fragment--&_2_&--onCreateView");
        f02 = (TextView) view.findViewById(R.id.f02);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("A_F", " Fragment--&_2_&--onActivityCreated");
        //调用One中静态方法
        Bean bean = OneFragment.getBean();
        //设置参数
        f02.setText(bean.getName());
    }

    @Override
    public void onStart() {
        Log.i("A_F", " Fragment--&_2_&--onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.i("A_F", " Fragment--&_2_&--onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i("A_F", " Fragment--&_2_&--onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.i("A_F", " Fragment--&_2_&--onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.i("A_F", " Fragment--&_2_&--onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.i("A_F", " Fragment--&_2_&--onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.i("A_F", " Fragment--&_2_&--onDetach");
        super.onDetach();
    }
}
