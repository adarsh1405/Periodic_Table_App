import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
Check if An Element Exists
boolean isElement(int N)   ->  return true if An Element with Atomic Number N exists
boolean isElement(String S)   ->  return true Checks if An Element with Symbol S exists


Getting Element data
getElementBySymbol(String S)   ->  return element data array of Symbol S
getElementByNumber(int N)   ->  return element data array of Atomic number N
getElementByName(String S)   ->  return element data array of Name S

Get Formatted Data
formant(String[] data)   ->  return formatted data array suitable for printing

*/
class PeriodicData {
	String csvFile;
	String separator;
	String[][] elements;
	String header[];
	PeriodicData()
	{
		csvFile="data.csv";
		separator=",";
		header=getHeader();
		elements=getData(2);
	}
	PeriodicData(String file)
	{
		csvFile=file;
		separator=",";
		header=getHeader();
		elements=getData(2);
	}
	PeriodicData(String file,String sep)
	{
		csvFile=file;
		separator=sep;
		header=getHeader();
		elements=getData(2);
	}
	String[] getElementBySymbol(String symbol)
	{
		return getElement(symbol,2);
	}
	String[] getElementByNumber(int atomicNumber)
	{
		return getElement(atomicNumber+"",0);
	}
	String[] getElementByName(String name)
	{
		return getElement(name,1);
	}
	boolean isElement(String symbol)
	{
		return getElementBySymbol(symbol).length!=0;
	}
	boolean isElement(int atomicNumber)
	{
		return getElementByNumber(atomicNumber).length!=0;
	}
	String[] format(String[] data)
	{
		List<String> res = new ArrayList<String>();
		if(data.length != header.length)
		{
			System.out.println("Invalid Data Sent!!!");
			return new String[0];
		}
		for(int i=0;i<data.length;i++)
		{
			if (data[i].length()==0)
				continue;
			res.add(header[i]+"  :  "+data[i]);
		}
		String[] result = new String[res.size()];
		return res.toArray(result);
	}
	String[] parse(String line)
	{
		List<String> element = new ArrayList<String>();
		boolean inquote=false;
		String temp="";
		for(int i=0;i<line.length();i++)
		{
			char ch=line.charAt(i);
			if (ch=='\"')
			{    inquote=!inquote;
				continue;
				}
		
			if(ch==',' && !inquote)
			{
				element.add(temp.replaceAll("_"," ").trim());
				temp="";
			}
			else
				temp+=ch;
		}
		
		String[] arr_elem = new String[element.size()];
		return element.toArray(arr_elem);
	}
	String[] getHeader()
	{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(csvFile));
			String line = br.readLine();
			if (line!=null)
				return parse(line);
			br.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new String[0];
	}
	String[][] getData(int startline)
	{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(csvFile));
			for(int i=1;i<startline;i++)
				br.readLine();
			String result[][] = new String[120][];
			int arrind=0;
			String line="";
			while ((line = br.readLine()) != null) {
				result[arrind++]=parse(line);
			}
			String[][] presult=new String[arrind][];
			for(int i=0;i<arrind;i++)
			{
				presult[i]=result[i];
			}
			return presult;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new String[0][0];
	}
	String[] getElement(String property,int propertyIndex)
	{
		for (int i=0;i<elements.length;i++)
		{
			if(elements[i][propertyIndex].equalsIgnoreCase(property))
			{
				return elements[i];
			}
		}
		return new String[0];
	}
	public static void main(String[] args) {
		PeriodicData pd= new PeriodicData();
		while(true)
		{
			System.out.print("Enter Symbol To Search: ");
			String symbol=new Scanner(System.in).nextLine();
			String data[]=pd.getElementBySymbol(symbol);
			String[] res=pd.format(data);
			for(String s : res)
				System.out.println(s);
		}

	}

}