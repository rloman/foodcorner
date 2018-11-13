package nl.smulweb.foodcorner.interfaces;

public class Samsung implements Television {

   private boolean on;
   private int channel;
   private int volume;

   private double price;
   
   private static int counter;
   
   private static String label = "TV";
   
   static {
      System.out.println("Dit is het eerste static block");
   }
   
   static {
      System.out.println("Dit is het tweede static block");
   }
   
   static {
      System.out.println("Dit is het derde static block");
      counter = label.length() * 2;
   }
   
   {
      channel = -1;
      System.out.println("in eerste init block");
   }
   
   {
      channel = -3;
      price = 450;
      System.out.println("in tweede init block");
   }

   public Samsung(){
      System.out.println("in de constructor");
   }
   
   @Override
   public void on() {
      this.on = true;
   }

   public double getPrice() {
      return (price += price * BTW / 100);
   }

   @Override
   public void off() {
      this.on = false;
      cleanScreen();
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
