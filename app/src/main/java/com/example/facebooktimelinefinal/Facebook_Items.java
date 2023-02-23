package com.example.facebooktimelinefinal;

public class Facebook_Items {
    public String User_Title, Time, Post_text, Like_count, Like, comment, share;
    public int like_image, post_icon, user_icon;

    public Facebook_Items(String user_Title, String time, String post_text, String like_count, String like, String comment, String share, int like_image, int post_icon, int user_icon) {
        User_Title = user_Title;
        Time = time;
        Post_text = post_text;
        Like_count = like_count;
        Like = like;
        this.comment = comment;
        this.share = share;
        this.like_image = like_image;
        this.post_icon = post_icon;
        this.user_icon = user_icon;
    }

    public String getUser_Title() {
        return User_Title;
    }

    public void setUser_Title(String user_Title) {
        User_Title = user_Title;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getPost_text() {
        return Post_text;
    }

    public void setPost_text(String post_text) {
        Post_text = post_text;
    }

    public String getLike_count() {
        return Like_count;
    }

    public void setLike_count(String like_count) {
        Like_count = like_count;
    }

    public String getLike() {
        return Like;
    }

    public void setLike(String like) {
        Like = like;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public int getLike_image() {
        return like_image;
    }

    public void setLike_image(int like_image) {
        this.like_image = like_image;
    }

    public int getPost_icon() {
        return post_icon;
    }

    public void setPost_icon(int post_icon) {
        this.post_icon = post_icon;
    }

    public int getUser_icon() {
        return user_icon;
    }

    public void setUser_icon(int user_icon) {
        this.user_icon = user_icon;
    }
}
