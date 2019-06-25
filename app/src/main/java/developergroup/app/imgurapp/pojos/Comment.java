package developergroup.app.imgurapp.pojos;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Comment implements Serializable{

    String id;
    String image_id;
    String comment;
    String author;
    String author_id;
    boolean on_album;
    String album_cover;
    int ups;
    int downs;
    int points;
    long datetime;
    int parent_id;
    boolean deleted;
    Object vote;
    String platform;
    @SerializedName("children")
    List<Comment> childerncommentlist;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage_id() {
        return image_id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }

    public boolean isOn_album() {
        return on_album;
    }

    public void setOn_album(boolean on_album) {
        this.on_album = on_album;
    }

    public String getAlbum_cover() {
        return album_cover;
    }

    public void setAlbum_cover(String album_cover) {
        this.album_cover = album_cover;
    }

    public int getUps() {
        return ups;
    }

    public void setUps(int ups) {
        this.ups = ups;
    }

    public int getDowns() {
        return downs;
    }

    public void setDowns(int downs) {
        this.downs = downs;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public long getDatetime() {
        return datetime;
    }

    public void setDatetime(long datetime) {
        this.datetime = datetime;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Object getVote() {
        return vote;
    }

    public void setVote(Object vote) {
        this.vote = vote;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public List<Comment> getChilderncommentlist() {
        return childerncommentlist;
    }

    public void setChilderncommentlist(List<Comment> childerncommentlist) {
        this.childerncommentlist = childerncommentlist;
    }
}
