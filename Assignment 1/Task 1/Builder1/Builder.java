package Builder1;

import Control.Controller;
import Display.Display;
import Identification.Identification;
import InternetConnection.InternetConnection;
import Microprocessor.Microprocessor;
import Package_Product.Package;
import Storage.Storage;
import WebServer.WebServer;

public class Builder implements TicketingSystemBuilder {
    TicketingSystem system = new TicketingSystem();

    @Override
    public void buildInternet(InternetConnection net) {
        system.setInternetConnection(net);
    }

    @Override
    public void buildController(Controller controller) {
        system.setController(controller);
    }

    @Override
    public void buildDisplay(Display display) {
        system.setDisplay(display);
    }

    @Override
    public void buildIdentification(Identification identification) {
        system.setIdentification(identification);
    }

    @Override
    public void buildMicroprocessor(Microprocessor microprocessor) {
       system.setMicroprocessor(microprocessor);
    }

    @Override
    public void buildStorage(Storage storage) {
        system.setStorage(storage);
    }

    @Override
    public void buildWeb(WebServer web) {
        system.setWebServer(web);
    }
    public TicketingSystem getsystem()
    {
        return system;
    }
    
}
