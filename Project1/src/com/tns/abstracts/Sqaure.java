package com.tns.abstracts;
public class Sqaure extends Shape{
		private float side;

		public Sqaure() {
			super();
			side=0.2f;
		}

		public Sqaure(float side) {
			super();
			this.side = side;
		}
		void calArea() {


			area=side*side;
		}
@Override
		public String toString() {
			return "Square [side=" + side + "]";
		}
		}
