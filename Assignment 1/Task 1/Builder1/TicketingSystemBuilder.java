package Builder1;

import Control.Controller;
import Display.Display;
import Identification.Identification;
import InternetConnection.InternetConnection;
import Microprocessor.Microprocessor;
import Package_Product.Package;
import Storage.Storage;
import WebServer.WebServer;

public interface TicketingSystemBuilder  {
    public void buildStorage(Storage storage);
    public void buildController(Controller controller);
    public void buildMicroprocessor(Microprocessor microprocessor);
    public void buildIdentification(Identification identification);
    public void buildDisplay(Display display);
    public void buildInternet(InternetConnection net);
    public void buildWeb(WebServer web);
    //public TicketingSystem getsystem();
}
