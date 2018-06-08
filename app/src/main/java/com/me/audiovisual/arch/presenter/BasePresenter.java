package com.me.audiovisual.arch.presenter;

/**
 * activity用于创建view层(fragment)和presenter层(presenter)的一个控制器时使用。
 */
public interface BasePresenter<T> {

    //void start();

    void subscribe();

    // to use CompositeDisposable
    void unsubscribe();


    /**
     * Binds presenter with a view when resumed. The Presenter will perform initialization here.
     *
     * @param view the view associated with this presenter
     */
    void takeView(T view);

    /**
     * Drops the reference to the view when destroyed
     */
    void dropView();

}