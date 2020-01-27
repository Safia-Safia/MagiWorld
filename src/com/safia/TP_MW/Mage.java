package com.safia.TP_MW;
import java.util.Scanner;

public class Mage extends Personnages {


    public Mage(int numJoueur, int force, int agilite, int intelligence) {
        super(numJoueur, force, agilite, intelligence);
        classe="Mage";
        cri = "Abracadabraaaa ! ";
    }
    int vieMax =vie;

    @Override
    protected void sort(int choix) {
        String narrateur = "";
        switch (choix){
            case 1:
                narrateur= num + " utilise Boule de feu et inflige " + intelligence + " de dégâts !";
                System.out.print(narrateur);
                System.out.println("\n"+adversaire.num+ " perd "+ intelligence + " point de vie.");
                adversaire.enleverVie(intelligence);
                break;
            case 2:
                do {
                    vie += (intelligence * 2);
                    if (vie > vieMax)System.out.println("Vous ne pouvez pas avoir plus de vie qu'initialement !");
                } while (vie<vieMax);
                narrateur =  num + " utilise Soin et regagne " + (intelligence*2)+ " de vitalité !\n";
                System.out.print(narrateur);
                break;

        }
    }
}