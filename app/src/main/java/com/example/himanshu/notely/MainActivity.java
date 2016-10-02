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

    private Button muserName;
    private Button mloginButton;
    private Button mNoteButton;

    private TextView editName;
    private EditText nameEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        muserName = (Button) findViewById(R.id.userName);
        mloginButton = (Button) findViewById(R.id.loginButton);
        mNoteButton = (Button) findViewById(R.id.noteButton);

        editName = (TextView)findViewById(R.id.editName);
        nameEditText = (EditText)findViewById(R.id.nameEditText);

        t = new String();
        t = "RESULT APP";

        final SharedPreferences sharedPreferences = this.getSharedPreferences("com.example.himanshu.notely", Context.MODE_PRIVATE );

        String username = sharedPreferences.getString("username","");

        if(username != "")
        {
            Log.i(t,"The username from preferences is -"+username);
            editName.setText("Hi "+username+"!");
        }
        else
        {
            Log.i(t,"EMPTY USERAME");
        }

        muserName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Log.i(t,"inside on click");
                String s = nameEditText.getText().toString();
                if(s.equals("Enter name")==false)
                {
                    Log.i(t,"string inside name edit - "+s);
                    sharedPreferences.edit().putString("username",s).apply();
                    editName.setText("Hi "+s+"!");
                }


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
