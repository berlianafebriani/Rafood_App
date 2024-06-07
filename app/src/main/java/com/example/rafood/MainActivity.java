package com.example.rafood;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fragment(new ListProduk());
    }

    // fungsi untuk pindah halaman
    private void fragment (Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.mainFrame, fragment)
                .addToBackStack(null)
                .commit();
    }
}