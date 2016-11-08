package com.example.record;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.example.record.SplashView;

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
        mSplashView.setOnDismissListener();
        mRootView.addView(mSplashView);

    }
}
