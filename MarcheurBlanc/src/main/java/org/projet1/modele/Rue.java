package org.projet1.modele;

public class Rue {
    private String nom;
    private int numero;

    public Rue(String nom, int numero) {
        this.nom = nom;
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Rue{" +
                "nom='" + nom + '\'' +
                ", numero=" + numero +
                '}';
    }
}
