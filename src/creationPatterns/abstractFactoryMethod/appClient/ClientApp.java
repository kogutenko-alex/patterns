package creationPatterns.abstractFactoryMethod.appClient;

import creationPatterns.abstractFactoryMethod.buttons.Button;
import creationPatterns.abstractFactoryMethod.checkboxes.Checkbox;
import creationPatterns.abstractFactoryMethod.factories.GUIFactory;

public class ClientApp {
    Button button;
    Checkbox checkbox;

    public ClientApp(GUIFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
    }

    public void printInfo() {
        button.printInfo();
        checkbox.printInfo();
    }
}
