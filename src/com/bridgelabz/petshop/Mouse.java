package com.bridgelabz.petshop;

import com.bridgelabz.petshop.Pet.Color;

public class Mouse extends Pet implements Swimable{

	public Mouse() {
		name = "Mouse";
		color = Color.BLACK;
	}
	
	@Override
	public void Swim() {
		System.out.println("Mouse swims");
	}
}
