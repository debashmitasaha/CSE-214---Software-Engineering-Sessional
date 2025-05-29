package InternetFactory;

import InternetConnection.GSM;
import InternetConnection.InternetConnection;

public class GSMFactory extends Internetfactory {
    @Override
    public InternetConnection createInternet() {
        return new GSM();
    }
    
}
