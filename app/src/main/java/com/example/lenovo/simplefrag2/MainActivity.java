package com.example.lenovo.simplefrag2;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void addFrag(View view) {
        BlankFragment blankFragment= new BlankFragment();
        getSupportFragmentManager().beginTransaction().addToBackStack(null).
                add(R.id.frameLay, blankFragment).commit();

    }

    public void removeFrag(View view) {
        Fragment blankFragment=getSupportFragmentManager().findFragmentById(R.id.frameLay);
        if (blankFragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .remove(blankFragment).commit();
        }
    }
}
