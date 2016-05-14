package com.bibidha.quickdip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;// This was added by Android Studio automatically

//Copy Right www.bibidha.com
// This is a comment
/* This is also
a
comment. Note two different styles
Created on 13 May 2016
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main); this command has been commented out

        int x = 3; //All statements must end with semicolon
        String name = "JD"; // Coding convention variables start with small letters and classes wth Capital
        //Example name myName are variables and MyFullName is a class
        x = x * 17;// white spaces do not matter

        TextView myTextView = new TextView(this);//Standard code for displaying outputs
        myTextView.setText("The answer of lesson 1 Quick Dip is   =  "+x);// more code
        setContentView(myTextView);//Last line .. these allow us to see the output on the emulator
        
        //now compile and run the code on emulator
    }
}
