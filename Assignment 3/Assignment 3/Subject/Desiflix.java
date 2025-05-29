package Subject;

import Observer_Classes.User;

public interface Desiflix {

    void AddSubscriber(User user);

    void RemoveSubscriber(User user);

    void sendnotification(String movieName);

    void MovieRelease(String movieName);
}