public class deretprima {

    public static void main(String[] args) {
      
      int i, j;
      boolean prima;
  
      System.out.println("\n Menghitung Deret Bilangan Prima dari 0 - 20");
      for (i = 2; i <= 20; i++) {
        prima = true;
        for (j = 2; j <= Math.sqrt(i); j++) {
          if (i % j == 0) {
            prima = false;
            break;
          }
        }
        if (prima) {
          System.out.println(i);
        }
      }
  
      System.out.println("\n Menghitung Deret Bilangan Bukan Prima dari 0 - 20");
      for (i = 0; i <= 20; i++) {
        if (i <= 1) {
          continue;
        }
        prima = true;
        for (j = 2; j <= Math.sqrt(i); j++) {
          if (i % j == 0) {
            prima = false;
            break;
          }
        }
        if (!prima) {
          System.out.println(i);
        }
      }
    }
  }
