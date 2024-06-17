package org.projet1;

import org.junit.Before;
import org.junit.Test;
import org.projet1.modele.Lieu;
import org.projet1.modele.Marcheur;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ItineraireTest {

    private ListeDesLieux listeDesLieux;
    private Itineraire itineraire;
    private Marcheur Bjarni;

    @Before
    public void setUp() {
        listeDesLieux = new ListeDesLieux();
        itineraire = new Itineraire(listeDesLieux);
        Bjarni = new Marcheur("Bjarni", itineraire);
    }

    @Test
    public void testMarche() {
        int depart = 0; // HEI
        int arrivee = 2; // ESTI
        String resultat = Bjarni.marche(depart, arrivee);

        assertTrue(resultat.contains("ESTI"));

        List<Lieu> chemin = itineraire.genererItineraire(depart, arrivee);
        assertEquals(arrivee, chemin.get(chemin.size() - 1).getNumero());
    }

    @Test
    public void testMarcheLongerRoute() {
        int depart = 0; // HEI
        int arrivee = 7; // Marais
        String resultat = Bjarni.marche(depart, arrivee);

        assertTrue(resultat.contains("Marais"));

        List<Lieu> chemin = itineraire.genererItineraire(depart, arrivee);
        assertEquals(arrivee, chemin.get(chemin.size() - 1).getNumero());
    }

    @Test
    public void testMarcheReversedRoute() {
        int depart = 7; // Marais
        int arrivee = 0; // HEI
        String resultat = Bjarni.marche(depart, arrivee);

        assertTrue(resultat.contains("HEI"));

        List<Lieu> chemin = itineraire.genererItineraire(depart, arrivee);
        assertEquals(arrivee, chemin.get(chemin.size() - 1).getNumero());
    }

    @Test
    public void testMarcheIntermediateRoute() {
        int depart = 4; // Pullman
        int arrivee = 5; // Nexta
        String resultat = Bjarni.marche(depart, arrivee);

        assertTrue(resultat.contains("Nexta"));

        List<Lieu> chemin = itineraire.genererItineraire(depart, arrivee);
        assertEquals(arrivee, chemin.get(chemin.size() - 1).getNumero());
    }
}
