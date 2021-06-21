package structurePatterns.bridgePattern;

import structurePatterns.bridgePattern.devices.Device;
import structurePatterns.bridgePattern.devices.Radio;
import structurePatterns.bridgePattern.devices.Tv;
import structurePatterns.bridgePattern.remotes.AdvancedRemote;
import structurePatterns.bridgePattern.remotes.BasicRemote;

public class bridgePatternStart {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
