package com.example.record.Splash;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import com.example.record.R;

/**
 * @author bingolv
 * @Description:
 * @date 2016/11/9 16:58
 * @copyright HAWK
 */

public class SplashHelper {
    private HandlerThread mHandlerThread;
    private Handler mWorkHandler;
    private Handler mMainHandler;
    private static SplashHelper mSplashHelper;
    private Listener mListener;
    private Context mContext;

    public Drawable getmDrawable() {
        return mDrawable;
    }

    private Drawable mDrawable;

    private SplashHelper(Context context){
        mContext=context.getApplicationContext();
        init();
    }
    private void init(){
        mHandlerThread=new HandlerThread("load_splash_drawable", Process.THREAD_PRIORITY_BACKGROUND);
        mHandlerThread.start();
        mWorkHandler=new Handler(mHandlerThread.getLooper());
        //更新UI的handler
        mMainHandler=new Handler(Looper.getMainLooper());
        mWorkHandler.post(new Runnable() {
            @Override
            public void run() {
//                Drawable drawable= Resources.getSystem().getDrawable(R.drawable.splash);
                Drawable drawable=mContext.getResources().getDrawable(R.drawable.splash);
                mDrawable=drawable;
                mMainHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        mListener.loadDrawable();
                    }
                });
            }
        });

    }
    public static SplashHelper getInstance(Context context){
        if(mSplashHelper==null){
            mSplashHelper=new SplashHelper(context);
        }
        return mSplashHelper;
    }

    public void addListener(Listener listener){
        mListener=listener;
    }
    public void removeListener(){
        mListener=null;
    }

     public interface Listener{
        void loadDrawable();
    }
}
