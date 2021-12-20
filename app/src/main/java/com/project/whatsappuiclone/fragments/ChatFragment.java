package com.project.whatsappuiclone.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.project.whatsappuiclone.R;
import com.project.whatsappuiclone.adapters.ChatAdapter;
import com.project.whatsappuiclone.databinding.ChatFragmentBinding;
import com.project.whatsappuiclone.models.MessageModel;

import java.util.ArrayList;
import java.util.List;

public class ChatFragment extends Fragment {
    private List<MessageModel> modelList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ChatFragmentBinding binding = ChatFragmentBinding.inflate(getLayoutInflater());
        modelList = new ArrayList<>();

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        modelList.add(new MessageModel("James", R.drawable.avatar10, "Today"));
        modelList.add(new MessageModel("Steve", R.drawable.avatar2, "Today"));
        modelList.add(new MessageModel("Bill", R.drawable.avatar3, "Today"));
        modelList.add(new MessageModel("Elon", R.drawable.avatar4, "Yesterday"));
        modelList.add(new MessageModel("Zuck", R.drawable.avatar5, "Yesterday"));
        modelList.add(new MessageModel("Gary", R.drawable.avatar6, "Yesterday"));
        modelList.add(new MessageModel("Ash", R.drawable.avatar7, "Yesterday"));
        modelList.add(new MessageModel("Robert", R.drawable.avatar8, "Yesterday"));
        modelList.add(new MessageModel("Amar", R.drawable.avatar9, "Yesterday"));

        ChatAdapter adapter = new ChatAdapter(getContext(), modelList);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.recyclerView.setAdapter(adapter);

        return binding.getRoot();
    }
}
