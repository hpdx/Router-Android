package com.kronos.sample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by zhangyang on 16/7/16.
 */
public class TestActivity extends Activity {
    @BindView(R.id.testTv)
    TextView testTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);
        String name = getIntent().getStringExtra("string");
        testTv.setText(name);
    }
}
