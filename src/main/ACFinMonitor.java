package main;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.NavigableMap;
import java.util.TreeMap;

import core.FixedRateTranche;
import core.Project;

public class ACFinMonitor
{

    private ArrayList<Project> projects;
    
    public ACFinMonitor()
    {
	projects = new ArrayList<Project>();
	NavigableMap<Date, Double> capitalRepaymentsVCA = new TreeMap<Date, Double>();
	capitalRepaymentsVCA.put(new Date(113,2,8),150615000.00);
	capitalRepaymentsVCA.put(new Date(113,2,18),150615000.00);
	capitalRepaymentsVCA.put(new Date(113,5,10),147792237.00);
	capitalRepaymentsVCA.put(new Date(113,8,9),144956962.00);
	capitalRepaymentsVCA.put(new Date(113,11,9),142109120.00);
	capitalRepaymentsVCA.put(new Date(114,2,10),139248655.00);
	capitalRepaymentsVCA.put(new Date(114,5,9),136375511.00);
	capitalRepaymentsVCA.put(new Date(114,8,8),133489632.00);
	capitalRepaymentsVCA.put(new Date(114,11,8),130590961.00);
	capitalRepaymentsVCA.put(new Date(115,2,9),127679442.00);
	capitalRepaymentsVCA.put(new Date(115,5,8),124755018.00);
	capitalRepaymentsVCA.put(new Date(115,8,8),121817631.00);
	capitalRepaymentsVCA.put(new Date(115,11,8),118867224.00);
	capitalRepaymentsVCA.put(new Date(116,2,8),115903739.00);
	capitalRepaymentsVCA.put(new Date(116,5,8),112927119.00);
	capitalRepaymentsVCA.put(new Date(116,8,8),109937305.00);
	capitalRepaymentsVCA.put(new Date(116,11,8),106934239.00);
	capitalRepaymentsVCA.put(new Date(117,2,8),103917861.00);
	capitalRepaymentsVCA.put(new Date(117,5,8),100888113.00);
	capitalRepaymentsVCA.put(new Date(117,8,8),97844936.00);
	capitalRepaymentsVCA.put(new Date(117,11,8),94788270.00);
	capitalRepaymentsVCA.put(new Date(118,2,8),91718055.00);
	capitalRepaymentsVCA.put(new Date(118,5,8),88634232.00);
	capitalRepaymentsVCA.put(new Date(118,8,10),85536740.00);
	capitalRepaymentsVCA.put(new Date(118,11,10),82425518.00);
	capitalRepaymentsVCA.put(new Date(119,2,8),79300506.00);
	capitalRepaymentsVCA.put(new Date(119,5,10),76161642.00);
	capitalRepaymentsVCA.put(new Date(119,8,9),73008865.00);
	capitalRepaymentsVCA.put(new Date(119,11,9),69842113.00);
	capitalRepaymentsVCA.put(new Date(120,2,9),66661325.00);
	capitalRepaymentsVCA.put(new Date(120,5,8),63466438.00);
	capitalRepaymentsVCA.put(new Date(120,8,8),60257389.00);
	capitalRepaymentsVCA.put(new Date(120,11,8),57034116.00);
	capitalRepaymentsVCA.put(new Date(121,2,8),53796556.00);
	capitalRepaymentsVCA.put(new Date(121,5,8),50544646.00);
	capitalRepaymentsVCA.put(new Date(121,8,8),47278322.00);
	capitalRepaymentsVCA.put(new Date(121,11,8),43997520.00);
	capitalRepaymentsVCA.put(new Date(122,2,8),40702175.00);
	capitalRepaymentsVCA.put(new Date(122,5,8),37392224.00);
	capitalRepaymentsVCA.put(new Date(122,8,8),34067601.00);
	capitalRepaymentsVCA.put(new Date(122,11,8),30728242.00);
	capitalRepaymentsVCA.put(new Date(123,2,8),27374081.00);
	capitalRepaymentsVCA.put(new Date(123,5,8),24005053.00);
	capitalRepaymentsVCA.put(new Date(123,8,8),20621092.00);
	capitalRepaymentsVCA.put(new Date(123,11,8),17222131.00);
	capitalRepaymentsVCA.put(new Date(124,2,8),13808105.00);
	capitalRepaymentsVCA.put(new Date(124,5,10),10378946.00);
	capitalRepaymentsVCA.put(new Date(124,8,9),6934587.00);
	capitalRepaymentsVCA.put(new Date(124,11,9),3474961.00);
	capitalRepaymentsVCA.put(new Date(125,2,10),0.00);

	FixedRateTranche seniorLoanVCA = new FixedRateTranche("Senior Loan VCA", 0.0055, capitalRepaymentsVCA, 0.012);
	Project p1 = new Project("VCA");
	p1.addTranche(seniorLoanVCA);
	projects.add(p1);
	System.out.println(seniorLoanVCA.getMaturity());
	Date test = new Date(118, 5, 14);
	NumberFormat f = new DecimalFormat("###,##0.00");
	System.out.println(f.format(seniorLoanVCA.getOutstanding(test)));
    }
}
