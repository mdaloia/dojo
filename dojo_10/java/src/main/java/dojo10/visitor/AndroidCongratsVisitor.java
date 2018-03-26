package dojo10.visitor;

import dojo10.domain.Congrats;
import dojo10.model.AndroidCongratsModel;
import dojo10.model.CongratsModel;
import dojo10.model.CongratsModelFactory;

public class AndroidCongratsVisitor implements CongratsVisitor, CongratsModelFactory<AndroidCongratsModel> {

    private AndroidCongratsModel dto;

    @Override
    public void visit(Congrats congrats) {
        dto = buildModel(congrats);
    }

    @Override
    public AndroidCongratsModel getModel() {
        if (dto == null) {
            throw new IllegalStateException("The model is not built yet");
        }

        return dto;
    }

    private AndroidCongratsModel buildModel(Congrats congrats) {
        AndroidCongratsModel dto = new AndroidCongratsModel();

        dto.setType(congrats.getType());

        return dto;
    }

}
