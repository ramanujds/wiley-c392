import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        AirFiber airFiber = new AirFiber();
        Phone phone = new Phone();

        AirtelSim airtel = new AirtelSim();
        JioSim jio = new JioSim();

        phone.setSim(jio);

        phone.browseInternet();

        airFiber.browseInternet();


    }

}
