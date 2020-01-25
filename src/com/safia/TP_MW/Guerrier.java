package com.safia.TP_MW;

import java.util.Scanner;

public class Guerrier extends Personnages {


    public Guerrier(int numJoueur, int force, int agilite, int intelligence) {
        super(numJoueur, force, agilite, intelligence);
        classe="Guerrier";
        cri = "Woarg ! ";
    }

    @Override
    protected void sort(int choix) {
        Scanner sc = new Scanner (System.in);
        String narrateur = "";
        switch (choix){
            case 1:
                adversaire.enleverVie(force);
                narrateur= num + " utilise Coup d'épée et inflige " + force + " de dégâts";
                System.out.print(narrateur);
                break;
            case 2:
                adversaire.enleverVie(force * 2);
                vie -= force / 2;
                narrateur =  num + " utilise Coup de rage, inflige " + (force * 2) + " de dégâts et perd " + (force / 2) + " de vitalité";
                System.out.print(narrateur);
                break;
        }

    }
}
