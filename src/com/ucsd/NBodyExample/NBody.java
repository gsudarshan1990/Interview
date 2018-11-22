package com.ucsd.NBodyExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import edu.princeton.cs.introcs.StdDraw;

public class NBody {

	public static String image="./images/starfield.jpg";
	
	static double readRadius(String filename)
	{
		
		File file=new File(filename);
		FileReader fr=null;
		BufferedReader br;
		double realRadius = 0;
		try {
			fr=new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String data="";
		br=new BufferedReader(fr);
		try {
			while((data=br.readLine())!=null)
			{
				try
				{
					realRadius=Double.parseDouble(data);
				}
				catch(NumberFormatException Ne)
				{
					
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return realRadius;
	}

	static Planet[] readPlanets(String filename)
	{
		File file=new File(filename);
		FileReader fr=null;
		BufferedReader br=null;
		String data=null;
		ArrayList<Integer> stringindex=new ArrayList<Integer>();
		ArrayList<Planet> planets=new ArrayList<Planet>();
		try {
			fr=new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		br=new BufferedReader(fr);
		try {
			while((data=br.readLine())!=null)
			{
				if(data.contains(".gif"))
				{
					System.out.println(data);
					String[] split=data.split(" ");
					for(int i=0;i<split.length;i++)
					{		
						if(split[i].isEmpty())
						{
							continue;
						}
						else
						{
							System.out.println(split[i]);
						
							stringindex.add(i);
						}
					}
					System.out.println(stringindex);
					
					double xxPos=Double.parseDouble(split[stringindex.get(0)]);
					double yyPos=Double.parseDouble(split[stringindex.get(1)]);
					double xxVel=Double.parseDouble(split[stringindex.get(2)]);
					double yyVel=Double.parseDouble(split[stringindex.get(3)]);
					double mass=Double.parseDouble(split[stringindex.get(4)]);
					String imgFileName=split[stringindex.get(5)];
					Planet P=new Planet(xxPos,yyPos,xxVel,yyVel,mass,imgFileName);
					planets.add(P);
					stringindex.clear();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Planet[] planetarray=new Planet[planets.size()];
		planets.toArray(planetarray);
		return planetarray;
		
	
	}
	
	public static void main(String[] args)
	{
		
		double T=Double.parseDouble(args[0]);
		double dt=Double.parseDouble(args[1]);
		String filename="./"+args[2];
		File file=new File(filename);
		FileReader fr=null;
		BufferedReader br=null;
		String line="";
	
		double universeradius=readRadius(filename);
		System.out.println(universeradius);
		
		try {
			fr=new FileReader(filename);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		StdDraw.picture(0,0, image);
		Planet[] planetarray=readPlanets(filename);
		
		for(int i=0;i<planetarray.length;i++)
		{
			planetarray[i].drawPlanet();
		}
		
		
		
	}
}

