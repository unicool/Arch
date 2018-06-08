package com.me.audiovisual.arch.presenter;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.me.audiovisual.arch.view.IDelegate;

import javax.inject.Inject;

/**
 * Presenter base class for Fragment
 * Presenter层的实现基类
 *
 * @param <T> View delegate class type
 */
public abstract class BasicPresenterFragment<T extends IDelegate> extends Fragment {

    @Inject
    protected T mViewDelegate;

    @Nullable
    @Override
    public final View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        injectDependence();
        mViewDelegate.create(inflater, container, savedInstanceState);
        return mViewDelegate.getRootView();
    }

    protected abstract void injectDependence();

    @Override
    public final void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewDelegate.initWidget();
        onBindDelegate();
    }

    protected abstract void onBindDelegate();

    @Override
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        if (mViewDelegate.getMenuRes() != Menu.NONE) {
            inflater.inflate(mViewDelegate.getMenuRes(), menu);
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        //
    }

    @Override
    public final void onResume() {
        super.onResume();
        //
    }

    @Override
    public final void onPause() {
        //
        super.onPause();
    }

    @Override
    public final void onStop() {
        //
        super.onStop();
    }

    @Override
    public final void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        //
    }

    @Override
    public final void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        //
    }

    @Override
    public final void onDestroyView() {
        //
        onUnbindDelegate();
        super.onDestroyView();
    }

    protected abstract void onUnbindDelegate();
}
