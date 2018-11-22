package com.csueastbay;

public class Temperature {

	private float temperature;
	private char scale;
	
	public void setTemperature(float temperature)
	{
		this.temperature=temperature;
	}
	
	public float getTemperature()
	{
		return temperature;
	}
	
	public void setScale(char scale)
	{
		this.scale=scale;
	}
	
	public char getScale()
	{
		return scale;
	}
	
	public Temperature(float temperature)
	{
		this.temperature=temperature;
		this.scale='C';
	}
	
	public Temperature(char scale)
	{
		this.temperature=0.0f;
		this.scale=scale;
	}
	
	public Temperature(float temperature,char scale)
	{
		this.temperature=temperature;
		this.scale=scale;
	}
	
	public Temperature()
	{
		this.temperature=0.0f;
		this.scale='C';
	}
	
	public float FareinheitToCelsius(float degreesInF)
	{
		float degreesF=degreesInF;
		float degreesC=(5*(degreesF-32))/9.0f;
		return degreesC;
	}
	
	public float CelsiusToFareinheit(float degreesInC)
	{
		float degreesC=degreesInC;
		float degreesF=(9*(degreesC/5))+32;

		return degreesF;
	}
	
	public void setAllFields(float temperature,char scale)
	{
		this.temperature=temperature;
		this.scale=scale;
	}
	
	
	public static int CompareTemperature(Temperature t1,Temperature t2)
	{
		if(t1.scale == 'C' && t2.scale == 'F')
		{
			if(t1.temperature+32.0f == (t2.temperature))
			{
				return 0;
			}
		}
		else
		{
			if(t1.temperature>t2.temperature)
				return 1;
			else
				return -1;
		}
		return -32;
	}
	
}
