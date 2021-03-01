public class Loan
{
  //variables
  private int ID;
  private double loanAmount;
  private String country;
  private int daysToFund;
  private int numLenders;
  //instantiator 
  public Loan(int ID, double loanAmount, String country, int daysToFund,int numLenders){
    this.ID = ID;
    this.loanAmount = loanAmount;
    this.country = country;
    this.daysToFund = daysToFund;
    this.numLenders = numLenders;
  }
  //getters
  public int getID(){return ID;}
  public double getLoanAmount(){return loanAmount;}
  public int getDaysToFund(){return daysToFund;}
  public int getNumLenders(){return numLenders;}
  public String getCountry(){return country;}
  //setters
  public void setID(int id){ID = id;}
  public void setDaySToFund(int days){daysToFund = days;}
  public void setLoanAmount(double loan){loanAmount = loan;}
  public void setNumLenders(int lenders){numLenders = lenders;}
  //toString
  public String toString(){return "ID: " + ID + " amount: " + loanAmount + " country: " + country + " days to fund: " + daysToFund + " number of lenders: " + numLenders;}
}
