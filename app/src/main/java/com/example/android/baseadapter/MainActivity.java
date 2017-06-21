package com.example.android.baseadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView simpleGrid;
    int animals[] = {R.drawable.animal13, R.drawable.animal14, R.drawable.animal15, R.drawable.animal16,
            R.drawable.animal17, R.drawable.animal18, R.drawable.animal19, R.drawable.animal20, R.drawable.animal21,
            R.drawable.animal22, R.drawable.animal23, R.drawable.animal24,  R.drawable.animal25,  R.drawable.animal26,
            R.drawable.animal27,  R.drawable.animal28,  R.drawable.animal29,  R.drawable.animal30,
            R.drawable.animal31, R.drawable.animal32, R.drawable.animal33, R.drawable.animal34, R.drawable.animal35, R.drawable.animal36,
            R.drawable.animal37, R.drawable.animal38, R.drawable.animal39, R.drawable.animal40, R.drawable.animal41,
            R.drawable.animal42, R.drawable.animal43, R.drawable.animal44, R.drawable.animal45, R.drawable.animal46,
            R.drawable.animal47,R.drawable.animal48,R.drawable.animal49,R.drawable.animal50,R.drawable.animal51,R.drawable.animal52,
            R.drawable.animal53, R.drawable.animal54,R.drawable.animal55, R.drawable.animal56,R.drawable.animal57,R.drawable.animal58,
            R.drawable.animal59,R.drawable.animal60,R.drawable.animal61,R.drawable.animal62,R.drawable.animal63,R.drawable.animal64,
            R.drawable.animal65,R.drawable.animal66,R.drawable.animal67,R.drawable.animal68,R.drawable.animal69,R.drawable.animal70,
            R.drawable.animal71,R.drawable.animal72,R.drawable.animal73,R.drawable.animal74,R.drawable.animal75,R.drawable.animal76,
            R.drawable.animal77,R.drawable.animal78,R.drawable.animal79,R.drawable.animal80,R.drawable.animal81};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleGrid = (GridView) findViewById(R.id.simpleGridView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), animals);
        simpleGrid.setAdapter(customAdapter);
    }
}
