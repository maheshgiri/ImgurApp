package developergroup.app.imgurapp.pojos;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CommentsData {

    private int status;
    private String success;
    @SerializedName("data")
    private List<Comment> commentList;


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }
}
