package dojo10.visitor;

import dojo10.domain.Congrats;
import dojo10.model.CongratsModel;
import dojo10.model.CongratsModelFactory;
import dojo10.model.IOSCongratsModel;

public class IOSCongratsVisitor implements CongratsVisitor, CongratsModelFactory {

    IOSCongratsModel dto;

    @Override
    public void visit(Congrats congrats) {
        dto = buildModel(congrats);
    }

    @Override
    public CongratsModel getModel() {
        return dto;
    }

    private IOSCongratsModel buildModel(Congrats congrats) {
        IOSCongratsModel dto = new IOSCongratsModel();

        dto.setType(congrats.getType());

        return dto;
    }

}
