package nl.smulweb.foodcorner.model;


public class Stove {
   
   private int temperature;
   private int maxTemperature;
   
   public Stove(int maxTemperature) {
      this.maxTemperature = maxTemperature;
   }

   public void raiseTemperature() {
      this.temperature = this.temperature + 50;
   }
   
   public int getTemperature() {
      return temperature;
   }

   
   public int getMaxTemperature() {
      return maxTemperature;
   }
   
  
   
   
   
   

}
