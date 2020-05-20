package org.kasapbasi.sharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences myPref= this.getSharedPreferences("org.kasapbasi.sharedpref", Context.MODE_PRIVATE);

       // myPref.edit().putString("username","mc").apply();

        ArrayList<String> myFriends= new ArrayList<>();
        myFriends.add("SELÇUK");
        myFriends.add("ESRA");


        String username= myPref.getString("username","");
        Log.d("PREF",username);
    }
}
