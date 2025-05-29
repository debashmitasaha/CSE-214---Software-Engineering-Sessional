package InternetConnection;

public class Wifi implements InternetConnection {
    @Override
    public String getType() {
        return "Internet Connection: Wifi";
    }
    
}
