package com.project.whatsappuiclone.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.whatsappuiclone.R;
import com.project.whatsappuiclone.activities.ChatActivity;
import com.project.whatsappuiclone.databinding.ChatRowBinding;
import com.project.whatsappuiclone.models.MessageModel;

import java.util.ArrayList;
import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatViewHolder> {
    public List<MessageModel> modelList;
    public List<Integer> photos;
    public Context context;

    public ChatAdapter(Context context, List<MessageModel> modelList){
        this.context = context;
        this.modelList = modelList;

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
    public ChatAdapter.ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        ChatRowBinding binding = ChatRowBinding.inflate(inflater, parent, false);

        return new ChatViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatAdapter.ChatViewHolder holder, int position) {
        MessageModel messageModel = modelList.get(position);
        holder.binding.setMessageModel(messageModel);
        holder.binding.img.setImageResource(photos.get(position));

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(context.getApplicationContext(), ChatActivity.class);
            intent.putExtra("object", messageModel.recieverName);
            intent.putExtra("photo", photos.get(position));
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ChatViewHolder extends RecyclerView.ViewHolder {
        public ChatRowBinding binding;

        public ChatViewHolder(@NonNull ChatRowBinding binding) {
            super(binding.getRoot());

            this.binding = binding;
        }
    }
}
