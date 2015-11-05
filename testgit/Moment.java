
public class Moment {
        private int jj;
        private int mm;
        private int aa;
        
      public Moment(int jj,int mm,int aa){
    	  this.jj=jj;
    	  this.aa=aa;
    	  this.mm=mm;
      }  
      
      public void setJj(int jj){
    	  this.jj=jj;
      }
      public void setMm(int mm){
    	  this.mm=mm;
      }
      public void setAa(int aa){
    	  this.aa=aa;
      }
      
      public int getJj(){
    	  return this.jj;
      }
      public int getMm(){
    	  return this.mm;
      }
      public int getAa(){
    	  return this.aa;
      }
      
      public String toString(){
    	  return this.jj+"-"+this.mm+"-"+this.aa;
      }
      
      //test  
      /*
      public static void main(String[] args){
    	  Moment m=new Moment(10,02,1992);
    	  System.out.println(m);
      }
      // valider
      */
      
      
}
