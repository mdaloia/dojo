package dojo10.model;

/**
 * Interface que implementara el visitor especifico y que permite "ver"
 * al visitor como proveedor del modelo completo luego de ejecutar el
 * visitor.
 */
public interface CongratsModelFactory<T extends CongratsModel> {

    public T getModel();

}
