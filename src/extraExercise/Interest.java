package extraExercise;


//Fig. 5.6 | Compound-interest calculations with for.
public class Interest {
        public static void main(String[] args)
         {
         double amount; // amount on deposit at end of each year
             double principal = 1000.0; // initial amount before interest
             double rate = 0.05; // interest rate

            // display headers
             System.out.printf("%s%20s%n", "Year", "Amount on deposit");

             // calculate amount on deposit for each of ten years
             for (int year = 1; year <= 10; ++year)
             {

                 // calculate new amount for specified year
                 amount = principal * Math.pow(1.0 + rate, year);

                 // display the year and the amount
                 System.out.printf("%4d%,20.2f%n", year, amount);

             }
         }
    } // end class Interest
//    Year Amount on deposit
// 1 1,050.00
//         2 1,102.50
//         3 1,157.63
//         4 1,215.51
//         5 1,276.28
//         6 1,340.10
//         7 1,407.10
//         8 1,477.46
//         9 1,551.33
//         10 1,628.89


