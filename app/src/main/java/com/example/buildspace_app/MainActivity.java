package com.example.buildspace_app;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void panjang(View view) {
        final AlertDialog.Builder panjangalert = new AlertDialog.Builder(MainActivity.this);
        panjangalert.setMessage("Apakah anda yakin ingin menghitung luas Persegi Panjang?");
        panjangalert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                startActivity(new Intent(MainActivity.this, PersegiPanjang.class));
            }
        });
        panjangalert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        panjangalert.show();
    }

    public void bujur(View view) {
        final AlertDialog.Builder bujuralert = new AlertDialog.Builder(MainActivity.this);
        bujuralert.setMessage("Apakah anda yakin ingin menghitung luas Bujur sangkar?");
        bujuralert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                startActivity(new Intent(MainActivity.this, BujurSangkar.class));
            }
        });
        bujuralert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        bujuralert.show();
    }

    public void segitiga(View view) {
        final AlertDialog.Builder segitigaalert = new AlertDialog.Builder(MainActivity.this);
        segitigaalert.setMessage("Apakah anda yakin ingin menghitung luas Segitiga?");
        segitigaalert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                startActivity(new Intent(MainActivity.this, Segitiga.class));
            }
        });
        segitigaalert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        segitigaalert.show();
    }

    public void lingkaran(View view) {
        final AlertDialog.Builder lingkaranalert = new AlertDialog.Builder(MainActivity.this);
        lingkaranalert.setMessage("Apakah anda yakin ingin menghitung luas Lingkaran?");
        lingkaranalert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                startActivity(new Intent(MainActivity.this, Lingkaran.class));
            }
        });
        lingkaranalert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        lingkaranalert.show();
    }

    public void trapesium(View view) {
        final AlertDialog.Builder trapesiumalert = new AlertDialog.Builder(MainActivity.this);
        trapesiumalert.setMessage("Apakah anda yakin ingin menghitung luas Trapesium?");
        trapesiumalert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                startActivity(new Intent(MainActivity.this, Trapesium.class));
            }
        });
        trapesiumalert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        trapesiumalert.show();
    }

    public void jajar(View view) {
        final AlertDialog.Builder jajaralert = new AlertDialog.Builder(MainActivity.this);
        jajaralert.setMessage("Apakah anda yakin ingin menghitung luas Jajar Genjang?");
        jajaralert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                startActivity(new Intent(MainActivity.this, JajarGenjang.class));
            }
        });
        jajaralert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        jajaralert.show();
    }




    public void onBackPressed(){
        AlertDialog.Builder tombolkeluar = new AlertDialog.Builder(MainActivity.this);
        tombolkeluar.setMessage("Apakah anda yakin ingin keluar dari aplikasi ini?");
        tombolkeluar.setTitle("Keluar Aplikasi");
        tombolkeluar.setIcon(R.drawable.ic_baseline_error_outline_24);
        tombolkeluar.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.finish();
            }
        });
        tombolkeluar.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        tombolkeluar.setNeutralButton("Batal", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        tombolkeluar.show();
    }
}