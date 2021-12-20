package com.project.whatsappuiclone.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.whatsappuiclone.databinding.RecieverRowBinding;
import com.project.whatsappuiclone.databinding.SenderRowBinding;
import com.project.whatsappuiclone.models.MessageModel;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter {
    public int SENDER_VIEW_TYPE = 1;
    public int RECIEVER_VIEW_TYPE = 2;

    public List<MessageModel> modelList;
    public Context context;

    public MessageAdapter(List<MessageModel> modelList, Context context){
        this.modelList = modelList;
        this.context = context;
    }

    @Override
    public int getItemViewType(int position) {
        if(modelList.get(position).id.equals("reciever")){
            return SENDER_VIEW_TYPE;
        }
        else{
            return RECIEVER_VIEW_TYPE;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType == SENDER_VIEW_TYPE){
            LayoutInflater inflater = LayoutInflater.from(context);
            SenderRowBinding binding = SenderRowBinding.inflate(inflater, parent, false);

            return new SenderViewHolder(binding);
        }
        else{
            LayoutInflater inflater = LayoutInflater.from(context);
            RecieverRowBinding binding = RecieverRowBinding.inflate(inflater);

            return new RecieverViewHolder(binding);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MessageModel messageModel = modelList.get(position);

        if(holder.getClass() == SenderViewHolder.class){
            ((SenderViewHolder)holder).binding.senderTV.setText(messageModel.text);
        }else {
            ((RecieverViewHolder)holder).binding.recieverTV.setText(messageModel.text);
        }
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class SenderViewHolder extends RecyclerView.ViewHolder{
        public SenderRowBinding binding;
        public SenderViewHolder(@NonNull SenderRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    public class RecieverViewHolder extends RecyclerView.ViewHolder{
        public RecieverRowBinding binding;
        public RecieverViewHolder(@NonNull RecieverRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
