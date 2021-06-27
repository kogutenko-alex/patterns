package behaviouralPatterns.mediatorPattern.components;

import behaviouralPatterns.mediatorPattern.mediator.Mediator;

/**
 * Общий интерфейс компонентов.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
