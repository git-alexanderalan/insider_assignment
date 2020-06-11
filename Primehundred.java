public class Primehundred
{
   public static void main(String args[])
   {
      int value = 1;
      int prime = 3;
      System.out.println("First 100 prime numbers are:");   
      System.out.println(2);
      for ( int i = 2 ; i <=100 ;  )
      {
         for ( int j = 2 ; j <= Math.sqrt(prime) ; j++ )
         {
            if ( prime%j == 0 )
            {
               value = 0;
               break;
            }
         }
         if ( value != 0 )
         {
            System.out.println(prime);
            i++;
         }
         value = 1;
         prime++;
      }         
   }
}