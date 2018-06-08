package com.me.audiovisual.arch.model.local;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface Enum {

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({Body.unknown})
    @interface Body {
        int unknown = -1;
    }

}
