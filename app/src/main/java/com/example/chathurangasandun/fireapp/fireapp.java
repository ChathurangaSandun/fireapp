package com.example.chathurangasandun.fireapp;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Chathuranga.Sandun on 01/10/2016.
 */
public class fireapp extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        // this for create for make firebase instance as a one instance
        Firebase.setAndroidContext(this);
    }
}

