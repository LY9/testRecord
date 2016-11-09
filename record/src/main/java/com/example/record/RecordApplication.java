package com.example.record;

import android.app.Application;
import android.content.Context;

/**
 * @author bingolv
 * @Description:
 * @date 2016/11/9 19:29
 * @copyright HAWK
 */

public class RecordApplication extends Application{

    private Context mAppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppContext=getApplicationContext();
    }
    public Context getmAppContext() {
        return mAppContext;
    }

}
