package com.ly9.diary.performancelab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class TwoAdapter extends AppCompatActivity implements View.OnClickListener {
    Button bnRecur;
    Button bnUnRecur;
    Button bnChangeView;
    RecyclerView mRecycler;
    RecyclerView mRecycler2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_adapter);
        initView();
        mRecycler.setLayoutManager(new LinearLayoutManager(this));
        mRecycler.setAdapter(new MyReAdapter(this));
    }

    private void initView(){
        bnRecur=(Button)findViewById(R.id.bnRecur);
        bnRecur.setOnClickListener(this);
        bnUnRecur=(Button)findViewById(R.id.bnUnRecur);
        bnUnRecur.setOnClickListener(this);
        bnChangeView=(Button)findViewById(R.id.bnChangeView);
        bnChangeView.setOnClickListener(this);
        mRecycler=(RecyclerView)findViewById(R.id.recycler_1);
        mRecycler2=(RecyclerView)findViewById(R.id.recycler_2);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bnRecur:
                mRecycler.setAdapter(new MyReAdapter(this));
                break;
            case R.id.bnUnRecur:
                mRecycler.setAdapter(new MyReAdapter2(this));
                break;
            case R.id.bnChangeView:
                if(mRecycler.getVisibility()==View.VISIBLE){
                    mRecycler.setVisibility(View.GONE);
                    mRecycler2.setVisibility(View.VISIBLE);
                    mRecycler2.setLayoutManager(new LinearLayoutManager(this));
                    mRecycler2.setAdapter(new MyReAdapter2(this));
                }else{
                    mRecycler2.setVisibility(View.GONE);
                    mRecycler.setVisibility(View.VISIBLE);
                    mRecycler.setLayoutManager(new LinearLayoutManager(this));
                    mRecycler.setAdapter(new MyReAdapter(this));
                }
                break;
            default:
                break;
        }
    }
}
