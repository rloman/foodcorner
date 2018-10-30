package nl.smulweb.foodcorner.primitives;

public class Application {

   public static void main(String[] args) {
      byte b = 13;

      System.out.println(b);

      byte c = 127;
      byte d = 127;

      d++;

      System.out.println(d);

      short s = 32767;
      s++;
      System.out.println(s);

      int age = 2881818;

      long langeLeeftijd = 2888181811L;

      System.out.println(2888181811L);

      float weight = 3.5F;

      double alternativeWeight = 3.5;

      // normale dingen gedaan.

      int a = 0b10101101; // 173 ??

      int andere = 0b1;

      int saldo = a + andere;

      System.out.println(saldo);

      int hexaIngevoerdeInt = 0xab;

      System.out.println(hexaIngevoerdeInt);

      int octaalIngevoerdeInt =  017;// 7x1 + 1x8 = 15
      int octaalIngevoerdeInt2 = 020; // 0x1 + 2 x8 = 16;

      System.out.println(octaalIngevoerdeInt + octaalIngevoerdeInt2);

   }

}
