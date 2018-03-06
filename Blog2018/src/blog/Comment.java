package blog;
import java.time.*;
public class Comment {
    private String author, content;
    private LocalDate date;
    public Comment(String author, String content){
        this.author=author;
        this.content=content;
        this.date=LocalDate.now();
    }
    public String getAuthor(){
        return author;
    }
    public String getContent(){
        return content;
    }
}
