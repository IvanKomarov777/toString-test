import java.util.ArrayList;
import java.util.Arrays;

public class Post {
    private String title; // заголовок
    private String content; // содержание
    private String[] tags; // теги
    private ArrayList<PostComment> comments; //комментарии

    PostComment postComment = new PostComment();


    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public void setComments(ArrayList<PostComment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        String result = "{title='" + title + ", content.length='";
        if(content != null) {
            result = result + content.length();
        } else {
            result = result + "null";
        }
        result = result + ", tags=" + Arrays.toString(tags) + "," + "\n" +  "comments=[";

        for(PostComment comment : comments) {

            result = result + postComment.toString();
        }

        result = result + "]}";
        return result;
    }

}