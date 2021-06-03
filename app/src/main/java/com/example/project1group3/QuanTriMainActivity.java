package com.example.project1group3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.project1group3.fragmentAdmin.FragmentDanhSachLop;
import com.example.project1group3.fragmentAdmin.FragmentGiangVien;
import com.example.project1group3.fragmentAdmin.FragmentInfoQuanTri;
import com.example.project1group3.fragmentAdmin.FragmentVietThongBao;
import com.example.project1group3.fragmentAdmin.FragmentXemDiemDanh;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class QuanTriMainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quan_tri_main);

        bottomNavigationView = findViewById(R.id.QuanTriNavigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.action_XemLop:
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentQuanTri, new FragmentDanhSachLop()).commit();
                    break;
                case R.id.action_GiangVien:
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentQuanTri, new FragmentGiangVien()).commit();
                    break;
                case R.id.action_XemDiemDanh:
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentQuanTri, new FragmentXemDiemDanh()).commit();
                    break;
                case R.id.action_ThongBao:
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentQuanTri, new FragmentVietThongBao()).commit();
                    break;
                case R.id.action_CaNhan:
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentQuanTri, new FragmentInfoQuanTri()).commit();
                    break;

            }
            return true;
        });
    }
}