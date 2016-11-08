package com.example.record;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;


/**
 * @author bingolv
 * @Description:
 * @date 2016/11/8 16:52
 * @copyright HAWK
 */

public class SplashView extends FrameLayout{

    private OnDismissListener mListener;
    public SplashView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.view_splash,this);
        ViewGroup.LayoutParams params=new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        setLayoutParams(params);

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
              mListener.dismiss();
            }
        },3000);

    }
    public void setOnDismissListener(OnDismissListener listener){
        mListener=listener;
    }

    public interface OnDismissListener{
        void dismiss();
    }
}
