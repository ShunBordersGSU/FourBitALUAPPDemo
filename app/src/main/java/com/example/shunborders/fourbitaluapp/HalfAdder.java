package com.example.shunborders.fourbitaluapp;

public class HalfAdder {
	
	private OrGate OG;
	private AndGate AG1;
	private AndGate AG2;
	private NotGate NG;
	private boolean a;
	private boolean b;
	private boolean s;
	private boolean c;
	
	
	public void set(boolean a, boolean b){
		this.a=a;
		this.b=b;
	}
	
	public boolean getA(){
		return a;
	}
	
	public boolean getB(){
		return b;
	}
	
	public boolean getS(){
		return s;
	}
	
	public boolean getC(){
		return c;
	}
	
	public void execute(){
		OG = new OrGate(a,b);
		AG1 = new AndGate(a,b);
		OG.execute();
		AG1.execute();
		c=AG1.getOutput();
		NG= new NotGate(c);
		NG.execute();
		boolean r=NG.getOutput();
		AG2= new AndGate(OG.getOutput(),r);
		AG2.execute();
		s=AG2.getOutput();
	}
	
	public void print(){
		System.out.println("Half Adder\nInput A: "+a+"\nInput B: "+b+"\nOutput C:"+c+"\nOutput S: "+s+"\n");
	}

}
