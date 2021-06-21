package creationPatterns.abstractFactoryMethod.buttons;

/**
 * Все семейства продуктов имеют одни и те же вариации (MacOS/Windows).
 *
 * Это вариант кнопки под MacOS.
 */
public class UnixButton implements Button{
    @Override
    public void printInfo() {
        System.out.println("You have created UnixButton.");
    }
}
