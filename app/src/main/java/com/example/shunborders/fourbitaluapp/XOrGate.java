package com.example.shunborders.fourbitaluapp;

public class XOrGate {
	
	private boolean inputA;
	private boolean inputB;
	private boolean output;
	
	public XOrGate(boolean a, boolean b){
		inputA=a;
		inputB=b;
	}
	
	public void set(boolean a, boolean b){
		inputA=a;
		inputB=b;
	}
	
	public boolean getA(){
		return inputA;
	}
	
	public boolean getB(){
			return inputB;
		}
	
	public boolean getOutput(){
		return output;
	}
	
	public boolean equals(XOrGate o1){
		if (inputA==o1.getA()&&inputB==o1.getB())
			return true;
		else
			return false;
	}
	
	public void makeEqual(XOrGate OG){
		inputA=OG.getA();
		inputB=OG.getB();
	}
	
	public void execute(){
		if (inputA==inputB){
			output=false;
		}
		else {
			output=true;
		}
		
	}
	
	public void print(){
		System.out.println("XOrGate\nInput 1: "+inputA+"\ninput 2: "+inputB+"\noutput: "+output+"\n");
			
		}

}