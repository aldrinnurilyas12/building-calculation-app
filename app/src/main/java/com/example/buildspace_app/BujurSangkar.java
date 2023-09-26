package com.example.buildspace_app;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BujurSangkar extends AppCompatActivity {

    EditText sisi1, sisi2;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bujur_sangkar);
        sisi1 = findViewById(R.id.sisi1);
        sisi2 = findViewById(R.id.sisi2);
        hasil = findViewById(R.id.texthasil);

    }

    public void tombolhitung(View view) {
        String inputsisi1 = sisi1.getText().toString();
        String inputsisi2 = sisi2.getText().toString();

        if (TextUtils.isEmpty(inputsisi1)) {
            sisi1.setError("Sisi harus diisi");
            sisi1.requestFocus();
        }else if (TextUtils.isEmpty(inputsisi2)) {
            sisi2.setError("Sisi  harus diisi");
            sisi2.requestFocus();
        }else {
            Double nilaisisi1 = Double.parseDouble(inputsisi1);
            Double nilaisisi2 = Double.parseDouble(inputsisi2);
            Double hasilhitung = nilaisisi1 * nilaisisi2;
            hasil.setText(hasilhitung.toString());
        }
    }
}