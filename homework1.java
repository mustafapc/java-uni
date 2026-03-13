public class homework1{
    public static void main(String[] args){
        /*
        *
        **
        * *
        *  *
        *   *
        *    *
        *     *
        *      *
        *       *
        *        *
        ***********
        */
       System.out.println("*");
       int counter = 0;
       int counter2 = 0;
       while(counter < 8){
        System.out.print("*");
        while(counter2 < counter){
            System.out.print(" ");
            counter2++;
        }
        System.out.println("*");
        counter2 = 0;
        counter++;
       }
       counter = 0;
        while(counter < 10){
        System.out.print("*");
        counter++;
       }
       counter = 0;
       counter2 = 0;
       System.out.println("");
       //
       System.out.println("");
       /*
       ***********
       *        *
       *       *
       *      *
       *     *
       *    *
       *   *
       *  *
       * *
       **
       *
       */
      while(counter < 10){
        System.out.print("*");
        counter++;
       }
       System.out.println("");
        counter = 8;
        while(counter > 0){
        System.out.print("*");
        while(counter2 < counter - 1){
            System.out.print(" ");
            counter2++;
        }
        System.out.println("*");
        counter2 = 0;
        counter--;
       }
       counter = 0;
       counter2 = 0;
       System.out.println("*");
       System.out.println("");
       //
       /*
            *
           * *
          *   *
         *     *
        *       *
       *********** 
       */
      int counter3 = 0;
      counter = 4;
      //first line
      while(counter3 <= 5){
        if(counter3 == 5){
            System.out.println("*");
            counter3 = 0;
            break;
        }else{
            System.out.print(" ");
        }
        counter3++;
      }
      //first line complete
      counter3 = 0;
      while(counter > 0){
        while(counter2 < counter){
            System.out.print(" ");
            counter2++;
        }
        System.out.print("*");
        System.out.print(" ");
        while(counter3 < (4 - counter) * 2){
            System.out.print(" ");
            counter3++;
        }
        System.out.println("*");
        counter3 = 0;
        counter2 = 0;
        counter--;
      }
      counter = 0;
      counter2 = 0;
      counter3 = 0;
      while(counter < 11){
        System.out.print("*");
        counter++;
      }
      System.out.println();
    }
}