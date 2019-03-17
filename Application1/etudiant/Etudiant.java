package etudiant;

public class Etudiant{

    //  attributs
    public static int numEtudiant=0;
    private static final int tailleTab=10;
    private String nom, prenom, matricule;
    private int anneeNaissance, nbNotes;
    private double tabNotes[]=new double[tailleTab];

    //  constructeurs
    public Etudiant(String nom, String prenom){
        this.nom=nom;
        this.prenom=prenom;
        this.nbNotes=0;
        numEtudiant++;
        this.matricule=genererMatricule(numEtudiant);
        //this.tabNotes[]=Double[0];
    };

    public Etudiant(String nom, String prenom, int anneeNaissance){
        this.nom=nom;
        this.prenom=prenom;
        this.anneeNaissance=anneeNaissance;
        this.nbNotes=0;
        numEtudiant++;
        this.matricule=genererMatricule(numEtudiant);
        //this.tabNotes[]={0,0,0,0,0,0,0,0,0,0};        
    };

    //  setters
    public void setNom(String nom){
        this.nom=nom;
    };
    public void setPrenom(String prenom){
        this.prenom=prenom;
    };
    public void setAnneeNaissance(int anneeNaissance){
        this.anneeNaissance=anneeNaissance;
    };
    //  getters
    public String getNom(){
        return this.nom;
    };
    public String getPrenom(){
        return this.prenom;
    };
    public int getAnneeNaissance(){
        return this.anneeNaissance;
    };

    //  méthode
    public double moyenne(){
        double somme=0;
        for (int i = 0; i < this.nbNotes; i++) {
            somme+=this.tabNotes[i];
        }
        return somme/this.nbNotes;
    };

    public double max(){
        double noteMax=0;
        for (int i = 0; i < this.nbNotes; i++) {
            if(noteMax<this.tabNotes[i]){
                noteMax=this.tabNotes[i];
            }
        }
        return noteMax;
    };

    public double min(){
        double noteMin=20;
        for (int i = 0; i < this.nbNotes; i++) {
            if(noteMin>this.tabNotes[i]){
                noteMin=this.tabNotes[i];
            }
        }
        return noteMin;
    };

    public void ajouterNote(double n){
        if(this.nbNotes<tailleTab){
            this.tabNotes[this.nbNotes+1]=n;
        }
        System.out.println("\n La nouvelle moyenne de "+this.prenom+" "+this.nom+" est:\n Moyenne: "+this.moyenne());
    };

    public int anneeNaissance(){
        return getAnneeNaissance();
    };

    //@Override
    public String toString(){
        return ("Matricule: "+this.matricule+"Nom: "+this.nom+"\nPrenom: "+this.prenom+"\nAnnee de naissance: "+this.anneeNaissance);
    }

    private String genererMatricule(int num){
        return ("Mat-"+this.nom.charAt(0)+this.prenom.charAt(0)+num);
    }


}