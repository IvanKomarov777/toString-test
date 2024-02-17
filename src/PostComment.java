import java.util.Arrays;
import java.util.ArrayList;


public class PostComment {
    private String text; // содержание комментария
    private String[] whoLiked; // кто поддержал


    public void setText(String text) {
        this.text = text;
    }

    public void setWhoLiked(String[] whoLiked) {
        this.whoLiked = whoLiked;
    }

    @Override
    public String toString() {
        String result = "PostComment={text='";
        if(whoLiked != null){
            result = result + text + "', whoLiked=" + Arrays.toString(whoLiked) + "\n";
        } else {
            result = result + text + "', whoLiked=null"  + "\n";
        }
        return result;
    }


}