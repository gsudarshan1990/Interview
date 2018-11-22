package com.csueastbay;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length==0)
		{	
			Temperature T1=new Temperature();
			Temperature T2=new Temperature(21.2f);
			Temperature T3=new Temperature('F');
			Temperature T4=new Temperature(28.2f,'C');
		
			System.out.println("T1:Temperature:"+T1.getTemperature()+",Scale:"+T1.getScale());
			System.out.println("T2:Temperature:"+T2.getTemperature()+",Scale:"+T2.getScale());
			System.out.println("T3:Temperature:"+T3.getTemperature()+",Scale:"+T3.getScale());
			System.out.println("T4:Temperature:"+T4.getTemperature()+",Scale:"+T4.getScale());
			System.out.println("After set Temperature");
			T1.setTemperature(22.2f);
			System.out.println("T1:Temperature:"+T1.getTemperature()+",Scale:"+T1.getScale());
			System.out.println("After set Scale");
			T4.setScale('F');
			System.out.println("T4:Temperature:"+T4.getTemperature()+",Scale:"+T4.getScale());
		
			System.out.println("After Set all Fiels");
			T3.setAllFields(32.5f, 'C');
			System.out.println("T3:Temperature:"+T3.getTemperature()+",Scale:"+T3.getScale());
		
			System.out.println("Celcius:32.2,Fareinheit:"+T1.CelsiusToFareinheit(32.2f));
			System.out.println("Fareinheit:15.1,Celcuis:"+T1.FareinheitToCelsius(15.1f));
		}
		else
		{
			String s1=args[0];
			String s2=args[1];
			String stringtemperature1="";
			String stringtemperature2="";
			char scale1 = 0;
			char scale2 = 0;
			
			for(int i=0;i<s1.length();i++)
			{
				char c=s1.charAt(i);
				if((c >='a' && c<='z')  ||(c>='A' && c<='Z' ))
				{
					stringtemperature1=s1.substring(0, i);
					scale1=c;
				}
			}
			
			for(int j=0;j<s2.length();j++)
			{
				char c=s2.charAt(j);
				if((c >='a' && c<='z')  ||(c>='A' && c<='Z' ))
				{
					stringtemperature2=s2.substring(0, j);
					scale2=c;
				}
			}
			
			float floattemperature1=Float.parseFloat(stringtemperature1);
			float floattemperature2=Float.parseFloat(stringtemperature2);
		
			
			Temperature T1=new Temperature(floattemperature1,scale1);
			Temperature T2=new Temperature(floattemperature2,scale2);
			
			
			
			System.out.println(Temperature.CompareTemperature(T1, T2));
		
		}
	}

}
