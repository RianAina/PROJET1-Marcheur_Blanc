package org.projet1;

import org.projet1.modele.Lieu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Itineraire {
    private ListeDesLieux listeLieux;

    // Initialisation des connexions possibles pour chaque lieu
    private static final Map<Integer, int[]> connexions = new HashMap<>();
    static {
        connexions.put(0, new int[]{4, 1, 6});
        connexions.put(1, new int[]{0, 4, 3, 2});
        connexions.put(2, new int[]{1, 3});
        connexions.put(3, new int[]{2, 1});
        connexions.put(4, new int[]{0, 1, 5});
        connexions.put(5, new int[]{4});
        connexions.put(6, new int[]{0, 7});
        connexions.put(7, new int[]{6});
    }

    public Itineraire(ListeDesLieux listeLieux) {
        this.listeLieux = listeLieux;
    }

    public List<Lieu> getListeDesLieux() {
        return listeLieux.listeDesLieux();
    }

    public List<Lieu> genererItineraire(int depart, int arrivee) {
        List<Lieu> listDesLieux = getListeDesLieux();
        List<Lieu> itineraire = new ArrayList<>();
        int numeroActuel = depart;

        while (numeroActuel != arrivee) {
            int[] destinations = connexions.get(numeroActuel);
            List<Lieu> itineraireDisponible = new ArrayList<>();
            for (int destination : destinations) {
                itineraireDisponible.add(listDesLieux.get(destination));
            }
            Collections.shuffle(itineraireDisponible);

            Lieu prochainLieu = itineraireDisponible.get(0);
            itineraire.add(prochainLieu);
            numeroActuel = prochainLieu.getNumero();
        }

        return itineraire;
    }
}
