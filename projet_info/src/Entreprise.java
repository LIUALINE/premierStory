
public class Entreprise {

	private String NomEntreprise;
	private String Alias;
	private double PrixActuel;
	private double PrixInitial;
	private int Quantite;
	private Moment Date;

	public Entreprise() {
		super();
	}

	public Entreprise(Entreprise a) {
		this.NomEntreprise=a.NomEntreprise;
		this.Alias=a.Alias;
		this.PrixActuel=a.PrixActuel;
		this.Quantite=a.Quantite;
		this.PrixInitial=a.PrixInitial;
		this.Date=a.Date;
	}
	
	
	
	public Entreprise(String nomEntreprise, String alias,double prixactuel,double prixinitial,int quantite,Moment date) {
		super();
		this.NomEntreprise = nomEntreprise;
		this.Alias=alias;
		this.PrixActuel=prixactuel;
		this.PrixInitial=prixinitial;
		this.Quantite=quantite;
		this.Date=date;
	}
	//constructeur~~
	
	
	public void setNomEntreprise(String nom){
		this.NomEntreprise=nom;
	}
	public void setAlias(String alias){
		this.Alias=alias;
	}
	public void setPrixActuel(double p){
		this.PrixActuel=p;
	}
	public void setPrixInitial(double p){
		this.PrixInitial=p;
	}
	public void setQuantite(int q){
		this.Quantite=q;
	}
	public void setDate(Moment date){
		this.Date=date;
	}
	//set Methode~~
	
	public String getNomEtreprise(){
		return this.NomEntreprise;
	}
	public String getAlias(){
		return this.Alias;
	}
	public double getPrixActuel(){
		return this.PrixActuel;
	}
	public double getPrixInitial(){
		return this.PrixInitial;
	}
	public int getQuantite(){
		return this.Quantite;
	}
	public Moment getDate(){
		return this.Date;
	}
	//get methode~~
	
	public void afficher(){
		double va,vi,vl;
		va=this.PrixActuel*this.Quantite;
		vi=this.PrixInitial*this.Quantite;
		vl=va-vi;
		System.out.println(this.NomEntreprise+"\n"+this.Alias);
		System.out.println("Date d'Achat      Nombre d'Action    Prixunitaire Actuel    Valeur Actuel   Prixunitair Initial    Valeur Initial   Valeur l'atente");
		System.out.println(this.Date+"        "+this.Quantite+"                 "+this.PrixActuel+"$                 "+va+"         "+this.PrixInitial+"$   "+vi+"          "+vl);
	}
	
	
	//test avec main 
	public static void main(String[] args){
		Moment d=new Moment(26,10,2015);
		Entreprise a=new Entreprise("Google","@GOO",1000,900,50,d);
		a.afficher();
	}
	
	
}
