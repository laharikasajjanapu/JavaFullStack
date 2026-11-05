package com.oops;


class Shape{
	
	int height;
	int breadth;
	
	void area() {
		System.out.println("Shape Class");
	}
	
}

class Circle extends Shape{
	
	double radius;
	
	Circle(double radius){
		this.radius=radius;
	}
	
	void area(){
		System.out.println("Area Of Circle : " + 3.14*radius*radius);
	}
}

class Rectangle extends Shape{
	
	int length;
	int breadth;
	
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	void area() {
		System.out.println("Area Of Rectangle : " + length*breadth);
	}
}

class Triangle extends Shape{
	
	double base;
	int height;
	
	Triangle(double base,int height){
		this.base=base;
		this.height=height;
	}
	void area() {
		System.out.println("Area of Triangle :" + (base*height)/2);
	}
}

class Square extends Shape{
	
	int side;
	
	Square(int side){
		this.side=side;
	}
	
	void area() {
		System.out.println("Area Of Square : " + side*side);
	}
}

public class TestDemo2 {

	public static void main(String[] args) {
		Shape c=new Circle(20);
		Shape r=new Rectangle(20,30);
		Shape t=new Triangle(2,4);
		Shape s=new Square(3);
		
		c.area();
		r.area();
		t.area();
		s.area();
	}

}
