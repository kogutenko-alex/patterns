package creationPatterns.factoryMethod.factory;

import creationPatterns.factoryMethod.button.Button;
import creationPatterns.factoryMethod.button.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
