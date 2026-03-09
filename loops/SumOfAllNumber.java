public class SumOfAllNumbers {
    public static void main (String [] args) {
        int TotalSum = 0;
        int DivisbleByFive = 0;

        
        for (int num = 1; num <= 50; num+=1){
            TotalSum += num;
          
              
            if (num % 5 != 0){
               DivisbleByFive += num;
            }
        }

        System.out.println("Sum of all number from 1-50: " +TotalSum);
        System.out.println("Sum excluding numbers divisible by 5: " +DivisbleByFive);
    }
}