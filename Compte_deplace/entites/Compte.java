package entites;


public class Compte{

    //  attributs
    private String code;
    private int solde;
    private String date;
    private static int nbreCompte=0;

    //  constructors
    public Compte(String date){
        nbreCompte+=1;
        this.code="Mat-"+nbreCompte;
        this.solde=0;
        this.date=date;
    }

    //  setters
    //on ne modifiera pas code 
    public void setSolde(int a){
        this.solde=a;
    }
    public void setDate(String a){
        this.date=a;
    }

    //  getters
    public String getCode(){
        return this.code;
    }
    public int getSolde(){
        return this.solde;
    }
    public String getDate(){
        return this.date;
    }

}