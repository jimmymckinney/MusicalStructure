package com.example.android.musicalstructure;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NowPlayingFragment extends Fragment {

    public NowPlayingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup nowPlaying, Bundle savedInstanceState) {
        View nowPlayingView = inflater.inflate(R.layout.now_playing, nowPlaying, false);

        return nowPlayingView;
    }

}
