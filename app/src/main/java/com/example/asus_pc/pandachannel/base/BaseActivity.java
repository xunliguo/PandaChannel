package com.example.asus_pc.pandachannel.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.asus_pc.pandachannel.App.MyApp;

/**
 * Created by Windows on 2017/8/17.
 */
public abstract class BaseActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutId());

        initView();
        loadData();
        initListener();
    }


    @Override
    protected void onResume() {
        super.onResume();

    }

    protected abstract int getLayoutId();

    protected abstract void initView();

    protected abstract void loadData();

    protected abstract void initListener();
}
