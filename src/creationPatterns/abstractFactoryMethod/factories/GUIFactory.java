package creationPatterns.abstractFactoryMethod.factories;

import creationPatterns.abstractFactoryMethod.buttons.Button;
import creationPatterns.abstractFactoryMethod.checkboxes.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
