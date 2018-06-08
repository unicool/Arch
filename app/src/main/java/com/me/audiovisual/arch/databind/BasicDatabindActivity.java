package com.me.audiovisual.arch.databind;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.me.audiovisual.arch.model.IModel;
import com.me.audiovisual.arch.presenter.BasicPresenterActivity;
import com.me.audiovisual.arch.view.IDelegate;

/**
 * 集成数据-视图绑定的Activity基类(Presenter层)
 *
 * @param <T> View delegate class type
 */
public abstract class BasicDatabindActivity<T extends IDelegate> extends BasicPresenterActivity {

    protected DataBinder<IDelegate, IModel> mBinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinder = getDataBinder();
    }

    public abstract DataBinder<IDelegate, IModel> getDataBinder();

    public <D extends IModel> void notifyModelChanged(D data) {
        if (mViewDelegate == null) {
            return;
        }
        if (mBinder == null) {
            mBinder = getDataBinder();
        }
        mBinder.viewBindModel(mViewDelegate, data);
    }
}
