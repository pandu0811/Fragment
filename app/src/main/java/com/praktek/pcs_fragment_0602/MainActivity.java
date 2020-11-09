package com.praktek.pcs_fragment_0602;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentHome mHomeFragment = new FragmentHome();
        Fragment fragment = mFragmentManager.findFragmentByTag(FragmentHome.class.getSimpleName());

        if (!(fragment instanceof FragmentHome)) {
            Log.d("MyFlexibleFragment", "Fragment Name :" + FragmentHome.class.getSimpleName());
            ((FragmentManager) mFragmentManager)
                    .beginTransaction()
                    .add(R.id.frame_container, mHomeFragment, FragmentHome.class.getSimpleName())
                    .commit();
        }
    }
}
