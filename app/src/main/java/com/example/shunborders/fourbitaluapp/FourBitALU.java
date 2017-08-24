package com.example.shunborders.fourbitaluapp;

public class FourBitALU {
	private boolean opt;
	private boolean a1, a2, a3, a4;
	private boolean b1, b2, b3, b4;
	private boolean c1, c2, c3, c4, c5;
	private boolean s1, s2, s3, s4;

	private FullAdder f1, f2, f3, f4;
	private XOrGate x1, x2, x3, x4;
	
	public void setA(boolean one, boolean two, boolean three, boolean four){
		a1=one;
		a2=two;
		a3=three;
		a4=four;
	}
	
	public void setB(boolean one, boolean two, boolean three, boolean four){
		b1=one;
		b2=two;
		b3=three;
		b4=four;
	}

	public String getS0(){
		return " "+s1;
	}

	public String getS1(){
		return " "+s2;
	}

	public String getS2(){
		return " "+s3;
	}

	public String getS3(){
		return " "+s4;
	}

	public String getC(){
		return " "+c5;
	}

	
	public void execute(boolean opt){
		this.opt=opt;
		c1=false;
		x1=new XOrGate(b1,opt);
		x1.execute();

		f1=new FullAdder();
		f1.set(a1, x1.getOutput(), c1);
		f1.execute();

		s1=f1.getS();
		c2=f1.getT();
		
		x2=new XOrGate(b2,opt);
		x2.execute();

		f2=new FullAdder();
		f2.set(a2, x2.getOutput(), c2);
		f2.execute();

		s2=f2.getS();
		c3=f2.getT();
		
		x3=new XOrGate(b3,opt);
		x3.execute();

		f3=new FullAdder();
		f3.set(a3, x3.getOutput(), c3);
		f3.execute();

		s3=f3.getS();
		c4=f3.getT();
		
		x4=new XOrGate(b4,opt);
		x4.execute();

		f4=new FullAdder();
		f4.set(a4, x4.getOutput(), c4);
		f4.execute();

		s4=f4.getS();
		c5=f4.getT();
		
	}
	
	public String print(){
		return ("Four Bit ALU\nA: "+a1+" "+a2+" "+a3+" "+a4+"\nB: "+b1+" "+b2+" "+b3+" "+b4+"\nOverflow: "
	+c5+" Output: "+s1+" "+s2+" "+s3+" "+s4);
	}
}
