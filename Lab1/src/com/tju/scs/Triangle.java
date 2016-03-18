package com.tju.scs;

public class Triangle {
	int a, b, c;
	public Triangle(){
		a = 0;
		b = 0;
		c = 0;
	}
	public Triangle(int a, int b, int c){
		if(a > b)
		{
			int temp = a;
			a = b;
			b = temp;
		}
		if(a > c)
		{
			int temp = a;
			a = c;
			c = temp;
		}
		if(b > c)
		{
			int temp = c;
			c = b;
			b = temp;
		}
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	int test(){
		if(a + b < c || a <=0 || b <= 0 || c <= 0)
			return 0;
		else if(a == b && b == c)
		{
			return 1;
		}
		else if(a == b || b == c)
		{
			return 2;
		}
		else
			return 3;
	}
	int legal(){
		if(this.test() != 0)
			return 1;
		else
			return 0;
	}
	int isoscelesTriangle()
	{
		if(this.test() == 1 || this.test() == 2)
			return 1;
		else
			return 0;
	}
	int equilateralTriangle()
	{
		if(this.test() == 1)
			return 1;
		else
			return 0;
	}
	int normalTriangle()
	{
		if(this.test() == 3)
			return 1;
		else
			return 0;
	}
}
