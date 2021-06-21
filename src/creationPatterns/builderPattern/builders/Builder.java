package creationPatterns.builderPattern.builders;

import creationPatterns.builderPattern.cars.CarType;
import creationPatterns.builderPattern.components.Engine;
import creationPatterns.builderPattern.components.GPSNavigator;
import creationPatterns.builderPattern.components.Transmission;
import creationPatterns.builderPattern.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
