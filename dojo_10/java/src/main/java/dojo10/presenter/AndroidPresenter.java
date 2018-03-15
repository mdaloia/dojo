package dojo10.presenter;

import dojo10.JSONMapper;
import dojo10.domain.Congrats;
import dojo10.domain.CongratsFactory;
import dojo10.model.AndroidCongratsModel;
import dojo10.model.CongratsModel;
import dojo10.model.CongratsModelFactory;
import dojo10.visitor.AndroidCongratsVisitor;
import dojo10.visitor.CongratsVisitor;

import java.io.IOException;
import java.util.Map;

public class AndroidPresenter implements Presenter {

    private CongratsFactory congratsFactory = new CongratsFactory();

    @Override
    public CongratsModel getViewModel() {
        Congrats congratsModel = congratsFactory.getCongrats();

        return completeModel(congratsModel);
    }

    private AndroidCongratsModel completeModel(Congrats congrats) {
        CongratsVisitor androidVisitor = new AndroidCongratsVisitor();

        congrats.accept(androidVisitor);

        CongratsModelFactory modelFactory = (CongratsModelFactory) androidVisitor;

        CongratsModel congratsModel = modelFactory.getModel();

        return (AndroidCongratsModel) congratsModel;
    }

}
