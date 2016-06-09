package com.jason.darthensonsample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.f2prateek.dart.Dart;
import com.f2prateek.dart.InjectExtra;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {
    @InjectExtra
    String name = "default name";

    @InjectExtra
    int age = 0;

    @Nullable
    @InjectExtra
    User user;

    @BindView(R.id.tvName)
    TextView tvName;

    @BindView(R.id.tvAge)
    TextView tvAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);
        Dart.inject(this);
        initView();
    }

    private void initView() {
        if (user != null) {
            tvName.setText(user.getName());
            tvAge.setText(String.valueOf(user.getAge()));
        } else {
            tvName.setText(name);
            tvAge.setText(String.valueOf(age));
        }
    }
}
