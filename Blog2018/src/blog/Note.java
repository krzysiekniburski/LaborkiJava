package blog;
import java.time.LocalDate;
import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
public class Note {
    private String title, content;
    private List<Comment> comments = new ArrayList();
    public Note(String title, String content)
    {
    this.title=title;
    this.content=content;
    }
    public void add(Comment comment){
        comments.add(comment);
    }

    public List<Comment> getComments() {
        return comments;
    }
    
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Wpis\n");
        sb.append("\n\ntytul: "+title);
        sb.append("\ntresc: "+content);
        sb.append("\nkomentarze: "+comments);
        sb.append("/n");
        return sb.toString();
    }
    public int numberOfCOmments() {
       return comments.size();
    }
    
    public static void main(String[] args) {
        Blog blog = new Blog("Blog programistyczny");
        Note note1 = new Note("co nowego - java 9","co nowego - java 9");
        Note note2 = new Note("Kolekcje","kolekcje");
        Note note3 = new Note("JavaFX", "JavaFX");
        blog.add(note3);
        blog.add(note2);
        blog.add(note1);
        Comment c1 = new Comment("Rafal","Kolekcje sa trudne");
        note2.add(c1);
        Comment c2 = new Comment("Krzysztof","Kolekcje sa latwe");
        note2.add(c2);
        System.out.println(blog);
        System.out.println("-------");
        System.out.println(blog.mostPopular());
        System.out.println("-------");
        LocalDate d1= LocalDate.of(2018,Month.MARCH,1);
        LocalDate d2= LocalDate.of(2018,Month.FEBRUARY,2);
        long u = d1.until(d2,ChronoUnit.DAYS);
        System.out.println(u);
        long u2 = d2.until(d1,ChronoUnit.DAYS);
        System.out.println(u2);
        System.out.println("-------");
        System.out.println(blog.lastComment());
        
    }

    
    
}
