package com.me.audiovisual.business.home;

import com.me.audiovisual.R;
import com.me.audiovisual.arch.dagger2.DaggerComponents;
import com.me.audiovisual.arch.presenter.BasicPresenterFragment;

public class HomeFragment extends BasicPresenterFragment<HomeDelegate> implements IHomeContract.Presenter {

    @Override
    protected void injectDependence() {
        DaggerComponents.builder().build().inject(this);
    }

    @Override
    protected void onBindDelegate() {


        mViewDelegate.setOnClickListener(v -> {
            switch (v.getId()) {
                case R.id.tv_h_w:
                    mViewDelegate.setViewText("你好，时间！");
                    break;
            }
        }, R.id.tv_h_w);


        mViewDelegate.setViewText(getString(R.string.app_name));


    }

    @Override
    protected void onUnbindDelegate() {

    }
}
