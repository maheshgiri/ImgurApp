package developergroup.app.imgurapp.adaptors;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import developergroup.app.imgurapp.R;
import developergroup.app.imgurapp.pojos.Comment;

public class CommentAdaptor extends RecyclerView.Adapter<CommentAdaptor.CommentViewHolder>{


    List<Comment> commentList;


    public CommentAdaptor(List<Comment> commentList) {
        this.commentList = commentList;
    }

    @NonNull
    @Override
    public CommentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new CommentViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.viewholder_comment,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CommentViewHolder commentViewHolder, int i) {

        commentViewHolder.txtv_author.setText(""+commentList.get(i).getAuthor());
        commentViewHolder.txtv_comment.setText(""+commentList.get(i).getComment());

    }

    @Override
    public int getItemCount() {
        return commentList.size();
    }

    static class CommentViewHolder extends RecyclerView.ViewHolder{

        private TextView txtv_author,txtv_comment;

        public CommentViewHolder(@NonNull View itemView) {
            super(itemView);
            txtv_author=itemView.findViewById(R.id.txtv_author);
            txtv_comment=itemView.findViewById(R.id.txtv_comment);

        }
    }
}
