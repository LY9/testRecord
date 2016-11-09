package com.example.record;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * @author bingolv
 * @Description:
 * @date 2016/11/8 14:00
 * @copyright HAWK
 */

public class BaseActivity extends Activity{

    public BaseActivity() {
        super();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Activity","----------------onCreate-----------");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Activity","----------------onStart-----------");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Activity","----------------onRestart-----------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity","----------------onResume-----------");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Activity","----------------onPause-----------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Activity","----------------onStop-----------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity","----------------onDestroy-----------");
    }

    @Override
    public void finish() {
        super.finish();
        Log.i("Activity","----------------onDestroy-----------");
    }

}
