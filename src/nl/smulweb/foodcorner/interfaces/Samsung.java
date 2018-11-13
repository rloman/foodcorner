package nl.smulweb.foodcorner.interfaces;


public class Samsung implements Television {
   
   private boolean on;
   private int channel;
   private int volume;
   
   @Override
   public void on() {
      this.on = true;
   }

   @Override
   public void off() {
      this.on = false;
   }

   @Override
   public int increaseVolume() {
      return ++volume;
   }

   @Override
   public void switchChannel(int newChannel) {
      this.channel = newChannel;
   }

}
