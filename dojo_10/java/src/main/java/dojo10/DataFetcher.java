package dojo10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataFetcher {

    private List<String> fields;
    private Map<String, String> data = new HashMap<>();

    public DataFetcher(List<String> fields) {
        this.fields = fields;
    }

    public List<String> getFields() {
        return fields;
    }

    public void registerData(String field, String value) {
        this.data.put(field, value);
    }

    public String getFieldValue(String field) {
        return this.data.get(field);
    }

}
