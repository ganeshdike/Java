package Assignment23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DesignApp 
{
	public static void main(String[] args) 
	{
		List<String> listMH=new ArrayList<String>();
		listMH.add("Mumbai");
		listMH.add("pune");
		listMH.add("Nagpur");
		
		List<String> listKR=new ArrayList<String>();
		listKR.add("Bangalor");
		listKR.add("Mysore");
		
		List<String> listMP=new ArrayList<String>();
		listMP.add("Bhopal");
		listMP.add("Indore");
		
		HashMap<String,List<String>> hashMapState=new HashMap<String,List<String>>();
		hashMapState.put("Maharashtra", listMH);
		hashMapState.put("Karnataka", listKR);
		hashMapState.put("Madhya Pradesh", listMP);
		
		HashMap<String, HashMap<String,List<String>>> hashMapIn=new HashMap<String, HashMap<String,List<String>>>();
		hashMapIn.put("India",hashMapState);
		System.out.println(hashMapIn);
		
	}
}
