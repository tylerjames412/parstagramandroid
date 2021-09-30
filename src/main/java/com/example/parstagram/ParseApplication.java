package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();


        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("KzxmtezMf9n7n13Ni5oSA2CrTrjacGilsYv7QF1j")
                .clientKey("6u5WiUkeQN3O3h01dsbxoFfHMd4pD07AScJYrWfK")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
