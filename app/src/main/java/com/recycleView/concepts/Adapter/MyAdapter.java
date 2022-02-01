package com.recycleView.concepts.Adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.recycleView.concepts.R;

/**
 * This class creates the rows and maps the item in each row
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ItemMyViewHolder> {
    private static final String TAG = MyAdapter.class.getSimpleName();
    int count=0;

    @NonNull
    @Override
    public ItemMyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder: "+count++);
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.row_item,parent,false);
        //Create a instance of ItemViewHolder.
        ItemMyViewHolder itemMyViewHolder=new ItemMyViewHolder(view);
        return itemMyViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemMyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class ItemMyViewHolder extends RecyclerView.ViewHolder {
        /**
         * This ItemMyViewHolder class is responsible for managinf the rows.
         * Keeps the Track of all Views Present in the RecycleView.(In this example ImageView,TextView,TextView)
         */
        ImageView imageView;
        TextView textView_name;
        TextView textView_count;

        public ItemMyViewHolder(@NonNull View itemView) {
            super(itemView);
            /**
             * Here itemView represent the row.
             */
            imageView=itemView.findViewById(R.id.imageView);
            textView_name=itemView.findViewById(R.id.textView_name);
            textView_count=itemView.findViewById(R.id.textView_count);
        }
    }
}


