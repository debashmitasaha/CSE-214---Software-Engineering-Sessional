package InternetFactory;

import InternetConnection.InternetConnection;
import InternetConnection.Wifi;

public class WifiFactory extends Internetfactory {

    @Override
    public InternetConnection createInternet() {
        return new Wifi();
    }
    
    
}
