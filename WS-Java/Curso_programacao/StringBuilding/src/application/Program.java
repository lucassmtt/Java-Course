package application;

import entities.Comment;
import entities.Post;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many comments will you make: ");
        int number_of_posts = input.nextInt();
        List<Post> postList = new ArrayList<>();

        for (int x = 0; x < number_of_posts; x++) {
            System.out.println("Post " + (x + 1) + ": ");
            System.out.println(LocalDateTime.now());
            input.nextLine();
            System.out.print("Title: ");
            String title = input.nextLine();

            System.out.print("Content: ");
            String content = input.nextLine();

            Post newPost = new Post();

            System.out.print("Likes: ");
            Integer likes = input.nextInt();
            newPost = new Post(LocalDateTime.now(), title, content, likes);
            postList.add(newPost);

            System.out.print("How many comments will be in the post? ");
            int number_of_comments = input.nextInt();
            input.nextLine();
            for (int i = 0; i < number_of_comments; i++){
                System.out.print("Text " + i + ": ");
                String text = input.nextLine();

                Comment comment = new Comment(text);
                newPost.addComent(comment);
            }
        }

        for (Post p : postList){
            System.out.println(p);
        }

        input.close();
    }
}