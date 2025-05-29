package WebServer;

public class RubyFactory extends WebFactory {
    @Override
    public WebServer createWebServer() {
        return new Ruby();
    }
 
    
}
