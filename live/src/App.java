import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class App {
    public static void main(String[] args) throws Exception {
        // acessar url

        var url = "https://imdb-api.com/en/API/Top250Movies/k_t6qd5zc9";
        URI uri = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(uri).build();

        // pegar JSON
        String json = client.send(request, HttpResponse.BodyHandlers.ofString()).body();

        // exibir JSON
        System.out.println(json);
    }
}
