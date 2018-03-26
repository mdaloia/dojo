package dojo10.domain;

/**
 * Esta clase seria el servicio que provee las congrats
 */
public class CongratsFactory {

    public Congrats getCongrats() {
        String type = "offline_payment";

        return new Congrats(type);
    }

}
