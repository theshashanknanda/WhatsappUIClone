package com.project.whatsappuiclone.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.project.whatsappuiclone.databinding.ActivityStatusBinding;

public class StatusActivity extends AppCompatActivity {
    private ActivityStatusBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStatusBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        getSupportActionBar().hide();

        binding.progressBar.setProgressTintList(ColorStateList.valueOf(Color.WHITE));
        binding.progressBar.setMax(100);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++)
                {
                    binding.progressBar.setProgress(i);
                    try {
                        Thread.sleep(25);
                    }catch (Exception e){

                    }
                }

                finish();
            }
        });
        thread.start();

        binding.statusLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    finish();
                }catch (Exception e){

                }
            }
        });
    }
}