package com.example.zhz256.user1;

import com.firebase.client.Firebase;

/**
 * Created by zhz256 on 5/18/2016.
 */
public class FirebaseContext extends android.app.Application {
    public void onCreate(){
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
