package Observer_Classes;

public class Users implements User {
    String name;
    public Users(String name)
    {
        this.name = name;
    }
    public void update(String movieName, String genre)
    {
        System.out.println("Notification to " + name + ": New " + genre + " movie uploaded: " + movieName);
    
    }
}
