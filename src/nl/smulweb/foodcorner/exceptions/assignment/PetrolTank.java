package nl.smulweb.foodcorner.exceptions.assignment;


public class PetrolTank {
   
   private int currentLevel;
   private int maxLevel;
   
   public PetrolTank(int maxLevel) {
      this.maxLevel = maxLevel;
   }

   
   public int getCurrentLevel() {
      return currentLevel;
   }

   
   public int getMaxLevel() {
      return maxLevel;
   }
   
   public int fill(int liters) throws PetrolTankOverflowException {
      if(this.currentLevel + liters > this.maxLevel) {
         throw new PetrolTankOverflowException();
      }
      else {
         this.currentLevel += liters;
         return this.currentLevel;
      }
   }
}
