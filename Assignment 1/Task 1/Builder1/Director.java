package Builder1;

import InternetFactory.Internetfactory;
import PackageFactory.PackageFactory;
import Package_Product.Package;
import WebServer.WebFactory;

public class Director {
    public Builder builder = new Builder();

    public Director(Builder builder)
    {
        this.builder = builder;
    }
    public void CreateSystem(PackageFactory pkg, Internetfactory net, WebFactory web)
    {
        builder.buildWeb(web.createWebServer());;
        builder.buildInternet(net.createInternet());
        builder.buildMicroprocessor(pkg.createMicroprocessor());
        builder.buildDisplay(pkg.createDisplay());
        builder.buildIdentification(pkg.createIdentification());
        builder.buildStorage(pkg.createStorage());
        builder.buildController(pkg.createController());
    }
}
