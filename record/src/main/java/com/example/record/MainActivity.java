package com.example.record;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.example.record.Splash.SplashView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private ViewGroup mRootView;
    private SplashView mSplashView;
    private Button mLoadButton;
    private ListView mFileList;
    private List<String> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        initSplash();
        mLoadButton=(Button)findViewById(R.id.btn_load);
        mLoadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                load();
            }
        });
        mFileList=(ListView)findViewById(R.id.file_lv);
        mList=new ArrayList<>();
        mFileList.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, mList));
    }

    private void initSplash(){
        mRootView = (LinearLayout) findViewById(R.id.root_view);
        SplashView splashView = new SplashView(this);
        mSplashView = splashView;
        mSplashView.setOnDismissListener(new SplashView.OnDismissListener() {
            @Override
            public void dismiss() {
                Drawable drawable= getWindow().getDecorView().getBackground();
                //获取drawable对象是Drawable的哪一个实现类
//                Log.e(drawable.getClass().getSimpleName(),"----------------------");
                getWindow().getDecorView().setBackgroundResource(R.color.colorPrimary);
                mRootView.removeView(mSplashView);
            }
        });
        mRootView.addView(mSplashView);
    }

    private void load(){
        File themeFolder = new File(Environment.getExternalStorageDirectory(), "TLauncherPro/ThemeStore/WallPaper/");
        if(!themeFolder.exists()){
            Log.e("Bingo","file not exist");
        }
        mList.clear();
    }
}


//        //C,显示不了
//        System.out.print('I'+'T');
//        //lz可以显示
//        System.out.println('I'+'T');
