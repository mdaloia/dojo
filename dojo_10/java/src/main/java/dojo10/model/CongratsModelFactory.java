package dojo10.model;

public interface CongratsModelFactory<T extends CongratsModel> {

    public T getModel();

}
