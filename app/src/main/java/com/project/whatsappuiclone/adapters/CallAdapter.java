package com.project.whatsappuiclone.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.whatsappuiclone.R;
import com.project.whatsappuiclone.activities.CallerInfo;
import com.project.whatsappuiclone.databinding.CallRowBinding;
import com.project.whatsappuiclone.models.CallModel;

import java.util.ArrayList;
import java.util.List;

public class CallAdapter extends RecyclerView.Adapter<CallAdapter.CallViewHolder> {
    public List<CallModel> modelList;
    public Context context;
    public List<Integer> photos;

    public CallAdapter(List<CallModel> modelList, Context context){
        this.modelList = modelList;
        this.context = context;

        photos = new ArrayList<>();
        photos.add(R.drawable.avatar10);
        photos.add(R.drawable.avatar2);
        photos.add(R.drawable.avatar3);
        photos.add(R.drawable.avatar4);
        photos.add(R.drawable.avatar5);
        photos.add(R.drawable.avatar6);
        photos.add(R.drawable.avatar7);
        photos.add(R.drawable.avatar8);
        photos.add(R.drawable.avatar9);
    }

    @NonNull
    @Override
    public CallAdapter.CallViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        CallRowBinding binding = CallRowBinding.inflate(inflater, parent, false);
        return new CallViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CallAdapter.CallViewHolder holder, int position) {
        CallModel model = modelList.get(position);

        holder.binding.setCallModel(model);
        holder.binding.img.setImageResource(photos.get(position));

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, CallerInfo.class);
            intent.putExtra("name", model.name);
            intent.putExtra("photo", photos.get(position));
            intent.putExtra("isIncoming", model.isIncoming);
            intent.putExtra("time", model.time);
            intent.putExtra("data", model.dataUsed);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class CallViewHolder extends RecyclerView.ViewHolder {
        public CallRowBinding binding;
        public CallViewHolder(@NonNull CallRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
