package com.example.himanshu.notely;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String t;

    private Button userName;

    private TextView editName;
    private EditText nameEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        userName = (Button) findViewById(R.id.userName);

        editName = (TextView)findViewById(R.id.editName);
        nameEditText = (EditText)findViewById(R.id.nameEditText);

        t = new String();
        t = "RESULT APP";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences sharedPreferences = this.getSharedPreferences("com.example.himanshu.notely", Context.MODE_PRIVATE );

        String username = sharedPreferences.getString("username","");

        if(username != "")
        {
            Log.i(t,"The username from preferences is -"+username);
            editName.setText("Hi "+username+"!");
        }

        userName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


}
