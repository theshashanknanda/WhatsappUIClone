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
import com.project.whatsappuiclone.adapters.CallAdapter;
import com.project.whatsappuiclone.databinding.CallsFragmentBinding;
import com.project.whatsappuiclone.models.CallModel;

import java.util.ArrayList;
import java.util.List;

public class CallsFragment extends Fragment {
    public List<CallModel> modelList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        CallsFragmentBinding binding = CallsFragmentBinding.inflate(inflater);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        modelList = new ArrayList<>();
        modelList.add(new CallModel("Steve", R.drawable.avatar1, "Incoming", "Today, 10:44", "10 KB"));
        modelList.add(new CallModel("Thomas", R.drawable.avatar1, "Outgoing", "Today, 12:36", "12 KB"));
        modelList.add(new CallModel("Amar", R.drawable.avatar1, "Incoming", "Today, 15:02", "16 KB"));
        modelList.add(new CallModel("Bill", R.drawable.avatar1, "Outgoing", "Yesterday, 18:06", "34 KB"));
        modelList.add(new CallModel("Jobs", R.drawable.avatar1, "Incoming", "Yesterday, 22:30", "44 KB"));


        binding.recyclerView4.setLayoutManager(new LinearLayoutManager(getContext()));
        CallAdapter adapter = new CallAdapter(modelList, getContext());
        binding.recyclerView4.setAdapter(adapter);

        return binding.getRoot();
    }
}
