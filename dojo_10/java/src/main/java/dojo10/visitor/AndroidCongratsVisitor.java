package dojo10.visitor;

import dojo10.domain.Congrats;
import dojo10.model.AndroidCongratsModel;
import dojo10.model.CongratsModel;
import dojo10.model.CongratsModelFactory;

public class AndroidCongratsVisitor implements CongratsVisitor, CongratsModelFactory {

    AndroidCongratsModel dto;

    @Override
    public void visit(Congrats congrats) {
        dto = buildModel(congrats);
    }

    @Override
    public CongratsModel getModel() {
        return dto;
    }

    private AndroidCongratsModel buildModel(Congrats congrats) {
        AndroidCongratsModel dto = new AndroidCongratsModel();

        dto.setType(congrats.getType());

        return dto;
    }

}
