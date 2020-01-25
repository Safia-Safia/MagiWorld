package com.safia.TP_MW;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numJoueur=1;
        Personnages joueur1 = null;
        try {
            joueur1 = creationJoueur(numJoueur);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(joueur1.toString());
        numJoueur ++;
        int numJoueur2=2;
        Personnages joueur2 = null;
        try {
            joueur2 = creationJoueur(numJoueur);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(joueur2.toString());
        joueur1.setAdversaire(joueur2);
        joueur2.setAdversaire(joueur1);
        //TODO ajouter tant que l'adversaire n'est pas mort
        //TODO afficher la vie restante des joueurs après chaque tours
        joueur1.PersonnageCourant();
        joueur2.PersonnageCourant();
    }

    public static Personnages creationJoueur(int numJoueur) throws Exception {
        Personnages j;
        int classe, niveau, force, agilite, intelligence;
        System.out.println("\nCréation du personnage du Joueur " + numJoueur);
        classe = askQuestion("Choississez votre classe ( 1 : Guerrier - 2 : Rodeur - 3 : Mage) :");
        do {
            niveau = askQuestion("Niveau du personnage :");
            force = askQuestion("Force du personnage :");
            agilite = askQuestion("Agilité du personnage :");
            intelligence = askQuestion("Intelligence du personnage :");
        } while (force + agilite + intelligence != niveau);
            switch (classe) {
            case 1:
                j = new Guerrier(numJoueur,force,agilite,intelligence);
                break;
            case 2:
                j = new Rodeur(numJoueur,force,agilite,intelligence);
                break;
            case 3:
                j = new Mage(numJoueur,force,agilite,intelligence);
                break;
            default:
                throw new Exception("Classe non existante.");
        }
        if (force + agilite + intelligence != niveau){
            System.out.println("\nAttention, le niveau doit être égal à la sommes des caracteristiques force, agilité et intelligence.\n Veuillez réessayer");
        }


        return j;
    }

    public static int askQuestion(String question) {
        int choixCreation = 0;
        Scanner sc = new Scanner(System.in);
        //TODO saisir tant que ce n'est pas valide
        try {
            System.out.println(question);
            choixCreation=sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Veillez à uniquement saisir des chiffres ! Veuillez réessayer");}
        return choixCreation;

    }

}