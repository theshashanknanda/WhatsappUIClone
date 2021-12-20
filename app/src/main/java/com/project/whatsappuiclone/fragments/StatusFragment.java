package com.project.whatsappuiclone.fragments;

import android.os.Bundle;
import android.os.StatFs;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.project.whatsappuiclone.R;
import com.project.whatsappuiclone.adapters.StatusAdapter;
import com.project.whatsappuiclone.databinding.StatusFragmentBinding;
import com.project.whatsappuiclone.models.StatusModel;

import java.util.ArrayList;
import java.util.List;

public class StatusFragment extends Fragment {
    private List<StatusModel> modelList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        StatusFragmentBinding binding = StatusFragmentBinding.inflate(getLayoutInflater());

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        modelList = new ArrayList<>();
        modelList.add(new StatusModel("Steve", R.drawable.avatar6, "Today, 10:44"));
        modelList.add(new StatusModel("Jobs", R.drawable.avatar2, "Today, 12:36"));
        modelList.add(new StatusModel("Thomas", R.drawable.avatar3, "Today, 16:54"));
        modelList.add(new StatusModel("Broddy", R.drawable.avatar4, "Yesterday, 18:15"));
        modelList.add(new StatusModel("Amantha", R.drawable.avatar5, "Yesterday, 21:08"));

        StatusAdapter adapter = new StatusAdapter(modelList, getContext());
        binding.recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.recyclerView3.setAdapter(adapter);

        return binding.getRoot();
    }
}
