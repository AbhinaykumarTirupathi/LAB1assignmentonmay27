package com.lab4;

public class MainAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal[] arr=new Animal[3];
		arr[0]=new Cat();
		arr[1]=new Dog();
		arr[2]=new Lion();
		for (Animal a:arr)
		{
			a.talk();
		}
	}

}