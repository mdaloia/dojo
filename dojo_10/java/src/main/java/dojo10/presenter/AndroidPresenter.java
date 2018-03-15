package dojo10.presenter;

import dojo10.DataFetcher;
import dojo10.JSONMapper;
import dojo10.domain.Congrats;
import dojo10.domain.CongratsFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AndroidPresenter implements Presenter {

    private CongratsFactory congratsFactory = new CongratsFactory();

    @Override
    public Map getCongratsAsJson() throws IOException {
        List<String> dataNeeded = new ArrayList<>();
        dataNeeded.add("type");

        DataFetcher fetcher = new DataFetcher(dataNeeded);

        Congrats congratsModel = congratsFactory.getCongrats();

        congratsModel.complete(fetcher);

        return buildResponse(fetcher);
    }

    private Map buildResponse(DataFetcher fetcher) throws IOException {
        Map sectionType = new HashMap<>();
        sectionType.put("type", fetcher.getFieldValue("type"));

        List sections = Arrays.asList(sectionType);

        Map congrats = new HashMap<>();
        congrats.put("sections", sections);

        return congrats;
    }

}
