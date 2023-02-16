package com.pbm.praktikumpbma;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSimpan;
        EditText etNama, etNim, etJurusan;


        btnSimpan = findViewById(R.id.button_simpan);
        etNama = findViewById(R.id.et_nama);
        etNim = findViewById(R.id.et_nim);
        etJurusan = findViewById(R.id.et_jurusan);



        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dashbord = new Intent(MainActivity.this, DashboardActivity.class);
                dashbord.putExtra("nama", etNama.getText().toString());
                dashbord.putExtra("nim", etNim.getText().toString());
                dashbord.putExtra("jurusan", etJurusan.getText().toString());
                startActivity(dashbord);
            }
        });


    }
}