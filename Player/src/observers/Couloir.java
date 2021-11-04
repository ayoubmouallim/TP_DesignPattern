package observers;

import observable.Observable;
import observable.Player;

public class Couloir implements  Observer{
    private double lastState;

    @Override

    public void update(Observable observable) {

        System.out.println("Couloir is notified ");



    }
}
