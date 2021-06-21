package structurePatterns.decoratorPattern.decorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}
