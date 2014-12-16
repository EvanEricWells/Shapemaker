/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employee;

/**
 *
 * @author evan5090
 */
public abstract class Employee {
    String name, type;
    int hours;
    double rate;
    static double totalpay;
    
    public String getNameRules() {
	 	return "nonblank";
	}

	public String getTypeRules() {
		return "1 or 2";
	}


	public String getRateRules() {
		return "between 6.75 and 30.50, inclusive";
	}

	
	public String getHoursRules() {
		return "between 1 and 60, inclusive";
	}

	public boolean setName(String nm) {
		if (nm.equals(""))
			return false;
		else{
			name=nm;
			return true;
		}
	}

	
	public boolean setType(int tp) {
		if (tp != 1 && tp != 2)
			return false;
		else{
			tp=Integer.parseInt(type);
			return true;
		}
	}

	
	public boolean setRate(double rt) {
		if (rt < 6.75 || rt > 30.50)
			return false;
		else{
			rate=rt;
			return true;
		}
	}

	public boolean setHours(int hrs) {
		if (hrs < 1 || hrs > 60)
			return false;
		else{
			hours=hrs;
			return true;
		}
	}

	public String getName() {
		return name;
	}

	public double getPay() {
		if (hours <=40 || Integer.parseInt(type) == 2)
			return rate * hours;
		else
			return rate * 40 + (hours-40)*(rate*2);
	}
        
        public static double getTotalPay(){
            return totalpay; 
        }
        
        
        
        
        
}
