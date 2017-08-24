package com.example.shunborders.fourbitaluapp;

public class OrGate {
	
	private boolean inputA;
	private boolean inputB;
	private boolean output;
	
	public OrGate(boolean a, boolean b){
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
	
	public boolean equals(OrGate o1){
		if (inputA==o1.getA()&&inputB==o1.getB())
			return true;
		else
			return false;
	}
	
	public void makeEqual(OrGate OG){
		inputA=OG.getA();
		inputB=OG.getB();
	}
	
	public void execute(){
		if (inputA==inputB){
			output=inputA;
		}
		else if(inputA==true || inputB==true){
			output=true;
		}
		
	}
	
	public void print(){
		System.out.println("OrGate\nInput 1: "+inputA+"\ninput 2: "+inputB+"\noutput: "+output+"\n");
			
		}

}