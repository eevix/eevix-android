package com.eevix.android.common.util;

import android.util.Log;

public class Logger {
    private String mTag = null;

    public static Logger get(String tag) {
        return new Logger(tag);
    }

    private Logger(String tag) {
        mTag = tag;
    }

    public void d(String log) {
        Log.d(mTag, log);
    }

    public void e(String log) {
        Log.e(mTag, log);
    }

    public void v(String log) {
        Log.v(mTag, log);
    }

    public void w(String log) {
        Log.v(mTag, log);
    }
}
