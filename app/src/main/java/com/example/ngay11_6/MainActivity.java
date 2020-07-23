package com.example.ngay11_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    TextView txt;
    EditText editInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView)findViewById(R.id.txt);
        editInfo = (EditText)findViewById(R.id.editInfo);
        ImageView imageView = new ImageView(this);

        imageView.setImageResource(R.drawable.hinh_anh_hot_girl_nu_sinh_de_thuong_cute_2020_29);
    }
    public void display(View v){
        txt.setText(editInfo.getText().toString());
        editInfo.setText("");
    }
}

