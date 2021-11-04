package observers;

import observable.Observable;
import observable.Player;

public class Camera implements Observer{


    @Override

    public void update(Observable observable) {
        System.out.println("camera is notified ");
    }
}
