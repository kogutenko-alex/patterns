package creationPatterns.abstractFactoryMethod;

import creationPatterns.abstractFactoryMethod.appClient.ClientApp;
import creationPatterns.abstractFactoryMethod.factories.GUIFactory;
import creationPatterns.abstractFactoryMethod.factories.UnixFactory;
import creationPatterns.abstractFactoryMethod.factories.WindowsFactory;

public class AbstFactoryMetodStart {
    private static ClientApp configureApplication() {
        ClientApp app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("linux")) {
            factory = new UnixFactory();
            app = new ClientApp(factory);
        } else {
            factory = new WindowsFactory();
            app = new ClientApp(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        ClientApp app = configureApplication();
        app.printInfo();
    }
}
