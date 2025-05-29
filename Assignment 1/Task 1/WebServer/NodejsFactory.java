package WebServer;

public class NodejsFactory extends WebFactory {
    @Override
    public WebServer createWebServer() {
        return new Nodejs();
    }
 
}
