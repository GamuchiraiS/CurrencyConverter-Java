import java.text.DecimalFormat;

public class CurrencyConverter {
	//fields
	public int convertF, convertT;
	public double amount, result;
	//for rounding off
	DecimalFormat df = new DecimalFormat("#.##");
	
	//constructor
	public CurrencyConverter(double a, int cf, int ct) {
		convertF = cf;
		convertT = ct;
		amount = a;
		result = 0.0;
	}
	
	//method for calculting the result/converted amount
	public double calculateCurrency() {
        //If the user is converting from USD to USD
        if (convertF == 1 && convertT == 1)
        {
            System.out.println("You can't convert between the same currencies");
        }
        //If the user is converting from USD to ZAR
        else if (convertF == 1 && convertT == 2)
        {
            result = amount * 14.83;
        }
        //If the user is converting from USD to EURO
        else if (convertF == 1 && convertT == 3)
        {
            result = amount * 0.85;
        }
        //If the user is converting from USD to Bitcoin
        else if (convertF == 1 && convertT == 4)
        {
            result = amount * 0.000023;
        }

        //--------------------------------------------------------------
        //If the user is converting from ZAR to ZAR
        else if (convertF == 2 && convertT == 2)
        {
        	System.out.println("You can't convert between the same currencies");
        }
        //If the user is converting from ZAR to USD
        else if (convertF == 2 && convertT == 1)
        {
            result = amount * 0.068;
        }
        //If the user is converting from ZAR to EURO
        else if (convertF == 2 && convertT == 3)
        {
            result = amount * 0.058;
        }
        //If the user is converting from ZAR to Bitcoin
        else if (convertF == 2 && convertT == 4)
        {
            result = amount * 0.0000015;
        }

        //---------------------------------------------------------------------
        //If the user is converting from EURO --> EURO
        else if (convertF == 3 && convertT == 3)
        {
        	System.out.println("You can't convert between the same currencies");
        }
        //If the user is converting from EURO --> USD
        else if (convertF == 3 && convertT == 1)
        {
            result = amount * 1.17;
        }
        //If the user is converting from EURO --> ZAR
        else if (convertF == 3 && convertT == 2)
        {
            result = amount * 17.36;
        }
        //If the user is converting EURO --> Bitcoin
        else if (convertF == 3 && convertT == 4)
        {
            result = amount * 0.000024;
        }
        //--------------------------------------------------------------------
        //If the user is converting from Bitcoin --> Bitcoin
        else if (convertF == 4 && convertT == 4)
        {
        	System.out.println("You can't convert between the same currencies");
        }
        //If the user is converting from Bitcoin --> USD
        else if (convertF == 4 && convertT == 1)
        {
            result = amount * 43852.90;
        }
        //If the user is converting from Bitcoin --> ZAR
        else if (convertF == 4 && convertT == 2)
        {
            result = amount * 650263.96;
        }
        //If the user is converting Bitcoin --> EURO
        else if (convertF == 4 && convertT == 3)
        {
            result = amount * 37408.94;
        }
        else
        {
        	System.out.println("Please try again.");
        }
        return result;
	}
}
