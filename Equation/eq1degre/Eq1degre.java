//nous voici dans notre classe il faut d'abord specifier a quel package elle appartient

package eq1degre;   //par défaut les IDE le spécifie automatiquement


// ensuite on va créer notre class
// ici je ne met pas d'accent pour faciliter les choses et risquer moins de problemes!

// la classe ci dessus doit TOUJOURS avoir le mm nom que le fichier java
//      IMPORTANT
// dans notre exemple un fichier "Eq1degre.java" contenant une classe "Eq1degre" sera contenu dans un package (un dossier) "eq1degre"
public class Eq1degre{

    //on va déclarer les différents attributs de la classe
    // la classe représente une équation de type ax+b
    // donc on peut supposer que les nombres a et b vont la caractériser
    //pourquoi?
    // toute équation de type ax+b a TOUJOURS une variable x MAIS a et b sont variable
    // exemple: 7x+5 => a=7, x=x,b=5 
    //          et 
    //          8x-6 =>a=8,x=x,b=-6

    //  attribut
    private double a,b;

    //constructors
    //  le constructeurs a TOUJOURS le mm nom que la classe
    // c'est lui qui va nous permettre d'instancier des obets (ref cours de Aly)

    public Eq1degre(double a, double b){
        this.a=a;
        this.b=b;
    }

    //  methode
    public double solution(){
        double solution;
        if(this.a!=0){
            solution=b/a;
        }else{
            System.out.println("a est nul donc "+this.b+" = "+this.b);
            solution =0;
        }
        return solution;
    }



}


