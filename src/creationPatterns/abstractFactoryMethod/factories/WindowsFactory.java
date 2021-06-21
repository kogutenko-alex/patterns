package creationPatterns.abstractFactoryMethod.factories;

import creationPatterns.abstractFactoryMethod.buttons.Button;
import creationPatterns.abstractFactoryMethod.buttons.WindowsButton;
import creationPatterns.abstractFactoryMethod.checkboxes.Checkbox;
import creationPatterns.abstractFactoryMethod.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
