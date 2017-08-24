package com.example.shunborders.fourbitaluapp;

public class NotGate {
	
	private boolean input;
	private boolean output;
	
	public NotGate(boolean a){
		input=a;
	}
	
	public void set(boolean a, boolean c){
		input=a;
		output=c;
	}
	
	public boolean getInput(){
		return input;
	}
	
	public boolean getOutput(){
		return output;
	}
	
	public boolean equals(NotGate n1){
		if (input==n1.getInput())
			return true;
		else
			return false;
	}
	
	public void makeEqual(NotGate NG){
		input=NG.getInput();
	}
	
	public void execute(){
		if (input==true){
			output=false;
		}
		else
			output=true;
		
	}
	
	public void print(){
		System.out.println("NotGate\nInput 1: "+input+"\noutput: "+output+"\n");
			
		}

}