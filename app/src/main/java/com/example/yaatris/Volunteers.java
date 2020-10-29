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
 * Use the {@link Volunteers#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Volunteers extends Fragment {

    private Button VolunteerDetails;
    public Volunteers() {
        // Required empty public constructor
    }


    public static Volunteers newInstance() {
        Volunteers fragment = new Volunteers();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_volunteers, container, false);
        VolunteerDetails = (Button) v.findViewById(R.id.Volunteerdetails);
        VolunteerDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetails();
            }
        });
        return v;
    }
    public void openDetails(){
        Intent intent = new Intent(getActivity(), VolunteerDetails.class);
        startActivity(intent);
    }
}