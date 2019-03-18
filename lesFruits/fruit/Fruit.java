package fruit;

public class Fruit{

    //  attributs
    private String forme, nom, couleur;
    private int prix;
    private float poids;
    public static int montantPanier=0;

    //  constructors
    public Fruit(){
        this.forme="";        
        this.nom="";        
        this.couleur="";        
        this.prix=0;        
        this.poids=0;        
    }
    public Fruit(String nom, String forme, int prix){
        this.forme=forme;        
        this.nom=nom;        
        this.couleur="";        
        this.prix=prix;        
        this.poids=0;
        montantPanier+=prix;
    }

    @Override
    public String toString() {
        return ("Nom: "+this.nom+"\nForme: "+this.forme+"\nCouleur: "+this.couleur+"\nPrix: "+this.prix+"\nPoids: "+this.poids);
    }

    //  setters
    public void setForme(String forme){
        this.forme=forme;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public void setCouleur(String couleur){
        this.couleur=couleur;
    }
    public void setPrix(int prix){
        //si aucun prix n'avait été défini on initialise un et on augmente le montant du panier
        if(this.prix==0){
            this.prix=prix;
            montantPanier+=prix;
        }else{
            //si un montant avait déjà été fixé on soutire dabord l'ancien montant puis on incrémente le montant du panier avec le 
            //new prix
            montantPanier-=this.prix;
            this.prix=prix;
            montantPanier+=this.prix;
        }
        
    }
    public void setPoids(float poids){
        this.poids=poids;
    }
    //  getters
    public String getForme(){
        return this.forme;
    }
    public String getNom(){
        return this.nom;
    }
    public String getCouleur(){
        return this.couleur;
    }
    public int getPrix(){
        return this.prix;
    }
    public float getPoids(){
        return this.poids;
    }

    //qui retourne le prix du fruit ???
    public int calculerCout(){
        return getPrix();
    } 
    


}






