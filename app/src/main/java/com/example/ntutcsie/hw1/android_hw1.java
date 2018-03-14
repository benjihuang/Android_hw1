package com.example.ntutcsie.hw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import java.text.NumberFormat;
import android.widget.Button;
import android.widget.TextView;


public class android_hw1 extends AppCompatActivity{
    EditText Sex;
    EditText Age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_hw1);
        Age = (EditText)findViewById(R.id.editText2);
        Sex = (EditText)findViewById(R.id.editText);
        final TextView Output = (TextView)findViewById(R.id.textView3);
        Button submit = (Button)findViewById(R.id.button); // 取得按鈕物件

        // 按下按鈕 觸發事件
        submit.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {

                if ( !("".equals(Age.getText().toString())
                        || "".equals(Sex.getText().toString())) )
                {
                    float fAge = Float.parseFloat(Age.getEditableText().toString());
                    if("male".equals(Sex.getEditableText().toString())){
                        if(fAge<30){
                            Output.setText("not hurry");
                        }else if(fAge>35){
                            Output.setText("find couple");
                        }else{
                            Output.setText("get marry");
                        }
                    }else if("female".equals(Sex.getEditableText().toString())){
                        if(fAge<28){
                            Output.setText("not hurry");
                        }else if(fAge>32){
                            Output.setText("find couple");
                        }else{
                            Output.setText("get marry");
                        }
                    }else{
                        Output.setText("輸入錯誤");
                    }
                }else {
                    Output.setText("尚未輸入資料");
                }


            }
        });
    }


}