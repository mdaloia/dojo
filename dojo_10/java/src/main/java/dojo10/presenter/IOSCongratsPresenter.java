package dojo10.presenter;

import dojo10.domain.Congrats;
import dojo10.domain.CongratsFactory;
import dojo10.model.CongratsModel;
import dojo10.model.CongratsModelFactory;
import dojo10.model.IOSCongratsModel;
import dojo10.visitor.CongratsVisitor;
import dojo10.visitor.IOSCongratsVisitor;

public class IOSCongratsPresenter implements CongratsPresenter<IOSCongratsModel> {

    private CongratsFactory congratsFactory = new CongratsFactory();

    @Override
    public IOSCongratsModel getViewModel() {
        Congrats congratsModel = congratsFactory.getCongrats();

        return completeModel(congratsModel);
    }

    private IOSCongratsModel completeModel(Congrats congrats) {
        CongratsVisitor iOSVisitor = new IOSCongratsVisitor();

        congrats.accept(iOSVisitor);

        CongratsModelFactory<IOSCongratsModel> modelFactory = (CongratsModelFactory<IOSCongratsModel>) iOSVisitor;

        return modelFactory.getModel();  // TODO: GETTER
    }

}
