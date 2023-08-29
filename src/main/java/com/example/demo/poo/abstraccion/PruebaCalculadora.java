package com.example.demo.poo.abstraccion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PruebaCalculadora {
	public static void main(String[] args) {
		List<String> listString = new ArrayList<>();
		List<String> listString2 = new LinkedList<>();
		
		listString.add("Jesus");
		listString2.add("Gabriela");
		
		Calculadora calculadora = new OtraCalculadoraIntImpl();
		System.out.println(calculadora.suma(3, 4));
	}

}
