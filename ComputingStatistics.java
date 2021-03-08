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
    public String smallestLoanCountry(){
        String smallCountry = " ";
        double smallestLoan = smallestLoan();
        for(Loan loan:data){
            if(loan.getLoanAmount() == smallestLoan){
                smallCountry = loan.getCountry();
            }
        }
        return smallCountry;
   }
    public String largestLoanCountry(){
       String largestCountry = " ";
       double largestLoan = largestLoan();
       for(Loan loan:data){
           if(loan.getLoanAmount() == largestLoan){
               largestCountry = loan.getCountry();
            }
        }
        return largestCountry;
    }
    public int avgDaysToFund(){
        int totalDays = 0;
        for(Loan loan:data){totalDays+=loan.getDaysToFund();}
        return (int)(double)totalDays/data.size();
    }
    public double avgLoan(String countryNm){//Jaden
        double avgLoan = 0.0;
        double counter = 1.0;//to divide loan by
        for(Loan loan:data){
            if(loan.getCountry().equals(countryNm)){ //sifts through data
                counter = counter + 1;
                avgLoan = avgLoan + loan.getLoanAmount();
            }
        }
        avgLoan = avgLoan / counter;
        return avgLoan;
    }
}