import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpClient.newHttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse.BodyHandlers


fun main() {
    val client: HttpClient  = newHttpClient ()
    val request: HttpRequest  = HttpRequest.newBuilder ()
        .uri(URI.create("https://www.cheapshark.com/api/1.0/games?id=612"))
        .build()

    val response = client
        .send(request, BodyHandlers.ofString())

    val json = response.body()
    println(json)


}