package org.example;

import proxy.BanqueService;
import proxy.BanqueWS;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToDH(11));
    }
}
