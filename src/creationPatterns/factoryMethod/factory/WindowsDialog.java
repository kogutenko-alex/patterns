package creationPatterns.factoryMethod.factory;

import creationPatterns.factoryMethod.button.Button;
import creationPatterns.factoryMethod.button.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
