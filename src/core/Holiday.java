package core;

import java.util.ArrayList;
import java.util.Date;

public class Holiday
{

    private CountryCode countryCode;
    private ArrayList<Date> dates;
    
    public Holiday(CountryCode pCountryCode, ArrayList<Date> pDates)
    {
	this.countryCode = pCountryCode;
	this.dates = pDates;
    }
    
    public boolean isHoliday(Date date)
    {
	return dates.contains(date);
    }

    public CountryCode getCountryCode()
    {
        return countryCode;
    }

    public ArrayList<Date> getDates()
    {
        return dates;
    }
    
    
}
