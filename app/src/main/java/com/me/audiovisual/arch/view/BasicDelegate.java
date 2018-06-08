package com.me.audiovisual.arch.view;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.widget.Toolbar;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

import com.me.audiovisual.util.binding.ViewBinder;

/**
 * 视图层代理的基类
 */
public abstract class BasicDelegate implements IDelegate {

    protected View mRootView;
    @Deprecated
    protected final SparseArray<View> mViews = new SparseArray<View>();


    @Override
    public final void create(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        mRootView = inflater.inflate(getRootLayoutId(), container, false);
        ViewBinder.bind(this, mRootView);
    }

    /*@Override
    public int getRootLayoutId() {
        return View.NO_ID;
    }*/

    @Override
    public final View getRootView() {
        return mRootView;
    }

    @Override
    public Toolbar getToolbar() {
        return null;
    }

    @Override
    public int getMenuRes() {
        return Menu.NONE;//
    }

    /*@Override
    public void initWidget() {
    }*/


    @Deprecated
    public View bindView(@IdRes int id) {
        View view = mViews.get(id);
        if (view == null) {
            view = mRootView.findViewById(id);
            mViews.put(id, view);
        }
        return view;
    }

    @Deprecated
    public View get(@IdRes int id) {
        return bindView(id);
    }

    @Deprecated
    public void setOnClickListener(View.OnClickListener listener, @IdRes int... ids) {
        for (int id : ids) {
            get(id).setOnClickListener(listener);
        }
    }
}
