package com.example.record.Splash;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.example.record.R;


/**
 * @author bingolv
 * @Description:
 * @date 2016/11/8 16:52
 * @copyright HAWK
 */

public class SplashView extends FrameLayout implements SplashHelper.Listener{

    private OnDismissListener mListener;
    private ImageView mSplashImg;
    public SplashView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.view_splash,this);
        ViewGroup.LayoutParams params=new ViewGroup.LayoutParams(WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT);
        setLayoutParams(params);
        mSplashImg=(ImageView)findViewById(R.id.splash_img);
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
              mListener.dismiss();
            }
        },3000);

    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        //// TODO: 2016/11/9 内存泄漏
        SplashHelper.getInstance(getContext()).addListener(this);

    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SplashHelper.getInstance(getContext()).removeListener();
    }

    public void setOnDismissListener(OnDismissListener listener){
        mListener=listener;
    }

    @Override
    public void loadDrawable() {
        Drawable drawable=SplashHelper.getInstance(getContext()).getmDrawable();
        if(drawable!=null){
            mSplashImg.setImageDrawable(drawable);
        }
    }

    public interface OnDismissListener{
        void dismiss();
    }
}
