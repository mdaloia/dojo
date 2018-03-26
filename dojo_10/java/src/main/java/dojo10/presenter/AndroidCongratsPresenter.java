package dojo10.presenter;

import dojo10.domain.Congrats;
import dojo10.domain.CongratsFactory;
import dojo10.model.AndroidCongratsModel;
import dojo10.model.CongratsModel;
import dojo10.model.CongratsModelFactory;
import dojo10.model.IOSCongratsModel;
import dojo10.visitor.AndroidCongratsVisitor;
import dojo10.visitor.CongratsVisitor;

public class AndroidCongratsPresenter implements CongratsPresenter<AndroidCongratsModel> {

    private CongratsFactory congratsFactory = new CongratsFactory();

    @Override
    public AndroidCongratsModel getViewModel() {
        Congrats congratsModel = congratsFactory.getCongrats();

        return completeModel(congratsModel);
    }

    private AndroidCongratsModel completeModel(Congrats congrats) {
        CongratsVisitor androidVisitor = new AndroidCongratsVisitor();

        congrats.accept(androidVisitor);

        CongratsModelFactory<AndroidCongratsModel> modelFactory = (CongratsModelFactory<AndroidCongratsModel>) androidVisitor;

        return modelFactory.getModel();
    }

}
