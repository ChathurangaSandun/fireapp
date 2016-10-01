package com.example.chathurangasandun.fireapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    Button addButton;
    private  Firebase mRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //*******************************************
        //this line again and again may some problem. so it is send to aplication file
        //Firebase.setAndroidContext(this);
        //*******************************************



        mRef = new Firebase("https://fireapp-34cd4.firebaseio.com/");


        addButton = (Button) findViewById(R.id.button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Firebase mRefChild = mRef.child("Name");
                mRefChild.setValue("Chathuraddddeddnga");
            }
        });

    }
}
