package org.example;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToDH(11));
        Compte cp = proxy.getCompte(5);
        System.out.println("Code "+cp.getCode());
        System.out.println("Solde "+cp.getSolde());
        System.out.println("Date creation "+cp.getDateCreation());
        List<Compte> compteList = proxy.listComptes();
        for (Compte c : compteList){
            System.out.println("---------");
            System.out.println("Code "+c.getCode());
            System.out.println("Solde "+c.getSolde());
            System.out.println("Date creation "+c.getDateCreation());
        }

    }
}
