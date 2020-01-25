package com.safia.TP_MW;

import java.util.Scanner;

public class Rodeur extends Personnages{

    public Rodeur(int numJoueur, int force, int agilite, int intelligence) {
        super(numJoueur, force, agilite, intelligence);
        classe="Rodeur";
        cri = "Psst...! ";
    }


    @Override
    protected void sort(int choix) {
        Scanner sc = new Scanner (System.in);
        String narrateur="";
        switch (choix){
            case 1:
                adversaire.enleverVie(agilite);
                narrateur= num + " utilise Tire à l'Arc et inflige " + agilite + " de dégâts";
                System.out.print(narrateur);
                break;
            case 2:
                adversaire.enleverVie(force*2);
                vie += (niveau/2);
                narrateur =  num + " utilise Coup de rage, inflige " + (force * 2) + " de dégâts et perd " + (force / 2) + " de vitalité";
                System.out.print(narrateur);
                break;
        }

    }
}
