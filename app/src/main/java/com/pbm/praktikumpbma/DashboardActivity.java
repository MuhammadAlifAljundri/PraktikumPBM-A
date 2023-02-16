package com.pbm.praktikumpbma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        TextView tvhasilnama, tvhasilnim, tvhasiljurusan;

        String nama = getIntent().getExtras().getString("nama");
        String nim = getIntent().getExtras().getString("nim");
        String jurusan = getIntent().getExtras().getString("jurusan");

        tvhasilnama = findViewById(R.id.tv_nama);
        tvhasilnim = findViewById(R.id.tv_nim);
        tvhasiljurusan = findViewById(R.id.tv_jurusan);

        tvhasilnama.setText("nama : " + nama);
        tvhasilnim.setText("nim : " +nim);
        tvhasiljurusan.setText("jurusan : "+ jurusan);
    }
}