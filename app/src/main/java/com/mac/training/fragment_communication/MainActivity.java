package com.mac.training.fragment_communication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements fragment1.Listner, fragment1.change{
    fragment1 f1;
    fragment2 f2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f1 = new fragment1();
        f2 = new fragment2();

        getSupportFragmentManager().beginTransaction().add(R.id.myconatiner, f1 ).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.mycontainer, f2).commit();
    }

    @Override
    public void Listner(String name) {
        f2.txt2.setText(name);
    }

    @Override
    public void change(String data) {
        f1.txt.setText(data);
    }
}
