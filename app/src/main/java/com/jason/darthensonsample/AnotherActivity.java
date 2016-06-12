package com.jason.darthensonsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.f2prateek.dart.HensonNavigable;

import butterknife.BindView;
import butterknife.ButterKnife;


@HensonNavigable
public class AnotherActivity extends AppCompatActivity {

    @BindView(R.id.tvName)
    TextView tvName;

    @BindView(R.id.tvAge)
    TextView tvAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        ButterKnife.bind(this);
        Toast.makeText(AnotherActivity.this, "Navigated~", Toast.LENGTH_SHORT).show();
    }
}
