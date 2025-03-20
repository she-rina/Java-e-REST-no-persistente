package rest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RestClient {

    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080/rest-server/api/hello");

        Response response = target.request(MediaType.TEXT_PLAIN).get();
        String output = response.readEntity(String.class);
        System.out.println("Risposta: " + output);
        response.close();
        client.close();
    }
}
