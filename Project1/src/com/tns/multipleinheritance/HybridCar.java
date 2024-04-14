package com.tns.multipleinheritance;

public class HybridCar implements CngCar,PetrolCar{
	public void petrolKit() {
		// TODO Auto-generated method stub
		System.out.println("using petrolkit to drive hybrid");
	}

	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("  hybrid car drive");
	}

	@Override
	public void cngkit() {
		// TODO Auto-generated method stub
		System.out.println("using cngkit to drive hybrid");
	}
}
