package com.project.roy.simple_lifehack.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.project.roy.simple_lifehack.MainActivity;
import com.project.roy.simple_lifehack.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SixthFragment extends Fragment {
    private android.support.design.widget.FloatingActionButton btnSixth;

    public SixthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sixth, container, false);
        btnSixth = (android.support.design.widget.FloatingActionButton) view.findViewById(R.id.btn_sixth_fragment);
        ((MainActivity)getActivity()).getSupportActionBar().setTitle("Last Tips");
        ((MainActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setHasOptionsMenu(true);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        btnSixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().
                        replace(R.id.frame_container,
                                new FifthFragment(),
                                FifthFragment.class.getSimpleName());
                getFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
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
