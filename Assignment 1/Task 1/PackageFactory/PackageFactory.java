package PackageFactory;

import Control.Controller;

import Display.Display;
import Identification.Identification;
import Microprocessor.Microprocessor;
import Storage.Storage;

public abstract class PackageFactory {
    public abstract Microprocessor createMicroprocessor();
    public abstract Display createDisplay();
    public abstract Storage createStorage();
    public abstract Controller createController();
    public abstract Identification createIdentification();
    
}
