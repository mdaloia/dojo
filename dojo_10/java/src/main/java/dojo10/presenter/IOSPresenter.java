package dojo10.presenter;

import dojo10.domain.Congrats;
import dojo10.domain.CongratsFactory;
import dojo10.model.CongratsModel;
import dojo10.model.CongratsModelFactory;
import dojo10.model.IOSCongratsModel;
import dojo10.visitor.CongratsVisitor;
import dojo10.visitor.IOSCongratsVisitor;

public class IOSPresenter implements Presenter {

    private CongratsFactory congratsFactory = new CongratsFactory();

    @Override
    public CongratsModel getViewModel() {
        Congrats congratsModel = congratsFactory.getCongrats();

        return completeModel(congratsModel);
    }

    private IOSCongratsModel completeModel(Congrats congrats) {
        CongratsVisitor iOSVisitor = new IOSCongratsVisitor();

        congrats.accept(iOSVisitor);

        CongratsModelFactory modelFactory = (CongratsModelFactory) iOSVisitor;

        CongratsModel congratsModel = modelFactory.getModel();

        return (IOSCongratsModel) congratsModel;
    }

}
