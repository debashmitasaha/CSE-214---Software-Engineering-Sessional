package Builder1;

import Control.Controller;
import Display.Display;
import Identification.Identification;
import InternetConnection.InternetConnection;
import Microprocessor.Microprocessor;
import WebServer.WebServer;
import Package_Product.Package;
import Storage.Storage;

public class TicketingSystem {
    private Storage storage;
    private Display display;
    private Identification identification;
    private Microprocessor microprocessor;
    private Controller controller;
    private WebServer web;
    private InternetConnection net;

    // Setter method for Storage
    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    // Setter method for Display
    public void setDisplay(Display display) {
        this.display = display;
    }

    // Setter method for Identification
    public void setIdentification(Identification identification) {
        this.identification = identification;
    }

    // Setter method for Microprocessor
    public void setMicroprocessor(Microprocessor microprocessor) {
        this.microprocessor = microprocessor;
    }

    // Setter method for Controller
    public void setController(Controller controller) {
        this.controller = controller;
    }

    // Setter method for WebServer
    public void setWebServer(WebServer web) {
        this.web = web;
    }

    // Setter method for InternetConnection
    public void setInternetConnection(InternetConnection net) {
        this.net = net;
    }
    
    @Override
    public String toString() {
        String str = new String();
        str = microprocessor.getType() +'\n' + display.getType() + '\n' + identification.getType() +'\n' + storage.getType()+'\n'+ controller.getType()+'\n'+ web.getType()+'\n'+net.getType();
        return str;
    }
}
