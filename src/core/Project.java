package core;

import java.util.ArrayList;
import java.util.Date;
import java.util.NavigableMap;

public class Project implements TrancheInterface
{

    private String name;
    private Date startDate;
    private ArrayList<Tranche> tranches;
    
    public Project(String pName)
    {
	this.name = pName;
	this.tranches = new ArrayList<Tranche>();
    }

    @Override
    public Date getMaturity()
    {
	return null;
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
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public double getOutstanding(Date pDate)
    {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public NavigableMap<Date, Double> getInterestPayments()
    {
	// TODO Auto-generated method stub
	return null;
    }
    
    public Date getStartDate()
    {
        return startDate;
    }

    public void setStartDate(Date startDate)
    {
        this.startDate = startDate;
    }

    public ArrayList<Tranche> getTranches()
    {
        return tranches;
    }

    public void addTranche(Tranche tranche)
    {
        this.tranches.add(tranche);
    }
    
    public boolean removeTranche(Tranche tranche)
    {
	return this.tranches.remove(tranche);
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
