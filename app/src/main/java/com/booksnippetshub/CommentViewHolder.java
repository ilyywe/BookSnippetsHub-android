package com.booksnippetshub;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.facebook.drawee.view.SimpleDraweeView;


public class CommentViewHolder extends RecyclerView.ViewHolder {

    SimpleDraweeView avatar;
    LinearLayout linearLayout;

    TextView nickname;
    TextView  commit;


    public CommentViewHolder(@NonNull View itemView) {
        super(itemView);

        avatar = itemView.findViewById(R.id.avatarview);
        nickname = itemView.findViewById(R.id.nickname);
        commit = itemView.findViewById(R.id.comment);

    }

    public SimpleDraweeView getAvatar() {
        return avatar;
    }

    public void setAvatar(SimpleDraweeView avatar) {
        this.avatar = avatar;
    }

    public TextView getNickname() {
        return nickname;
    }

    public void setNickname(TextView nickname) {
        this.nickname = nickname;
    }

    public TextView getCommit() {
        return commit;
    }

    public void setCommit(TextView commit) {
        this.commit = commit;
    }
}
