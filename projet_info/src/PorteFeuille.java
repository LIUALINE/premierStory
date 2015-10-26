import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class PorteFeuille {

	private Collection<Entreprise> listEntreprise=new Vector<>();

	public PorteFeuille() {
		// TODO Auto-generated constructor stub
	}
    //constructeur~~
	
	public void ajouter(Entreprise a){
		Collections.addAll(listEntreprise, a);
	}
	
	public void supprimer(){}
	
	
	public void chargerFile(String path){      
		
		FileInputStream f=null;
		try{
		f=new FileInputStream(path);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		//read the file in Ta
		BufferedReader dr=new BufferedReader(new InputStreamReader(f));
		Collection<String> Ta=new Vector<>();
		String s;
		try {
			while ((s=dr.readLine())!=null){
				Collections.addAll(Ta,s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//get subString from a String seperate as " "
		Iterator it;
		it=Ta.iterator();
		while(it.hasNext()){
			String so=(String) it.next();
		    int[] index =new int[5];int[] Dindex=new int[2];
		    int end=so.length();
		    index[0]=so.indexOf(" ");
		    for(int i=1;i<5;i++){
		       index[i]=so.indexOf(" ", index[i-1]+1);
		    }
		    
		    String[] sub =new String[6]; String[] ssub=new String[3];
		    sub[0]=so.substring(0,index[0]);
		    for(int i=1;i<5;i++){
		       sub[i]=so.substring(index[i-1]+1, index[i]);
		    }
		    sub[5]=so.substring(index[4]+1,end);
		    
		    int endOfDate=sub[5].length();
		    Dindex[0]=sub[5].indexOf("-");
		    for(int i=1;i<2;i++){
			       Dindex[i]=sub[5].indexOf("-", Dindex[i-1]+1);
			}
		    ssub[0]=sub[5].substring(0,Dindex[0]);
		    for(int i=1;i<2;i++){
		       ssub[i]=sub[5].substring(Dindex[i-1]+1, Dindex[i]);
		    }
		    ssub[2]=sub[5].substring(Dindex[1],endOfDate);
		    
		    double pua=Double.parseDouble(sub[2]);
		    double pui=Double.parseDouble(sub[3]);
		    int quantite=Integer.parseInt(sub[4]);
		    int jour=Integer.parseInt(ssub[0]);
		    int moi=Integer.parseInt(ssub[1]);
		    int anner=Integer.parseInt(ssub[2]);
		    Moment date=new Moment(jour,moi,anner);
		    Entreprise a=new Entreprise(sub[0],sub[1],pua,pui,quantite,date);
		    this.ajouter(a);    
		}
		
		
	}
	
	
	public void afficherNonTrier(){
		Iterator it;
		it=listEntreprise.iterator();
		System.out.println("");
		while(it.hasNext()){
			Entreprise a=new Entreprise((Entreprise) it.next());
			a.afficher();
		}
	}
	
	
	
	
	public static void main(String[] args){
		//Action a1=new Action("Yahoo",3000,3);
		//Action a2=new Action("Google",5000,5);
		
		PorteFeuille ta=new PorteFeuille();
		String path="G:/projet_info--fise2/projet_info/ListEntreprise.txt";
		ta.chargerFile(path);
		ta.afficherNonTrier();
	}
}
