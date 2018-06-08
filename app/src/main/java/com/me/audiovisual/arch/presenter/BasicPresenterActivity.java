package com.me.audiovisual.arch.presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import com.me.audiovisual.arch.view.IDelegate;

/**
 * Presenter base class for Activity
 * Presenter层的实现基类
 *
 * @param <T> View delegate class type
 */
public abstract class BasicPresenterActivity<T extends IDelegate> extends AppCompatActivity {

    protected T mViewDelegate;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            mViewDelegate = getDelegateClasss().newInstance();
            mViewDelegate.create(getLayoutInflater(), null, savedInstanceState);
            setContentView(mViewDelegate.getRootView());
            mViewDelegate.initWidget();
            onBindDelegate();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }

    protected abstract Class<T> getDelegateClasss();

    protected abstract void onBindDelegate();

    @Override
    protected final void onDestroy() {
        onUnbindDelegate();
        mViewDelegate = null;
        super.onDestroy();
    }

    protected abstract void onUnbindDelegate();

    @Override
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (mViewDelegate.getMenuRes() != Menu.NONE) {
            getMenuInflater().inflate(mViewDelegate.getMenuRes(), menu);
            return true;//super.onCreateOptionsMenu(menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected final void onRestart() {
        super.onRestart();
        //
    }

    @Override
    protected final void onStart() {
        super.onStart();
        //
    }

    @Override
    protected final void onStop() {
        //
        super.onStop();
    }

    @Override
    protected final void onResume() {
        super.onResume();
        //
    }

    @Override
    protected final void onPause() {
        //
        super.onPause();
    }

    @Override
    protected final void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //
    }

    @Override
    protected final void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        //
    }
}
