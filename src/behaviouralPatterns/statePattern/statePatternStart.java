package behaviouralPatterns.statePattern;

import behaviouralPatterns.statePattern.ui.Player;
import behaviouralPatterns.statePattern.ui.UI;

public class statePatternStart {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
