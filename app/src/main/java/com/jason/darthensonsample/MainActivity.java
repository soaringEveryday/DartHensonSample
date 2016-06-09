package com.jason.darthensonsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.name)    EditText name;
    @BindView(R.id.age)     EditText age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @OnClick({
            R.id.btnExtra,
            R.id.btnParcel,
            R.id.btnHenson
    })
    void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnExtra:
                startActivity(
                        Henson.with(this)
                                .gotoDetailActivity()
                                .age(Integer.parseInt(age.getText().toString()))
                                .name(name.getText().toString())
                                .build()
                );
                break;
            case R.id.btnParcel:
                User user = new User();
                user.setAge(Integer.parseInt(age.getText().toString()));
                user.setName(name.getText().toString());
                startActivity(
                        Henson.with(this)
                                .gotoDetailActivity()
                                .age(27)
                                .name("jason")
                                .user(user)
                                .build()
                );
                break;
            case R.id.btnHenson:
                break;
        }
    }
}
