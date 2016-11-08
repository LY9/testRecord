package com.example.record;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout mRootView;
    private SplashView mSplashView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRootView=(RelativeLayout)findViewById(R.id.root_view);
        SplashView splashView=new SplashView(this);
        mSplashView=splashView;
        mSplashView.setOnDismissListener(new SplashView.OnDismissListener() {
            @Override
            public void dismiss() {
//                Drawable drawable= getWindow().getDecorView().getBackground();
                getWindow().getDecorView().setBackgroundResource(R.color.colorPrimary);
                mRootView.removeView(mSplashView);
            }
        });
        mRootView.addView(mSplashView);

    }
}
