package princi;

import etudiant.Etudiant;
import java.util.*;

public class Princi{

    public static void main(String[] args){

        //  instancier Scanner pour la saisie
        Scanner scan=new Scanner(System.in);

        //  instancier les deux etudiants
        Etudiant e1=new Etudiant("Squall","Manu");
        System.out.println("Saisissez le nom de l'etudiant 1");
        e1.setNom(scan.next());
        System.out.println("Saisissez le prenom de l'etudiant 1");
        e1.setPrenom(scan.next());
        System.out.println("Saisissez l'annee de naissance de l'etudiant 1");
        e1.setAnneeNaissance(scan.nextInt());


        // Etudiant e2=new Etudiant("Squall","Manu");
        // System.out.println("Saisissez le nom de l'etudiant 2");
        // e2.setNom(scan.next());
        // System.out.println("Saisissez le prenom de l'etudiant 2");
        // e2.setPrenom(scan.next());
        // System.out.println("Saisissez l'annee de naissance de l'etudiant 2");
        // e2.setAnneeNaissance(scan.nextInt());
        
        


        // if (e1.getAnneeNaissance()<e2.getAnneeNaissance()) {
        //     System.out.println(e1.getPrenom()+" "+e1.getNom()+" est le plus age!");
        // } else {
        //     System.out.println(e2.getPrenom()+" "+e2.getNom()+" est le plus age!");
        // }

        
        System.out.println(e1.toString());
    }
}