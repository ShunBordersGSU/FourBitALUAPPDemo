package com.example.shunborders.fourbitaluapp;

public class FullAdder {
	private OrGate OR;
	private HalfAdder HA1;
	private HalfAdder HA2;
	private boolean a;
	private boolean b;
	private boolean c;
	private boolean s;
	private boolean t;
	
	public void set(boolean a, boolean b, boolean c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public boolean getA(){
		return a;
	}

	public boolean getB(){
		return b;
	}
	
	public boolean getC(){
		return c;
	}
	
	public boolean getS(){
		return s;
	}
	
	public boolean getT(){
		return t;
	}
	
	public void execute(){
		HA1= new HalfAdder();
		HA1.set(b, c);
		HA1.execute();
		boolean r=HA1.getC();

		HA2=new HalfAdder();
		HA2.set(a, HA1.getS());
		HA2.execute();
		s=HA2.getS();

		OR= new OrGate(HA2.getC(),r);
		OR.execute();
		t=OR.getOutput();
		
	}
	
	public void print(){
		System.out.println("Full Adder\nInput A: "+a+"\nInput B: "+b+"\nInput C: "+c+"\nOutput S: "+s+"\nOutput T: "+t+"\n");
	}
}
