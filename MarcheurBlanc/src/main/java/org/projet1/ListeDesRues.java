package org.projet1;

import org.projet1.modele.Rue;

import java.util.ArrayList;
import java.util.List;

public class ListeDesRues {

    public List<Rue> listeDesRues() {
        List<Rue> rues = new ArrayList<>();
        rues.add(new Rue("Rue Andriatsihorana", 1));
        rues.add(new Rue("Rue Ranaivo", 2));

        return rues;
    }
}
