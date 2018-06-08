package com.me.audiovisual.arch.view;

/**
 * activity用于创建view层(fragment)和presenter层(presenter)的一个控制器时使用。
 *
 * @param <T> a presenter
 */
public interface BaseView<T> {

    void setPresenter(T presenter);

}
