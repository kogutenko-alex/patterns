package creationPatterns.abstractFactoryMethod.factories;

import creationPatterns.abstractFactoryMethod.buttons.Button;
import creationPatterns.abstractFactoryMethod.buttons.UnixButton;
import creationPatterns.abstractFactoryMethod.checkboxes.Checkbox;
import creationPatterns.abstractFactoryMethod.checkboxes.UnixCheckbox;

public class UnixFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new UnixButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new UnixCheckbox();
    }
}
