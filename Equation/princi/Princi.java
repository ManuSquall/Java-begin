package princi;

//on a besoin de la classe Eq1degre.java donc on l'importe
//on a besoin de la classe Scanner pour recuperer des saisi donc on l'importe
import java.util.Scanner;
import eq1degre.Eq1degre;

public class Princi{

    public static void main(String args[]){

        //ici c'est facultatif!!

        //  on instancie les objets dont on a besoin
        Scanner scan = new Scanner(System.in);
        


        

        System.out.println("Saisissez a");
        double a= scan.nextInt();
        System.out.println("Saisissez b");
        double b= scan.nextInt();

        // a ce niveau tu peux directement mettre deux nombre à la place 
        //de a et b

        Eq1degre equation = new Eq1degre(a,b);

        System.out.println("La solution de l'equation est: "+equation.solution());


    }

}