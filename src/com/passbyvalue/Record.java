package com.passbyvalue;

public class Record {
	
	public int num;
	public String name;
	
	public static void tryObject(Record r)
	{
		r.num=100;
		r.name="Fred";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Record id=new Record();
		id.num=2;
		id.name="Barney";
		tryObject(id);
		System.out.println("Name:"+id.name+" Number:"+id.num);
	}

}
