package entities;

public class Comment {
    public String text;

    public Comment(){}
    public Comment(String text){
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public String getText(){
        return text;
    }
}
