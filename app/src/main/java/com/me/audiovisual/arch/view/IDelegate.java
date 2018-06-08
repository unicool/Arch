package com.me.audiovisual.arch.view;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.MenuRes;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 视图层代理的接口协议
 */
public interface IDelegate {

    void create(LayoutInflater inflater, ViewGroup container, Bundle bundle);

    @LayoutRes
    int getRootLayoutId();

    View getRootView();

    Toolbar getToolbar();

    @MenuRes
    int getMenuRes();

    void initWidget();
}
