package com.example.shunborders.fourbitaluapp;

public class GatesMain {

	public static void main(String[] args) {
		AndGate AG1 = new AndGate(true, false);
		AG1.execute();
		AG1.print();
		
		AndGate AG2 = new AndGate(false, false);
		AG2.execute();
		AG2.print();
		
		AndGate AG3 = new AndGate(false, true);
		AG3.execute();
		AG3.print();
		
		AndGate AG4 = new AndGate(true, true);
		AG4.execute();
		AG4.print();
		
		OrGate OG1 = new OrGate(true, false);
		OG1.execute();
		OG1.print();
		
		OrGate OG2 = new OrGate(false, false);
		OG2.execute();
		OG2.print();
		
		OrGate OG3 = new OrGate(false, true);
		OG3.execute();
		OG3.print();
		
		OrGate OG4 = new OrGate(true, true);
		OG4.execute();
		OG4.print();
		
		NotGate NG1 = new NotGate(true);
		NG1.execute();
		NG1.print();
		
		NotGate NG2 = new NotGate(false);
		NG2.execute();
		NG2.print();
		
		HalfAdder HA1= new HalfAdder();
		HA1.set(false, true);
		HA1.execute();
		HA1.print();
		
		HalfAdder HA2= new HalfAdder();
		HA2.set(true, false);
		HA2.execute();
		HA2.print();
		
		HalfAdder HA3= new HalfAdder();
		HA3.set(false, false);
		HA3.execute();
		HA3.print();
		
		HalfAdder HA4= new HalfAdder();
		HA4.set(true, true);
		HA4.execute();
		HA4.print();
		
		FullAdder FA1= new FullAdder();
		FA1.set(false, false, false);
		FA1.execute();
		FA1.print();
		
		FullAdder FA2= new FullAdder();
		FA2.set(false, false, true);
		FA2.execute();
		FA2.print();
		
		FullAdder FA3= new FullAdder();
		FA3.set(false, true, false);
		FA3.execute();
		FA3.print();
		
		FullAdder FA4= new FullAdder();
		FA4.set(false, true, true);
		FA4.execute();
		FA4.print();
		
		FullAdder FA5= new FullAdder();
		FA5.set(true, false, false);
		FA5.execute();
		FA5.print();
		
		FullAdder FA6= new FullAdder();
		FA6.set(true, false, true);
		FA6.execute();
		FA6.print();
		
		FullAdder FA7= new FullAdder();
		FA7.set(true, true, false);
		FA7.execute();
		FA7.print();
		

		FullAdder FA8= new FullAdder();
		FA8.set(true, true, true);
		FA8.execute();
		FA8.print();
		
		FullAdder FA9= new FullAdder();
		FA9.set(false, false, false);
		FA9.execute();
		FA9.print();
		
		FourBitALU FBA1=new FourBitALU();
		FBA1.setA(true, false, true, true);
		FBA1.setB(false, false, false, true);
		FBA1.execute(false);
		FBA1.print();
	}
	

}
