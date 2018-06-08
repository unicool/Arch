package com.me.audiovisual.arch.dagger2;

import com.me.audiovisual.business.home.HomeFragment;

import dagger.Component;

@Component(modules = HomeModule.class)
public interface Components {

    void inject(HomeFragment target);
}
