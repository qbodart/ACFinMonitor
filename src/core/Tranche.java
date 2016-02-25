package core;

import java.util.Date;
import java.util.NavigableMap;
import java.util.TreeMap;


public abstract class Tranche implements TrancheInterface
{

    private String name;
    private double margin;
    private NavigableMap<Date,Double> capitalRepayments;
    
    protected Tranche (String pName, double pMargin, NavigableMap<Date, Double> pCapitalRepayments)
    {
	this.name = pName;
	this.margin = pMargin;
	this.capitalRepayments = pCapitalRepayments;
    }
    
    abstract double getInterestPayment(Date date);

    @Override
    public Date getMaturity()
    {
	return capitalRepayments.lastKey();
    }
    
    @Override
    public double getDuration()
    {
	return 0;
    }
    
    @Override
    public double getWAL()
    {
	
	return 0;
    }
    
    @Override
    public NavigableMap<Date, Double> getCapitalRepayments()
    {
	return capitalRepayments;
    }

    @Override
    public double getOutstanding(Date pDate)
    {
	return capitalRepayments.lowerEntry(pDate).getValue();
    }

    @Override
    public NavigableMap<Date, Double> getInterestPayments()
    {
	NavigableMap<Date, Double> interestPayments = new TreeMap<>();
	for(Date d : capitalRepayments.keySet())
	{
	    interestPayments.put(d, getInterestPayment(d));
	}
	return interestPayments;
    }
    
    public double getMargin()
    {
        return margin;
    }

    public void setMargin(double margin)
    {
        this.margin = margin;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    
    
    
}
