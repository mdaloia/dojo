package dojo10.model;

import java.util.Objects;

public class IOSCongratsModel implements CongratsModel {

    private String type;

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IOSCongratsModel that = (IOSCongratsModel) o;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

}
