package nl.smulweb.foodcorner.salmon;


public class Salmon {
   
   int count;
   
   // let op: dit is een methode
   public void Salmon() {
      count = 4;
   }
   
   // let op: je krijgt dus een default constructor cadeau 
   
   public Salmon(){
      
   }

   public static void main(String[] args) {
      Salmon r = new Salmon();
      System.out.println(r.count);
   }

}
