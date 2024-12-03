package com.example;

/**
 * Cette classe représente un personnage.
 * Elle permet de gérer ses déplacements et ses points de vie.
 */
public class Personnage {
    private String nom;
    private int x;
    private int y;
    private int pointsDeVie;

    /**
     * Initiale un personnage avec un nom, une position et des points de vie.
     * @param nom Le nom du personnage
     * @param x La position x initiale
     * @param y La position y initiale
     * @param pointsDeVie Les points de vie initiaux (>= 0)
     * @throws IllegalArgumentException Si les points de vie sont négatifs
     */
    public Personnage(String nom, int x, int y, int pointsDeVie) {
        if (pointsDeVie < 0) {
            throw new IllegalArgumentException("Les points de vie ne peuvent pas être négatifs.");
        }
        this.nom = nom;
        this.x = x;
        this.y = y;
        this.pointsDeVie = pointsDeVie;
    }

    /**
     * Déplace le personnage à partir d'une distance à parcourir.
     * @param dx Distance à ajouter à la position x actuelle
     * @param dy Distance à ajouter à la position y actuelle
     */
    public void deplacer(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    /**
     * Inflige des dégâts au personnage.
     * @param degats Dégâts à infliger
     */
    public void subirDegats(int degats) {
        this.pointsDeVie = Math.max(0, this.pointsDeVie - degats);
    }

    /**
     * Indique si le personnage est encore en vie.
     * @return True si les points de vie sont égaux à 0, False sinon
     */
    public boolean estHorsJeu() {
        return this.pointsDeVie == 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getNom() {
        return nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }
}
