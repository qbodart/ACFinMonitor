package core;

import java.util.Date;
import java.util.NavigableMap;

public class FloatingRateTranche extends Tranche
{

    private InterestRateIndex index;
    
    public FloatingRateTranche(String pName, double pMargin, NavigableMap<Date, Double> pCapitalRepayments, InterestRateIndex pIndex)
    {
	super(pName, pMargin, pCapitalRepayments);
	this.index = pIndex;
    }

    @Override
    double getInterestPayment(Date date)
    {
	// TODO Auto-generated method stub
	return 0;
    }

    public InterestRateIndex getIndex()
    {
        return index;
    }
    
    

}
