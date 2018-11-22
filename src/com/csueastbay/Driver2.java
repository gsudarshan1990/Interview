package com.csueastbay;

public class Driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apatosaurus a=new Apatosaurus();
		
		System.out.println(a.getClass().getName());
		a.Eat();
		a.Speed();
		a.Area();
		
		Hadrosaur h=new Hadrosaur();
		
		System.out.println(h.getClass().getName());
		h.Eat();
		h.Speed();
		h.Area();
		
		Tyrannosaurus t=new Tyrannosaurus();
		
		System.out.println(h.getClass().getName());
		t.Eat();
		t.Speed();
		t.Area();
		
	}

}
