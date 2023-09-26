package com.example.buildspace_app;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Trapesium extends AppCompatActivity {
    EditText alas1,alas2, tinggi;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapesium);
        alas1 = findViewById(R.id.alas1);
        alas2 = findViewById(R.id.alas2);
        tinggi = findViewById(R.id.tinggi);
        hasil = findViewById(R.id.texthasil);

    }

    public void tombolhitung(View view) {
        String inputalas1 = alas1.getText().toString();
        String inputalas2 = alas2.getText().toString();
        String inputtinggi = tinggi.getText().toString();

        if (TextUtils.isEmpty(inputalas1)) {
            alas1.setError("Alas a harus diisi");
            alas1.requestFocus();
        }else if (TextUtils.isEmpty(inputalas2)) {
            alas2.setError("Alas b harus diisi");
            alas2.requestFocus();
        }else if (TextUtils.isEmpty(inputtinggi)) {
            tinggi.setError("Tinggi harus diisi");
            tinggi.requestFocus();
        }else {
            Double nilaialas1 = Double.parseDouble(inputalas1);
            Double nilaialas2 = Double.parseDouble(inputalas2);
            Double nilaitinggi = Double.parseDouble(inputtinggi);
            Double hasilhitung = 0.5 * (nilaialas1 + nilaialas2 ) * nilaitinggi ;
            hasil.setText(hasilhitung.toString());
        }
    }
}