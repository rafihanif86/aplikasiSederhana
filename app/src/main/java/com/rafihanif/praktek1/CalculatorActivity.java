package com.rafihanif.praktek1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    EditText txtAngka1, txtAngka2;
    TextView txtHasilAngka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        txtAngka1 = findViewById(R.id.editTextAngka1);
        txtAngka2 = findViewById(R.id.editTextAngka2);
        txtHasilAngka = findViewById(R.id.textViewHasilAngka);
    }

    public float convertToInt(EditText e){
        return Float.parseFloat(e.getText().toString());
    }

    public void tampilHasil(String op){
        float angka1 = convertToInt(txtAngka1);
        float angka2 = convertToInt(txtAngka2);
        float hasil;

        if(op.equalsIgnoreCase("+")){
            hasil = angka1 + angka2;
        }else if(op.equalsIgnoreCase("-")){
            hasil = angka1 - angka2;
        }else if(op.equalsIgnoreCase("*")){
            hasil = angka1 * angka2;
        }else if(op.equalsIgnoreCase("/")){
            hasil = angka1 / angka2;
        }else{
           hasil = 0;
        }
        txtHasilAngka.setText(String.valueOf(hasil));
    }

    public void tambahClicked(View view){
        tampilHasil("+");
    }

    public void kurangClicked(View view){
        tampilHasil("-");
    }

    public void kaliClicked(View view){
        tampilHasil("*");
    }

    public void bagiClicked(View view){
        tampilHasil("/");
    }

    public void hapusClicked(View view){
        tampilHasil(" ");
    }
}
