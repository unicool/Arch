package com.me.audiovisual.arch.controller;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.me.audiovisual.R;

/**
 * 用于创建view层(fragment)和presenter层(presenter)的控制器基类。
 */
public abstract class BaseControllerActivity extends AppCompatActivity {

    @CallSuper
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_controller);


        Toolbar toolbar = findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            TextView title = toolbar.findViewById(R.id.tv_app_title);
            title.setText(getTitle());
            //toolbar.setNavigationIcon(R.drawable.ic_menu);
        }
        ActionBar ab = getSupportActionBar();
        if (ab != null) {
            ab.setDisplayShowTitleEnabled(false);
            //ab.setHomeAsUpIndicator(R.drawable.ic_menu);
            //ab.setDisplayHomeAsUpEnabled(true);
        }

        //FrameLayout frame_container = findViewById(R.id.frame_container);

    }
}
