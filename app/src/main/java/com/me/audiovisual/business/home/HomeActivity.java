package com.me.audiovisual.business.home;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.me.audiovisual.R;
import com.me.audiovisual.arch.controller.BaseControllerActivity;
import com.me.audiovisual.util.ActivityUtils;

public class HomeActivity extends BaseControllerActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        HomeFragment homeFragment = new HomeFragment();
        ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), homeFragment, R.id.frame_container);
    }


}
