package com.project.whatsappuiclone.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.whatsappuiclone.activities.StatusActivity;
import com.project.whatsappuiclone.databinding.StatusRowBinding;
import com.project.whatsappuiclone.models.StatusModel;

import java.util.List;

public class StatusAdapter extends RecyclerView.Adapter<StatusAdapter.StatusViewHolder> {
    public List<StatusModel> modelList;
    public Context context;

    public StatusAdapter(List<StatusModel> modelList, Context context){
        this.context = context;
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public StatusAdapter.StatusViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        StatusRowBinding binding = StatusRowBinding.inflate(inflater, parent, false);

        return new StatusViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull StatusAdapter.StatusViewHolder holder, int position) {
        StatusModel model = modelList.get(position);
        holder.binding.setStatusModel(model);
        holder.binding.person.setImageResource(model.photo);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showStatus();
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class StatusViewHolder extends RecyclerView.ViewHolder {
        public StatusRowBinding binding;
        public StatusViewHolder(@NonNull StatusRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    public void showStatus(){
        context.startActivity(new Intent(context.getApplicationContext(), StatusActivity.class));
    }
}
