package PackageFactory;

import Control.Controller;
import Control.SeparateController;
import Display.Display;
import Display.LED;
import Identification.Identification;
import Identification.RFIC_card;
import Microprocessor.ArduinoMega;
import Microprocessor.Microprocessor;
import Storage.SD_card;
import Storage.Storage;

public class StandardPackageFactory extends PackageFactory {

    @Override
    public Controller createController() {
        return new SeparateController() ;
    }

    @Override
    public Display createDisplay() {
        return new LED();
    }

    @Override
    public Identification createIdentification() {
        return new RFIC_card();
    }

    @Override
    public Microprocessor createMicroprocessor() {
        return new ArduinoMega();
    }

    @Override
    public Storage createStorage() {
        return new SD_card();
    }
    
    
}
