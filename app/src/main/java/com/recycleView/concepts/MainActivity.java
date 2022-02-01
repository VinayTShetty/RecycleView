package com.recycleView.concepts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.recycleView.concepts.Adapter.MyAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intializeViews();
        initiallizeRecycleViews();
    }

    private void initiallizeRecycleViews() {
        /**
         *   1)Initialize adapter.
         *   2)Set layuout manager for RecycleView.
         *   3)Set adapter for RecycleView.
         */
        myAdapter=new MyAdapter();
        /**
         * This below logic can be removed by adding the layout manager directly in the XML file for the RecycleView i.e
         * app:layoutManager="androidx.recyclerview.widget.LinearLayoutManager"
         * If we are adding the above Tag,No need of defining it in the java files like below
         */
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);
    }

    private void intializeViews() {
        recyclerView=(RecyclerView) findViewById(R.id.recycleview_id);
    }

}