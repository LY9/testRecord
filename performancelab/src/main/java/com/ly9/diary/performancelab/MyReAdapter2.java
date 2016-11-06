package com.ly9.diary.performancelab;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * @author bingolv
 * @Description:
 * @date 2016/11/4 17:05
 * @copyright HAWK
 */

public class MyReAdapter2 extends RecyclerView.Adapter<MyReAdapter2.MyHolder>{
    private Context context;
    public MyReAdapter2(Context context){
        this.context=context;
    }
    @Override
    public MyReAdapter2.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(context).inflate(R.layout.re_item_1,parent,false);
        MyHolder myHolder = new MyHolder(v);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.textMid.setText(String.valueOf(fab(position+1)));
    }
//    private static long fab(int n){
//        if(n==1||n==2){
//            return 1;
//        } else{
//            return fab(n-1)+fab(n-2);
//        }
//    }
    private static long fab(int n){
        long a=1,b=1;
        long s=0;
        if(n==1||n==2){
            return 1;
        }
        for(int i=2;i<n;i++){
            s=a+b;
            a=b;
            b=s;
        }
        return s;
    }
    @Override
    public int getItemCount() {
        return 10000;
    }

    public class MyHolder extends RecyclerView.ViewHolder{
        TextView textLeft;
        TextView textMid;
        TextView textRight;
        public MyHolder(View itemView) {
            super(itemView);
            textLeft=(TextView)itemView.findViewById(R.id.left);
            textMid=(TextView)itemView.findViewById(R.id.center);
            textRight=(TextView)itemView.findViewById(R.id.right);
        }
    }
}
