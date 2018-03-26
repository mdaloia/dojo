package dojo10.presenter;

import dojo10.model.CongratsModel;

/**
 * Interface que permite obtener el model para presentar y que este
 * se encuentre adaptado segun el device/version
 */
public interface CongratsPresenter<T extends CongratsModel> {

    public T getViewModel();

}
