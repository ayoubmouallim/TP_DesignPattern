package observers;

import observable.Observable;
import observable.Player;

public class Gardien implements  Observer{
    private double lastState;

    @Override

    public void update(Observable observable) {
        System.out.println("Gardien is notified ");

    }
}
