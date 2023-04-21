//Santiago, Bryan Aaron B. | ICT-101

import java.util.*;  

public class ArrayListExample
{  
	static void ProvinceList()
	{
    	//Province Array
    	String[] provinceList = {"Abra", "Agusan del Norte", "Agusan del Sur", "Aklan", "Albay", "Antique", "Apayao", "Aurora", "Basilan", "Bataan", "Batanes", "Batangas", "Benguet", "Biliran", "Bohol", "Bukidnon", "Bulacan", "Cagayan", "Camarines Norte", "Camarines Sur"};

   	//Converting Array to List
    	List<String> list = new ArrayList<String>();
    	for(String province:provinceList)
    	{
     		list.add(province);
    	}
    	System.out.println(list);
  	}
  	public static void main(String[] args)
  	{
    		ProvinceList();
  	}
} 