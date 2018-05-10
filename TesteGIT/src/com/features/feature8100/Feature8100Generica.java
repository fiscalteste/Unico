package com.features.feature8100;

public class Feature8100Generica {

	public static void main(String[] args) {
		System.out.println("Minha operação geral!");
	}
	
	public static void calcularConta(Integer conta, String nome) {
		for (int i = 0; i < conta; i++) {
			System.out.println("Conta n" + conta + " em nome do " + nome);
		}
		somaValores();
	}
	
	public static void somaValores() {
		System.out.println("Soma valores criado na 8101");
	}
	
	public static void andamentoSprint8102() {
		System.out.println("Não devera dar merge pois esse metodo é independente!");
	}
}
