package dojo10.domain;

import dojo10.DataFetcher;

public class Congrats {

    String internalType;

    public void complete(DataFetcher fetcher) {

        for (String field : fetcher.getFields()) {
            if ("type".equalsIgnoreCase(field)) {
                fetcher.registerData(field, internalType);
            }
        }

    }

}
