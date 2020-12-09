class Main {
  public static void main(String[] args) {
     // kindly use appropriate data types for your declaration
   //declare an array variable and assign the days of the month debtor defaulted,
   byte[] totalDays = new byte[9];
   // declare variables of amount the debtor is to pay per day, and amount the debtor paid and assign values to them
     int amountToPay = 1000 , amountPaid = 9000 ;
   
   // declare all the variables needed for your calculations
 byte totalPeriod = 12  ;
       byte value = 1;
       int amountLeft;
       int amountRemain = 3;
   // calculate and print total amount the debtor is to pay using for each loop
 
        byte[] totalAmount = new byte[12];


       

       for (int days = 0; days < 12 ; days++) {
           totalAmount[days] = value;
           value++;
       }
           System.out.println("output for each loop \n");
           for (int multi : totalAmount) {
               System.out.println(amountToPay +" x " + multi + " = " + amountToPay * multi);
           }
   // calculate the days the debtor paid for and print the days in which was paid for starting from the left to the right of the array. Also check if there was a day that the debtor did not pay the complete amount for that day, if yes, print the day and the amount left to pay for that day. 
  


        byte val = 1;

        for (int days = 0; days < 9 ; days++) {
            totalDays[days] = val;
            val++;
        }
        System.out.println("days paid  \n");
        for (int multip : totalDays) {
            System.out.println(multip + " x " + amountToPay + " = " + multip *amountToPay  );
        }
  System.out.println("days paid for \n ");
        System.out.println(amountPaid + " / " + amountToPay + " = " + amountPaid/amountToPay + "days " );
   // calculate amount the debtor is left to pay if he did not pay complete fees and the days not paid for or  check if the debtor paid extra and the extra amount he paid for, or if he paid the exact amount needed to be paid and print likewise

System.out.println(amountToPay + "x " + amountRemain + "= " + amountToPay * amountRemain);
   //kindly remove the statement below when you are done with the assignment
   
    
    
  }
}