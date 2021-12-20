package com.project.whatsappuiclone.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;

import com.project.whatsappuiclone.R;
import com.project.whatsappuiclone.databinding.ActivityCallerInfoBinding;

public class CallerInfo extends AppCompatActivity {
    private ActivityCallerInfoBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCallerInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        getSupportActionBar().setTitle("Call Info");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String name = getIntent().getStringExtra("name");
        int photo = getIntent().getIntExtra("photo", 0);
        String isIncoming = getIntent().getStringExtra("isIncoming");
        String time = getIntent().getStringExtra("time");
        String data = getIntent().getStringExtra("data");

        if(isIncoming.equals("Incoming")){
            binding.arrow.setImageResource(R.drawable.ic_incoming_arrow);
        }
        else{
            binding.arrow.setImageResource(R.drawable.ic_outgoing_arrow);
        }

        binding.isIncoming.setText(isIncoming);
        binding.name.setText(name);
        binding.img.setImageResource(photo);
        binding.time.setText(time);
        binding.data.setText(data);
    }
}