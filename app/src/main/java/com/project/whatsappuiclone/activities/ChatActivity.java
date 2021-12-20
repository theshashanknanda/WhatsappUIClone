package com.project.whatsappuiclone.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.project.whatsappuiclone.adapters.MessageAdapter;
import com.project.whatsappuiclone.databinding.ActivityChatBinding;
import com.project.whatsappuiclone.models.MessageModel;

import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends AppCompatActivity {
    private ActivityChatBinding binding;
    private List<MessageModel> modelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        modelList = new ArrayList<>();

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        String name = getIntent().getStringExtra("object");
        binding.userTV.setText(name);

        int photo = getIntent().getIntExtra("photo", 0);
        binding.circleImageView.setImageResource(photo);

        binding.recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        MessageAdapter adapter = new MessageAdapter(modelList, this);
        binding.recyclerView2.setAdapter(adapter);

        getSupportActionBar().hide();
        binding.backArrow.setOnClickListener(v -> {
            startActivity(new Intent(ChatActivity.this, MainActivity.class));
            finish();
        });

        binding.sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = binding.editText.getText().toString();

                if(!text.isEmpty()){
                    MessageModel messageModel1 = new MessageModel();
                    messageModel1.text = text;
                    messageModel1.id = "Sender";

                    MessageModel messageModel2 = new MessageModel();
                    messageModel2.text = text;
                    messageModel2.id = "reciever";

                    modelList.add(messageModel2);
                    modelList.add(messageModel1);
                    adapter.notifyDataSetChanged();

                    binding.recyclerView2.smoothScrollToPosition(adapter.getItemCount());
                    binding.editText.setText("");
                }
            }
        });
    }
}