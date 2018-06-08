package com.me.audiovisual.arch.databind;

import android.content.Context;

import com.me.audiovisual.arch.model.IModel;
import com.me.audiovisual.arch.presenter.BasicPresenterFragment;
import com.me.audiovisual.arch.view.IDelegate;

/**
 * 集成数据-视图绑定的Fragment基类(Presenter层)
 *
 * @param <T> View delegate class type
 */
public abstract class BasicDatabindFragment<T extends IDelegate> extends BasicPresenterFragment {

    protected DataBinder<IDelegate, IModel> mBinder;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
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
