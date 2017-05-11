package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NavigationMenuFragment extends Fragment {

    public NavigationMenuFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup navigationMenu, Bundle savedInstanceState) {
        final View navigationMenuView = inflater.inflate(R.layout.navigation_menu, navigationMenu, false);
        //ImageView library = ButterKnife.findById(navigationMenuView, R.id.library);

        View home = navigationMenuView.findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link DiningActivity}
                Intent homeIntent = new Intent(getContext(), MainActivity.class);

                // Start the new activity
                startActivity(homeIntent);
            }
        });


        View library = navigationMenuView.findViewById(R.id.library);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link DiningActivity}
                Intent libraryIntent = new Intent(getContext(), LibraryActivity.class);

                // Start the new activity
                startActivity(libraryIntent);
            }
        });

        View search = navigationMenuView.findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link DiningActivity}
                Intent searchIntent = new Intent(getContext(), SearchActivity.class);

                // Start the new activity
                startActivity(searchIntent);
            }
        });

        return navigationMenuView;
    }

}