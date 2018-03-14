package dojo10.presenter;

import dojo10.JSONMapper;

import java.io.IOException;
import java.util.Map;

public class AndroidPresenter implements Presenter {

    @Override
    public Map getCongratsAsJson() throws IOException {
        return getOldJson();
    }

    private Map getOldJson() throws IOException {
        return JSONMapper.toObject(
                "{\n" +
                        "  \"status\": \"success\",\n" +
                        "  \"substatus\": null,\n" +
                        "  \"heading\": \"¡Apúrate a pagar!\",\n" +
                        "  \"title\": \"Paga ${price} en ${paymentMethodName} para reservar tu compra\",\n" +
                        "  \"sections\": [{\n" +
                        "    \"type\": \"offline_payment\",\n" +
                        "    \"model\": {\n" +
                        "      \"payment_data\": {\n" +
                        "        \"values\": [{\n" +
                        "          \"name\": \"Número de CI\",\n" +
                        "          \"value\": \"1.111.111-1\"\n" +
                        "        }],\n" +
                        "        \"actions\": []\n" +
                        "      },\n" +
                        "      \"title\": \"Te pedirán estos datos:\",\n" +
                        "      \"actions\": []\n" +
                        "    }\n" +
                        "  }, {\n" +
                        "    \"type\": \"exit\",\n" +
                        "    \"model\": {\n" +
                        "      \"actions\": [{\n" +
                        "        \"id\": \"go_to_home\",\n" +
                        "        \"text\": \"Seguir comprando\"\n" +
                        "      }]\n" +
                        "    }\n" +
                        "  }]\n" +
                        "}",
                Map.class
        );
    }

}
