import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {

    public MonedaAPI buscaMoneda(String codigoISO) {
        URI url = URI.create("https://v6.exchangerate-api.com/v6/9dd792424397e6eb192b3cae/latest/" + codigoISO);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(url).build();
        try {
            HttpResponse<String> response = client.
                    send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), MonedaAPI.class);
        } catch (Exception e) {
            throw new RuntimeException("Error en la operación. " + e.getMessage());
        }
    }

}
