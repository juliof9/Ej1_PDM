package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txt1;
    private EditText user;
    private EditText pass;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = (TextView) findViewById(R.id.txt1);
        user = (EditText) findViewById(R.id.user);
        pass = (EditText) findViewById(R.id.pass);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(clickListener);
        btn1.setOnLongClickListener(clickListener2);
    }

    private View.OnClickListener clickListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            txt1.setText(user.getText());
        };
    };

    private View.OnLongClickListener clickListener2 = new View.OnLongClickListener(){
        @Override
        public boolean onLongClick(View view){
            txt1.setText(pass.getText());
            return true;
        };
    };

}
