package com.me.audiovisual.arch.model;

public final class DataMgr implements IModel {
    private static final DataMgr ourInstance = new DataMgr();

    public static DataMgr get() {
        return ourInstance;
    }

    private DataMgr() {
    }
}
