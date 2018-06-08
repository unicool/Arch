package com.me.audiovisual.business.home;

import android.support.annotation.LayoutRes;
import android.widget.TextView;

import com.me.audiovisual.R;
import com.me.audiovisual.arch.view.BasicDelegate;
import com.me.audiovisual.util.binding.Bind;

public class HomeDelegate extends BasicDelegate implements IHomeContract.View {

    @Bind(R.id.tv_h_w)
    private TextView tv_h_w;

    @Override
    @LayoutRes
    public int getRootLayoutId() {
        return R.layout.view_home;
    }

    @Override
    public void initWidget() {

    }

    @Override
    public void setViewText(String text) {
        tv_h_w.setText(text);
    }
}
