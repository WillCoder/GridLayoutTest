package com.will.studio.gridlayout;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private GridLayout gridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridLayout = (GridLayout) findViewById(R.id.gl_gridlayout);


        createParams(1);


        gridLayout.addView(createTextViewRandom(), createParams(1));
        gridLayout.addView(createTextViewRandom(), createParams(1));
        gridLayout.addView(createTextViewRandom(), createParams(1));

        gridLayout.addView(createTextViewRandom(), createParams(2));
        gridLayout.addView(createTextViewRandom(), createParams(1));

        gridLayout.addView(createTextViewRandom(), createParams(2));

        gridLayout.addView(createTextViewRandom(), createParams(2));

        gridLayout.addView(createTextViewRandom(), createParams(3));

        gridLayout.addView(createTextViewRandom(), createParams(2));
        gridLayout.addView(createTextViewRandom(), createParams(1));

        gridLayout.addView(createTextViewRandom(), createParams(1));
        gridLayout.addView(createTextViewRandom(), createParams(2));

        gridLayout.addView(createTextViewRandom(), createParams(1));
        gridLayout.addView(createTextViewRandom(), createParams(1));
        gridLayout.addView(createTextViewRandom(), createParams(1));
    }

    private GridLayout.LayoutParams createParams(int size) {
        GridLayout.LayoutParams params = new GridLayout.LayoutParams();

        params.columnSpec = GridLayout.spec(GridLayout.UNDEFINED, size, 1f);
        params.rowSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f);
        return params;
    }

    private TextView createTextViewRandom() {
        TextView textView = new TextView(this);
        textView.setText("Hello");
        return textView;
    }
}
