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


        createParams(1, 1f);


        gridLayout.addView(createTextViewRandom("Hello Hello111"), createParams(1, 1f));
        gridLayout.addView(createTextViewRandom("Hello Hello111"), createParams(1, 1f));
        gridLayout.addView(createTextViewRandom("Hello xxxxxxxxxxxx"), createParams(1, 1f));

        gridLayout.addView(createTextViewRandom("Hello Hello xxxxx"), createParams(2, 1f));
        gridLayout.addView(createTextViewRandom("Hello Hello"), createParams(1, 1f));

        gridLayout.addView(createTextViewRandom("Hello Hello"), createParams(2, 1f));

        gridLayout.addView(createTextViewRandom("Hello Hello"), createParams(2, 1f));

        gridLayout.addView(createTextViewRandom("Hello Hello"), createParams(3, 1f));

        gridLayout.addView(createTextViewRandom("Hello Hello"), createParams(2, 1f));
        gridLayout.addView(createTextViewRandom("Hello Hello"), createParams(1, 1f));

        gridLayout.addView(createTextViewRandom("Hello Hello"), createParams(1, 1f));
        gridLayout.addView(createTextViewRandom("Hello Hello"), createParams(2, 1f));

        gridLayout.addView(createTextViewRandom("Hello Hello yyyyyy"), createParams(1, 1f));
        gridLayout.addView(createTextViewRandom("Hello Hello"), createParams(1, 1f));
        gridLayout.addView(createTextViewRandom("Hello Hello"), createParams(1, 1f));
    }

    private GridLayout.LayoutParams createParams(int size, float weight) {
        GridLayout.LayoutParams params = new GridLayout.LayoutParams();

        params.columnSpec = GridLayout.spec(GridLayout.UNDEFINED, size, weight);
        params.rowSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f);
        return params;
    }

    private TextView createTextViewRandom(String text) {
        TextView textView = new TextView(this);
        textView.setText(text);
        textView.setWidth(0);
        return textView;
    }
}
