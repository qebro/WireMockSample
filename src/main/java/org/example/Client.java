package org.example;

import com.github.tomakehurst.wiremock.client.WireMock;

public class Client {
    public static void main(String[] args) {
        WireMock.configureFor("localhost", 8181);
        WireMock.stubFor(WireMock.get("/hello")
                .willReturn(WireMock.aResponse().withStatus(206).withBody("Hello World!!!")));
        WireMock.saveAllMappings();
    }
}
