package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Cette classe représente un plateau de jeu.
 * Elle permet d'en gérer les personnages.
 */
public class Plateau {
    private int largeur;
    private int hauteur;
    private List<Personnage> personnages;

    /**
     * Initialise un plateau avec une largeur et une hauteur.
     * @param largeur Largeur du plateau
     * @param hauteur Hauteur du plateau
     */
    public Plateau(int largeur, int hauteur) {
        if (largeur <= 0 || hauteur <= 0) {
            throw new IllegalArgumentException("Les dimensions du plateau doivent être positives.");
        }
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.personnages = new ArrayList<>();
    }

    /**
     * Ajoute un personnage au plateau.
     * @param p Personnage à ajouter
     */
    public void ajouterPersonnage(Personnage p) {
        if (p.getX() >= largeur || p.getY() >= hauteur) {
            throw new IllegalArgumentException("Le personnage est hors des limites du plateau.");
        }
        this.personnages.add(p);
    }

    /**
     * Indique s'il y a des personnages sur le plateau ou non.
     * @return True s'il y a des personnages, False sinon
     */
    public boolean estVide() {
        return this.personnages.isEmpty();
    }

    /**
     * Renvoie les personnages du plateau.
     * @return Une liste des personnages
     */
    public List<Personnage> getPersonnages() {
        return personnages;
    }
}
