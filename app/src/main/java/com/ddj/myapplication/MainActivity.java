package com.ddj.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Click(View v){
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        HomeFragment Home=new HomeFragment();
        DashboardFragment Dashboard=new DashboardFragment();
        NotificationsFragment Notifications=new NotificationsFragment();

        switch (v.getId()){
            case R.id.text_home:;
                ft.replace(R.id.App_name, Home);
                break;
            case R.id.text_dashboard:;
                ft.replace(R.id.App_name, Dashboard);
                break;
            case R.id.text_notifications:;
                ft.replace(R.id.App_name, Notifications);
                break;
        }
        ft.commit();
    }
}