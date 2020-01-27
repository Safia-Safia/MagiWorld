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
                narrateur= num + " utilise Tire à l'Arc et inflige " + agilite + " de dégâts !";
                System.out.print(narrateur);
                System.out.println("\n"+ adversaire.num + " perd "+ agilite + " point de vie.");
                break;
            case 2:
                agilite+=(niveau/2);
                narrateur =  num + " utilise concentration et gagne "+ (agilite / 2) + " en agilité !\n";
                System.out.print(narrateur);
                break;
        }

    }
}
