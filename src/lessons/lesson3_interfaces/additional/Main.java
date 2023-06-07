package lessons.lesson3_interfaces.additional;

import lombok.Data;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Post> posts = new ArrayList<>(); // 10

        ArrayList<Comment> comments = new ArrayList<>(); // 20

        for (Post post : posts) {
            for (Comment comment : comments) {
                if (comment.getPost_id() == post.getId()) {
                    post.getComments().add(comment);

                }
            }
        }


    }
}

@Data
class Post {
    private int id;
    private int user_id;
    private String title;
    private String body;

    private ArrayList<Comment> comments = new ArrayList<>();


}


@Data
class Comment {
    private int id;
    private int post_id;
    private String comment_title;
    private String email;
    private String text;

}


