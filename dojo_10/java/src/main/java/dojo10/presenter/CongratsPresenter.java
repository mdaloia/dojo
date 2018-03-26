package dojo10.presenter;

import dojo10.model.CongratsModel;

public interface CongratsPresenter<T extends CongratsModel> {

    public T getViewModel();

}
