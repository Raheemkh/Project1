package com.tns.interfaces;

public class InterfaceDemo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Amazon.aboutUs();
			
			
	      Amazon a;
	     
	      a=new Prime();
	      a.welcome();
	      a.subscribe();
	      a.serviceCharge();
	      a=new Non_Prime();
	      a.welcome();
	      a.serviceCharge();
	      a.subscribe();
	      }
		}
