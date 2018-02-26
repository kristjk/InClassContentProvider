package com.example.notandi.inclasscontentprovider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonPressed(View view){
        Button button = (Button)view;
        Intent intent = null;
        if (button.getId() == R.id.btnContacts) {
            intent = new Intent(this, ContactsActivity.class);
            startActivity(intent);
        }
    }
}
