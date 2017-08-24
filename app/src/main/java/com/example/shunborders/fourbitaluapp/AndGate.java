package com.example.shunborders.fourbitaluapp;

public class AndGate {
	
	private boolean inputA;
	private boolean inputB;
	private boolean output;
	
	public AndGate(boolean a, boolean b){
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
	
	public boolean equals(AndGate a1){
		if (inputA==a1.getA()&&inputB==a1.getB())
			return true;
		else
			return false;
	}
	
	public void makeEqual(AndGate AG){
		inputA=AG.getA();
		inputB=AG.getB();
	}
	
	public void execute(){
		if (inputA==inputB){
			output=inputA;
		}
		else
			output=false;
		
	}
	
	public void print(){
		System.out.println("AndGate\nInput 1: "+inputA+"\ninput 2: "+inputB+"\noutput: "+output+"\n");
			
		}

}
