package com.safia.TP_MW;
import java.util.Scanner;

public class Mage extends Personnages {


    public Mage(int numJoueur, int force, int agilite, int intelligence) {
        super(numJoueur, force, agilite, intelligence);
        classe="Mage";
        cri = "Abracadabraaaa ! ";
    }

    @Override
    protected void sort(int choix) {
        Scanner sc = new Scanner (System.in);
        String narrateur = "";
        switch (choix){
            case 1:
                adversaire.enleverVie(intelligence);
                narrateur= num + " utilise Boule de Feu et inflige " + intelligence + " de dégâts";
                System.out.print(narrateur);
                break;
            case 2:
                do {
                    vie += (intelligence * 2);
                }while (intelligence>vie);
                narrateur =  num + " utilise Coup de rage, inflige " + (force * 2) + " de dégâts et perd " + (force / 2) + " de vitalité";
                System.out.print(narrateur);
                break;

        }
    }
}
