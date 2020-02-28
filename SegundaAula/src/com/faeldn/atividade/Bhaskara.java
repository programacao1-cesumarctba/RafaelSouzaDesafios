package com.faeldn.atividade;

public class Bhaskara {
	private static float valorA;
	private static float valorB;
	private static float valorC;

	
	public float calcDelta() {
		return ((getValorB() * getValorB()) - (4 * getValorA() * getValorC()));
	
	}

	public float calcX() {
		return (getValorB() * getValorB() - getValorB()) +- (calcDelta()) / (2*getValorA());
		
	}

	public void classificacao() {
		if (calcDelta() < 0){
			System.out.println ("A equação de segundo grau não possui raízes reais");
		} else if (calcDelta() == 0){
			System.out.println ("A equação de segundo grau possui uma raiz real.");
		} else if (calcDelta() > 0){
			System.out.println ("A equação de segundo grau possui duas raízes reais.");
		}

	}

	public Bhaskara(float d, float e, float f) {
		Bhaskara.setValorA(d);
		Bhaskara.setValorB(e);
		Bhaskara.setValorC(f);
		this.calcDelta();
	}
	public static float getValorA() {
		return valorA;
	}
	public static void setValorA(float valorA) {
		Bhaskara.valorA = valorA;
	}
	public static float getValorB() {
		return valorB;
	}
	public static void setValorB(float valorB) {
		Bhaskara.valorB = valorB;
	}
	public static float getValorC() {
		return valorC;
	}
	public static void setValorC(float valorC) {
		Bhaskara.valorC = valorC;
	}
}
