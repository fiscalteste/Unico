package com.util;

public class ClasseGenerica {

	public static void metodoApenasFeature8094(String string) {
		System.out.println("Falando: " + string);
	}

	public static void metodoGenerico() {
		System.out.println("Criado na 8090");
	}
  
  // <<<<<<< sprint02/feature_8092
	public static void novoMetodoFeature8092() {
		System.out.println("Sou unico mesmo.");
		System.out.println("Meu metodo 8092 que estava dando conflito");
		System.out.println("Sou unico mesmo.");
  }

	public static void metodoFeature8093() {
		System.out.println("Feaytre 8093");
		
		System.out.println("Agora faz algo mais");
		for (int i = 0; i < 20; i++) {
			novaOperacaoCriadoNo8095();
		}
	}

	private static void novaOperacaoCriadoNo8095() {
		System.out.println("Fui criado no 8095");
	}
}
