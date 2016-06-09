package com.jason.darthensonsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.f2prateek.dart.Dart;
import com.f2prateek.dart.HensonNavigable;

import butterknife.BindView;
import butterknife.ButterKnife;


@HensonNavigable
public class AnotherActivity extends AppCompatActivity {

    @BindView(R.id.tvName)
    TextView tvName;

    @BindView(R.id.tvAge)
    TextView tvAge;

    String name;
    int age;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        ButterKnife.bind(this);
        Dart.inject(this);
    }
}
