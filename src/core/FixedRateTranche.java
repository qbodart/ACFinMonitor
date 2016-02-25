package core;

import java.util.Date;
import java.util.NavigableMap;

public class FixedRateTranche extends Tranche
{

    private double fixedRate;
    
    public FixedRateTranche(String pName, double pMargin, NavigableMap<Date, Double> pCapitalRepayments, double pFixedRate)
    {
	super(pName, pMargin, pCapitalRepayments);
	this.fixedRate = pFixedRate;
    }

    @Override
    double getInterestPayment(Date date)
    {
	// TODO Auto-generated method stub
	return 0;
    }

    public double getFixedRate()
    {
        return fixedRate;
    }
    
    

}
