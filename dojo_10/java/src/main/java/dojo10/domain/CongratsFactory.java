package dojo10.domain;

public class CongratsFactory {

    public Congrats getCongrats() {
        Congrats congrats = new Congrats();

        congrats.internalType = "offline_payment";

        return congrats;
    }

}
