package com.example.androiddesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.exit) ImageView exit;
    @BindView(R.id.notification) ImageView notification;
    @BindView(R.id.img_emp) ImageView img_emp;
    @BindView(R.id.img_time) ImageView img_time;
    @BindView(R.id.img_cal) ImageView img_cal;
    @BindView(R.id.img_setting) ImageView img_setting;
    @BindView(R.id.dashboard) ImageView dashboard;
    @BindView(R.id.flotadd) ImageView flotadd;

    @BindView(R.id.txt_name) TextView txt_name;
    @BindView(R.id.notification_text) TextView notification_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.flotadd) void Add(){

           notification_text.setText("1");

    }
    @OnClick(R.id.notification) void Sub(){

        notification_text.setText("0");

    }
    @OnClick({R.id.exit,R.id.img_emp,R.id.img_time,R.id.img_cal,R.id.img_setting}) void Show(){

        Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show();

    }
    @OnClick(R.id.dashboard) void Name(){

        if (txt_name.getText().toString().trim()=="Sourabh Kumar")
        {
            txt_name.setText("Ujjal Dutta");
        }
        else
        {
            txt_name.setText("Sourabh Kumar");
        }

    }

}