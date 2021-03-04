import java.util.ArrayList;

public class ComputingStatistics{
   //the ArrayList containing all of the loan data
   private ArrayList<Loan> data;

   //Creates a new ComputingStatistics object with an empty ArrayList 
   public ComputingStatistics(){data = new ArrayList<Loan>();}

   //Creates a new ComputingStatistics object with the data passed in
   public ComputingStatistics(ArrayList<Loan> d){data = d;}

   //Calclates the total amount funded from all of the loans in the file
   //@return the total loan amount
   public double totalAmount(){
      double amount = 0;
      for(Loan loan:data){amount+=loan.getLoanAmount();}
      return amount;
   }

   //returns the average loan amount
   public double avgLoan(){return totalAmount()/data.size();}

   //returns the smallest loan
   public double smallestLoan(){
      double smallest = Double.POSITIVE_INFINITY;
      for(Loan loan:data){
         if(loan.getLoanAmount()<smallest){smallest=loan.getLoanAmount();}
      }
      return smallest;
   }
   //returns the largest loan
   public double largestLoan(){
       double largest = Double.NEGATIVE_INFINITY;
       for(Loan loan:data){
           if(loan.getLoanAmount()>largest){largest=loan.getLoanAmount();}
        }
        return largest;
    }
}