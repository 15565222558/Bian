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

/**
 * autour: 李海宽
 * date: 2016/11/29 13:56
 * update: 2016/11/29
 */
public class ThreeFragment extends Fragment {

    private TextView f03;

    @Override
    public void onAttach(Activity activity) {
        Log.i("A_F", " Fragment--&_3_&--onAttach");
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i("A_F", " Fragment--&_3_&--onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstaceState) {
        View view = inflater.inflate(R.layout.three, null);
        Log.i("A_F", " Fragment--&_3_&--onCreateView");
        f03 = (TextView) view.findViewById(R.id.f03);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("A_F", " Fragment--&_3_&--onActivityCreated");
        //拿到 Activity传过来的值
        Bundle bundle = getArguments();
        //逻辑判断  非空时
        if (bundle != null) {
            String name = bundle.getString("name");
            //设置并赋值
            f03.setText(name);
        }

    }

    @Override
    public void onStart() {
        Log.i("A_F", " Fragment--&_3_&--onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.i("A_F", " Fragment--&_3_&--onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i("A_F", " Fragment--&_3_&--onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.i("A_F", " Fragment--&_3_&--onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.i("A_F", " Fragment--&_3_&--onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.i("A_F", " Fragment--&_3_&--onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.i("A_F", " Fragment--&_3_&--onDetach");
        super.onDetach();
    }

    public interface getjiekou {
        void getSet(String name);
    }
}
