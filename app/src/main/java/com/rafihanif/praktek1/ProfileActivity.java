package com.rafihanif.praktek1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.rafihanif.praktek1.models.Profile;

public class ProfileActivity extends AppCompatActivity {

    Profile profile = MainActivity.profile;

    EditText txtNama;
//    Button btnTampil;
    TextView txtTampil, txtTampilNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        txtNama = findViewById(R.id.editTextNama);
        txtTampil = findViewById(R.id.textViewTampil);
        txtTampilNama = findViewById(R.id.textViewTampilNama);

        if(profile.getNama() != null){
            TampilkanNama();
        }
    }

    public void TampilkanNama(){
        String txtT = "Nama anda:";
        txtTampil.setText(txtT);
        txtTampilNama.setText(profile.getNama());
    }

    public void TampilClicked(View view){
        String stringNama = txtNama.getText().toString();
        profile.setNama(stringNama);
        TampilkanNama();
    }
}
