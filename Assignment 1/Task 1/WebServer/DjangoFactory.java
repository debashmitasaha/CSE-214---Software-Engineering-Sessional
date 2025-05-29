package WebServer;

public class DjangoFactory extends WebFactory {
    @Override
    public WebServer createWebServer() {
        return new Django();
    }
 
}
