package com.ucsdjava.Planet;

public class Planet {

	static final double G=6.67e-11;
	
	double xxPos;
	double yyPos;
	double xxVel;
	double yyVel;
	double mass;
	String imgFileName;
	
	public Planet(double xP,double yP,double xV,double yV, double m,String img)
	{
		xxPos=xP;
		yyPos=yP;
		xxVel=xV;
		yyVel=yV;
		mass=m;
		imgFileName=img;
		
	}
	public Planet(Planet P)
	{
		xxPos=P.xxPos;
		yyPos=P.yyPos;
		xxVel=P.xxVel;
		yyVel=P.yyVel;
		mass=P.mass;
		imgFileName=P.imgFileName;
	}
	
    double calcDistance(Planet P)
    {
    	double dx=this.xxPos-P.xxPos;
    	double dy=this.yyPos-P.yyPos;
    	double distance=Math.sqrt(Math.pow(dx, 2)+Math.pow(dy, 2));
		return distance;
    	
    }
    
    double calcForceExertedBy(Planet P)
    {
    	
    	
    	double distance=this.calcDistance(P);
    	double force=(G*this.mass*P.mass)/(Math.pow(distance, 2));
		return force;
    	
    }
    
    double calcForceExertedByX(Planet P)
    {
    	double ForceX;
    	double force=calcForceExertedBy(P);
    	double distance=calcDistance(P);
    	ForceX=(force*(this.xxPos-P.xxPos))/(distance);
    	if(ForceX < 0)
    		ForceX=-ForceX;
		return ForceX;
    	
    }
    
    double calcForceExertedByY(Planet P)
    {
    	double ForceY;
    	double force=calcForceExertedBy(P);
    	double distance=calcDistance(P);
    	ForceY=(force*(this.yyPos-P.yyPos))/(distance);
    	if(ForceY < 0)
    		ForceY=-ForceY;
		return ForceY;
    }
    
    double calcNetForceExertedByX(Planet[] P)
    {
    	double totalForceX=0.0;
    	double ForceX;
    	for(int i=0;i<P.length;i++)
    	{
    		if(!this.equals(P[i]))
    		{	
    			double force=calcForceExertedBy(P[i]);
    			double distance=calcDistance(P[i]);
    			ForceX=(force*(this.xxPos-P[i].xxPos))/(distance);
    			if(ForceX<0)
    			ForceX=-ForceX;
    			totalForceX+=ForceX;
    		}
    	}
		return totalForceX;
    }
    
 
    double calcNetForceExertedByY(Planet[] P)
    {
    	double totalForceY=0.0;
    	double ForceY;
    	for(int i=0;i<P.length;i++)
    	{
    		if(!this.equals(P[i]))
    		{
    			double force=calcForceExertedBy(P[i]);
    			double distance=calcDistance(P[i]);
    			ForceY=(force*(this.yyPos-P[i].yyPos))/(distance);
    			if(ForceY<0)
    			ForceY=-ForceY;
    			totalForceY+=ForceY;
    		}
    	}
		return totalForceY;
    }
    void update(double seconds,double forceX,double forceY)
    {
    	double accelerationX=forceX/this.mass;
    	double accelerationY=forceY/this.mass;
    	this.xxVel=this.xxVel+(seconds*accelerationX);
    	this.yyVel=this.yyVel+(seconds*accelerationY);
    	this.xxPos=this.xxPos+(seconds*xxVel);
    	this.yyPos=this.yyPos+(seconds*yyVel);
    }
}
