package org.projet1;

import org.projet1.modele.Lieu;

import java.util.ArrayList;
import java.util.List;

public class ListeDesLieux {

    public List<Lieu> listeDesLieux () {
        List<Lieu> lieux = new ArrayList<>();
        lieux.add(new Lieu("HEI", 0));
        lieux.add(new Lieu("Balancoire", 1));
        lieux.add(new Lieu("ESTI", 2));
        lieux.add(new Lieu("Boulevard de l'Europe", 3));
        lieux.add(new Lieu("Pullman", 4));
        lieux.add(new Lieu("Nexta", 5));
        lieux.add(new Lieu("Sekolintsika", 6));
        lieux.add(new Lieu("Marais", 7));


        return lieux;
    };
}
