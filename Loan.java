public class Loan
{
  private int ID;
  private double loanAmount;
  private String country;
  private int daysToFund;
  private int numLenders;
    
  public Loan(int ID, double loanAmount, String country, int daysToFund,int numLenders){
    this.ID = ID;
    this.loanAmount = loanAmount;
    this.country = country;
    this.daysToFund = daysToFund;
    this.numLenders = numLenders;
  }

  public int getID(){return ID;}
  public double getLoanAmount(){return loanAmount;}
  public int getDaysToFund(){return daysToFund;}
  public int getNumLenders(){return numLenders;}

  public void setID(int id){ID = id;}
  public void setDaySToFund(int days){daysToFund = days;}
}