package com.rafihanif.praktek1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rafihanif.praktek1.models.Profile;

public class MainActivity extends AppCompatActivity {

    static Profile profile = new Profile();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void profileClicked(View view){
        Intent i = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(i);
    }

    public void calculatorClicked(View view){
        Intent i = new Intent(MainActivity.this, CalculatorActivity.class);
        startActivity(i);
    }

    public void negaraClicked(View view){
        Intent i = new Intent(MainActivity.this, NegaraActivity.class);
        startActivity(i);
    }
}
