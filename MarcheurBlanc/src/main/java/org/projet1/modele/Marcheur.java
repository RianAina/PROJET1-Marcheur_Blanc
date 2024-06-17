package org.projet1.modele;

import org.projet1.Itineraire;
import org.projet1.modele.Lieu;

import java.util.List;

public class Marcheur {
    private String nom;
    private Itineraire itineraire;

    public Marcheur(String nom, Itineraire itineraire) {
        this.nom = nom;
        this.itineraire = itineraire;
    }

    public String marche(int depart, int arrivee) {
        List<Lieu> chemin = itineraire.genererItineraire(depart, arrivee);
        return chemin.toString();
    }
}
