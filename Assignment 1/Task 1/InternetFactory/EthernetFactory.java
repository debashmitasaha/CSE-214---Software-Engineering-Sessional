package InternetFactory;

import InternetConnection.Ethernet;
import InternetConnection.InternetConnection;

public class EthernetFactory extends Internetfactory {
    @Override
    public InternetConnection createInternet() {
        return new Ethernet();
    }
    
}
