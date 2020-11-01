package employee;

import java.util.ArrayList;
import java.util.HashMap;

public class CompanyEmpWage {
	
	  public final String company;
	  public final int empRatePerHr;
	  public final int numberOfWorkingDays;
	  public final int maxHrPerMonth;
	  public int totalEmpWage;
	  ArrayList<Integer> dailyWage = new ArrayList<Integer>();

	  
	  public CompanyEmpWage(String company, int empRatePerHr, int numberOfWorkingDays, int maxHrPerMonth) {
	    this.company = company;
	    this.empRatePerHr = empRatePerHr;
	    this.numberOfWorkingDays = numberOfWorkingDays;
	    this.maxHrPerMonth = maxHrPerMonth;
	  }

	  
	  public void setTotalEmpWage(int totalEmpWage) {
	    this.totalEmpWage = totalEmpWage;
	  }

	  public String toString() {
	    return "Total Employee wages for: " + company + " is " + totalEmpWage;
	  }
}
