package org.example;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.common.ConsoleNotifier;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;

public class Server {
    public static void main(String[] args) {
        System.out.println("Starting WireMock Server");
        WireMockServer wireMockServer = new WireMockServer(WireMockConfiguration.options().port(8181).notifier(new ConsoleNotifier(true)));
        wireMockServer.start();
    }
}
