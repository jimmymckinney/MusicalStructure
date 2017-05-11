package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.now_playing, new NowPlayingFragment())
                .commit();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.navigation_menu, new NavigationMenuFragment())
                .commit();
    }

}
