package com.ly9.diary.performancelab;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button bn1;
    private Button bn2;
    private Button bn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView(){
        bn1=(Button)findViewById(R.id.bn1);
        bn1.setOnClickListener(this);
        bn2=(Button)findViewById(R.id.bn2);
        bn2.setOnClickListener(this);
        bn3=(Button)findViewById(R.id.bn3);
        bn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bn1:
                Intent intent1= new Intent(this,FibonacciRecursive.class);
                this.startActivity(intent1);
                break;
            case R.id.bn2:
                Intent intent2= new Intent(this,FibonacciUnRecursive.class);
                this.startActivity(intent2);
                break;
            case R.id.bn3:
                Intent intent3= new Intent(this,TwoAdapter.class);
                this.startActivity(intent3);
                break;
            default:
                break;
        }
    }
}

