package core;

import java.util.Date;
import java.util.NavigableMap;

public interface TrancheInterface
{

    public Date getMaturity();
    
    public double getDuration();
    
    public double getWAL();
    
    public NavigableMap<Date,Double> getCapitalRepayments();
    
    public double getOutstanding(Date pDate);
    
    public NavigableMap<Date,Double> getInterestPayments();
    
}
