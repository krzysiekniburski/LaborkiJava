package blog;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class Blog {
    private List<Note> notes = new ArrayList();
    private String title;
    public Blog(String title){
    this.title=title;
    }
    public void add(Note note)
    {
        notes.add(note);
    }
    public String toString()
    {
        return title+" \n\n"+notes;
    }
    public Note mostPopular()
    {
        if(notes.isEmpty()) return null;
        Note result = notes.get(0);
        for(Note note: notes)
        {
           int count = note.numberOfCOmments();
           if(count>result.numberOfCOmments())
           {
               result = note;
               
           }
        }
        return result;
    }
    public List<Note> mostPopulars()
    {
        return null;
    }
    public Comment lastComment()
    {
        List<Comment> allComments = new ArrayList();
        for(Note note: notes)
        {
           allComments.addAll(note.getComments()); 
        }
        Comment result = allComments.get(0);
        for(Comment comment : allComments)
        {
            LocalDate d1 = comment.getDate();
            LocalDate d2 = result.getDate();
            if(d1.isAfter(d2))
            {
                result=comment;
            }
        }
        return null;
    }
    public List<Comment> lastComments()
    {
        return null;
    }
}
