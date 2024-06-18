package collectionExamples.ListExamples;

import java.util.*;

public class ListOfObjects {

	public static void main(String[] args) {
		 
		
		Color c= new Color(1, "Black");
		
		
		List <Color> lstColor = new ArrayList<Color>();
		
		lstColor.add(new Color(2,"White"));

		lstColor.add(new Color(3,"Blue"));
		lstColor.add(new Color(4,"Red"));
		lstColor.add(new Color(5,"Green"));
		lstColor.add(new Color(6,"Yellow"));
		
		for(Color clr : lstColor)	{
		System.out.println(clr);
		}
		
	//	Collections.sort(lstColor);
	}
	
	
	

}
