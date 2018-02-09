package com.qinshou.emojidemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Description:
 * Created by 禽兽先生
 * Created on 2018/2/9
 */

public class EmojiAdapter extends RecyclerView.Adapter<EmojiAdapter.MyViewHolder> {
    private List<EmojiEntity> emojiEntityList;

    public EmojiAdapter(List<EmojiEntity> emojiEntityList) {
        this.emojiEntityList = emojiEntityList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_emoji, parent, false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tvName.setText(emojiEntityList.get(position).getName());
        holder.tvEmoji.setText(emojiEntityList.get(position).getUnicode());
    }

    @Override
    public int getItemCount() {
        return emojiEntityList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvEmoji;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
            tvEmoji = itemView.findViewById(R.id.tv_emoji);
        }
    }
}
