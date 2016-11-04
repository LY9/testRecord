package com.ly9.diary.record;

import android.content.Context;
import android.provider.Settings;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * @author bingolv
 * @Description:
 * @date 2016/11/4 17:05
 * @copyright HAWK
 */

public class MyReAdapter extends RecyclerView.Adapter<MyReAdapter.MyHolder>{
    private Context context;
    public MyReAdapter(Context context){
        this.context=context;
    }
    @Override
    public MyReAdapter.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(context).inflate(R.layout.re_item_1,parent,false);
        MyHolder myHolder = new MyHolder(v);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.textMid.setText("大爷");
    }


    @Override
    public int getItemCount() {
        return 10000000;
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
