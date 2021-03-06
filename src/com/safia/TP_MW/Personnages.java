package com.safia.TP_MW;

public abstract class Personnages {

    protected String num,cri,classe;
    protected int niveau, vie, force, agilite, intelligence;
    protected Personnages adversaire;

    //Constructeur avec paramètre
    public Personnages(int numJoueur, int force, int agilite, int intelligence) {
        num = "Joueur " + numJoueur;
        niveau = force + agilite + intelligence;
        //TODO ajouter la verification des caracteristiques saisies
        vie = niveau * 5;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
    }

    public void setAdversaire(Personnages adversaire) { this.adversaire = adversaire; }
    public Personnages getAdversaire() { return adversaire; }

    protected abstract void sort (int choix);
    //Le joueur courrant pourra utiliser la methode sors se trouvant dans les classes Classes
    public void joueurActif() {
        int choix = 0;
        if (vie >= 0) {
            do {
                choix = Main.askQuestion(num + " ( " + vie + " de vitalité.) Veuillez choisir votre action (1 : Attaque Basique   2 : Attaque Speciale)");
            }while (choix != 1 && choix != 2);
            this.sort(choix);
        }
    }


   //Methode qui retire la vie
    protected void enleverVie(int vieAEnlever) { vie-= vieAEnlever; }

    //Methode d'intro du joueur
    @Override
    public String toString() {
        return  cri + "Je suis le "+ classe+" "+num +", de  niveau "+ niveau + " , je possède "+ vie + " de vitalité, "+ force+
                " de force, "+ agilite+ " d'agilité et "+ intelligence+ " d'intelligence !\n";
    }

}
