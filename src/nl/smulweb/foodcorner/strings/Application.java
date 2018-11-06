package nl.smulweb.foodcorner.strings;


public class Application {
   
   public static void main(String[] args) {
      String firstName = "Jan";
      String lastName = "Klaassen";
      
      String fullName = firstName + " " +lastName;
      
      fullName = lastName+", "+ firstName;
      
      System.out.println(fullName);
      
      int dag = 6;
      int month = 11;
      
      System.out.println("=> " + (dag + month) + " is vandaag!");
      
      
      firstName = "Ray";
      System.out.println("De lengte van firstName verwacht: 3 en is: "
      +firstName.length());
      
      char firstLetter = firstName.charAt(0);
      
      System.out.println("FirstLetter should be R and is: "+firstLetter);
      
      String zin = "fox jumps over the lazy dog";
      
      // String.indexOf returns -1 if not found
      int jumpLocation = zin.indexOf("jump"); 
      
      System.out.println("Jumplocation should be: 4 and is: "+jumpLocation);
      
      
      // String.contains returns true or false
      if(zin.contains("jump")) {
         
      }
      
      
      zin = "the quick brown fox jumps over the lazy dog";
      
      String brownFox = zin.substring(4);
      
      System.out.println(brownFox);
      
      System.out.println(">"+zin.substring(10, 19)+"<");
      
      
      String groteString = zin.toUpperCase();
      
      System.out.println(groteString);
      
      zin = zin.toUpperCase();
      
      String langeMetSpaces = "           dit is de feitelijke string        ";
      
      System.out.println(">"+langeMetSpaces+"<");
      System.out.println(">"+langeMetSpaces.trim()+"<");
      
   }

}
