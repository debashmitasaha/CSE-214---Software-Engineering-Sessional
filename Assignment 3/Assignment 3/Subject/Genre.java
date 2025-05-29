package Subject;
import Observer_Classes.User;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public  class Genre implements Desiflix {
    protected List<User> Subscribers= new ArrayList<>();
    protected List<String> MovieList= new ArrayList<>();
    protected String GenreName;
    public Genre(String name) {
        this.GenreName = name;
    }

    @Override
    public void AddSubscriber(User user) {
        this.Subscribers.add(user);
    }

    @Override
    public void RemoveSubscriber(User user) {
        this.Subscribers.remove(user);
    }

    @Override
    public void MovieRelease(String movieName) {
        MovieList.add(movieName);
        this.sendnotification(movieName);
    }
    public void sendnotification(String movieName )
    {
        
        String genre = this.GenreName;
        for (User observer : Subscribers) {
        Thread notificationThread = new Thread(new Runnable() {
            @Override
            public void run() {
                observer.update(movieName, genre); 
            }
        });

        // Start the thread
        notificationThread.start();
        }
    }
    
}

