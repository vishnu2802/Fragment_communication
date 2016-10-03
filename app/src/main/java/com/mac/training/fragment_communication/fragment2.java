package com.mac.training.fragment_communication;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class fragment2 extends Fragment {
    EditText txt2;
    Button but1;


    public fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_fragment2, container, false);
        but1 = (Button) v.findViewById(R.id.button3);
        txt2 = (EditText) v.findViewById(R.id.text2);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = txt2.getText().toString();
            }
        });

        return v;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txt2 = (EditText) getActivity().findViewById(R.id.text2);
    }
}
