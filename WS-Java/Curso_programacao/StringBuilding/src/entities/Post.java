package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {
    public LocalDateTime moment;
    public String title;
    public String content;
    public Integer likes;
    public List<Comment> comments = new ArrayList<>();

    public Post(){}
    public Post(LocalDateTime moment, String title, String content, Integer likes){
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void addComent(Comment comment){
        comments.add(comment);
    }

    public List<Comment> getComments() {
        return comments;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Title: ").append(title).append("\n");
        sb.append("Likes: ").append(likes).append("\n");
        sb.append("Moment: ").append(moment).append("\n");
        sb.append("Content: ").append(content).append("\n");
        sb.append("Comment: ");
        for (Comment c : comments){
            sb.append("'");
            sb.append(c.getText());
            sb.append("' ");
        }
        return sb.toString();
    }
}