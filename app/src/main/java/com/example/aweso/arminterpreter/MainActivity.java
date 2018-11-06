package com.example.aweso.arminterpreter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ARMap.lookupInstruction("ADD").display();
    }

    public void registersButtonPressed(View v)
    {
        Intent i = new Intent(this, RegisterScreen.class);
        this.startActivity(i);
    }

    public void memoryButtonPressed(View v)
    {
        for(int i = 0; i < ARMap.registers.length; i++)
        {
            String output = ARMap.registers[i];
            System.out.println(output);
        }
    }
}
