package PackageFactory;

import Control.Controller;
import Control.TouchScreenController;
import Display.Display;
import Display.OLED;
import Identification.Identification;
import Identification.NFC_card;
import Microprocessor.Microprocessor;
import Microprocessor.RaspberryPi;
import Storage.AttachedStorage;
import Storage.Storage;

public class Advanced_PackageFactory extends PackageFactory {

    @Override
    public Controller createController() {
        return new TouchScreenController();
    }

    @Override
    public Display createDisplay() {
        return new OLED();
    }

    @Override
    public Identification createIdentification() {
        return new NFC_card();
    }

    @Override
    public Microprocessor createMicroprocessor() {
        return new RaspberryPi();
    }

    @Override
    public Storage createStorage() {
        return new AttachedStorage();
    }
    
    
}
