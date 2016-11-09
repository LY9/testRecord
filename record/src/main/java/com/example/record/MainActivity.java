package com.example.record;

import android.os.Bundle;
import android.widget.RelativeLayout;

import com.example.record.Splash.SplashView;

public class MainActivity extends BaseActivity {

    private RelativeLayout mRootView;
    private SplashView mSplashView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRootView = (RelativeLayout) findViewById(R.id.root_view);
        SplashView splashView = new SplashView(this);
        mSplashView = splashView;
        mSplashView.setOnDismissListener(new SplashView.OnDismissListener() {
            @Override
            public void dismiss() {
//                Drawable drawable= getWindow().getDecorView().getBackground();
                getWindow().getDecorView().setBackgroundResource(R.color.colorPrimary);
                mRootView.removeView(mSplashView);
            }
        });
        mRootView.addView(mSplashView);
//        //C,显示不了
//        System.out.print('I'+'T');
//        //lz可以显示
//        System.out.println('I'+'T');
    }
}
