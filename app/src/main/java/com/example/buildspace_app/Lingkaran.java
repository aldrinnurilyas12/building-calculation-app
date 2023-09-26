package com.example.buildspace_app;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lingkaran extends AppCompatActivity {
    EditText konstanta, jari1, jari2;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        konstanta = findViewById(R.id.konstanta);
        jari1 = findViewById(R.id.jari1);
        jari2 = findViewById(R.id.jari2);
        hasil = findViewById(R.id.texthasil);

    }

    public void tombolhitung(View view) {
        String inputkonstanta = konstanta.getText().toString();
        String inputjari1 = jari1.getText().toString();
        String inputjari2 = jari2.getText().toString();

        if (TextUtils.isEmpty(inputkonstanta)) {
            konstanta.setError("Konstanta harus diisi dengan 3.14");
            konstanta.requestFocus();
        }else if (TextUtils.isEmpty(inputjari1)) {
            jari1.setError("Panjang harus diisi");
            jari1.requestFocus();
        }else if (TextUtils.isEmpty(inputjari2)) {
            jari2.setError("Lebar harus diisi");
            jari2.requestFocus();
        }else {
            Double nilaikonstanta = Double.parseDouble(inputkonstanta);
            Double nilaijari1 = Double.parseDouble(inputjari1);
            Double nilaijari2 = Double.parseDouble(inputjari2);
            Double hasilhitung = nilaikonstanta * (nilaijari1 * nilaijari2);
            hasil.setText(hasilhitung.toString());
        }
    }
}