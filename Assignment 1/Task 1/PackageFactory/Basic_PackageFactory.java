package PackageFactory;

import Control.Controller;
import Control.SeparateController;
import Display.Display;
import Display.LCD;
import Identification.Identification;
import Identification.RFIC_card;
import Microprocessor.ATMega32;
import Microprocessor.Microprocessor;
import Storage.SD_card;
import Storage.Storage;

public  class Basic_PackageFactory extends PackageFactory {

    @Override
    public Controller createController() {
        return new SeparateController();
    }

    @Override
    public Display createDisplay() {
        return new LCD();
    }

    @Override
    public Identification createIdentification() {
        return new RFIC_card();
    }

    @Override
    public Microprocessor createMicroprocessor() {
        return new ATMega32();
    }

    @Override
    public Storage createStorage() {
        return new SD_card();
    }
    
    
}
