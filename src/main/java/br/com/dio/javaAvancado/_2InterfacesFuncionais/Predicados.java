package br.com.dio.javaAvancado._2InterfacesFuncionais;

import java.util.function.Predicate;

public class Predicados {
	public static void main(String[] args) {
//		Predicate<String> estaVazio = valor -> valor.isEmpty();
		Predicate<String> estaVazio = String::isEmpty;
		System.out.println(estaVazio.test(""));
		System.out.println(estaVazio.test("Angelo"));
	}

}
