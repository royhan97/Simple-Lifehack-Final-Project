package com.project.roy.simple_lifehack.Fragment;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.project.roy.simple_lifehack.MainActivity;
import com.project.roy.simple_lifehack.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FifthFragment extends Fragment {

    private FloatingActionButton btnFifth;

    public FifthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fifth, container, false);
        btnFifth = (FloatingActionButton) view.findViewById(R.id.btn_fifth_fragment);
        ((MainActivity)getActivity()).getSupportActionBar().show();
        ((MainActivity)getActivity()).getSupportActionBar().setTitle("Fourth Tips");
        ((MainActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setHasOptionsMenu(true);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        btnFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().
                        replace(R.id.frame_container,
                                new SixthFragment(),
                                SixthFragment.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        });
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            getFragmentManager().popBackStack();
        }
        return super.onOptionsItemSelected(item);
    }

}