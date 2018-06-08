package com.me.audiovisual.arch.model.storage.db;

public final class DbMgr {
    private static final DbMgr ourInstance = new DbMgr();

    public static DbMgr getInstance() {
        return ourInstance;
    }

    private DbMgr() {
    }
}
