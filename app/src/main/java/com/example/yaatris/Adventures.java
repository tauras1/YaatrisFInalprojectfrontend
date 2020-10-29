package com.example.yaatris;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Adventures#newInstance} factory method to
 * create an instance of this fragment.
 */

public class Adventures extends Fragment {

    private Button AdventureDetails;

    public Adventures() {
        // Required empty public constructor
    }

    public static Adventures newInstance() {
        Adventures fragment = new Adventures();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_adventures, container, false);
        AdventureDetails = (Button) v.findViewById(R.id.AdventureDetails);
        AdventureDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetails();
            }
        });
        return v;
    }
    public void openDetails(){
        Intent intent = new Intent(getActivity(), AdventureDetails.class);
        startActivity(intent);
    }
}