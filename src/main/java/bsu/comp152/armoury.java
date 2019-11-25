package bsu.comp152;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.ArrayList;

public class armoury {
    private HttpClient dataSlap;
    private String webSpot;

    public armoury(String webSpot){
        dataSlap = HttpClient.newHttpClient();
        this.webSpot = webSpot;
    }

    public ArrayList<peopleDataType> getData(){
        var requestBuilder = HttpRequest.newBuilder();
        var dataRequest = requestBuilder.uri(URI.create(webSpot)).build();
        HttpRequest<String> response = null;
        try {
            response=dataSlap.send(dataRequest, HttpRequest.BodyHandlers.ofString());
        }catch (IOException r){
            System.out.println("Connection is fragile");
        }
    }
}
