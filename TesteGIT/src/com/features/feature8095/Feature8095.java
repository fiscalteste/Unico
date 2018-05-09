package com.features.feature8095;

import com.util.ClasseGenerica;

public class Feature8095 {

	public static void main(String[] args) {
		System.out.println("Tenho minhas operacoes a fazer...");
		int i;
		for (i = 0; i < args.length; i++) {
			System.out.println("Repete isso!");
		}
		
		if (i < 1) {
			ClasseGenerica.metodoGenerico();
			ClasseGenerica.metodoFeature8093();
		}
	}
}
