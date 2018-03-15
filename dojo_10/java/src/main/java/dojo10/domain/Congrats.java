package dojo10.domain;

import dojo10.visitor.CongratsVisitor;

public class Congrats {

    private String type;

    public Congrats(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void accept(CongratsVisitor visitor) {
        visitor.visit(this);
    }

}
