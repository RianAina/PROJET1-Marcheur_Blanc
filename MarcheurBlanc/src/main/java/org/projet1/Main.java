package org.projet1;

import org.projet1.modele.Lieu;
import org.projet1.modele.Marcheur;
import org.projet1.modele.Rue;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private Itineraire itineraire;
    public static void main(String[] args) {
        ListeDesLieux listeDesLieux = new ListeDesLieux();
        Itineraire itineraire = new Itineraire(listeDesLieux);

        Marcheur Bjarni = new Marcheur("Bjarni", itineraire);

        String resultat = Bjarni.marche(0, 2);
        System.out.println(resultat);
        }
    }
