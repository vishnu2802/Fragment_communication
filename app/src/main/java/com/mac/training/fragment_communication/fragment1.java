package com.mac.training.fragment_communication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class fragment1 extends Fragment {
    EditText txt;
    Button but;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=  inflater.inflate(R.layout.fragment_fragment1, container, false);
        but = (Button) v.findViewById(R.id.button2);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = txt.getText().toString();
            }
        });

        return v;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }

    public interface Listner {

        void Listner(String name);
    }

    public interface change{
        void change(String data);
    }
}
