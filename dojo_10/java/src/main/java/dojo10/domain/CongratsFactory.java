package dojo10.domain;

public class CongratsFactory {

    public Congrats getCongrats() {
        String type = "offline_payment";

        return new Congrats(type);
    }

}
