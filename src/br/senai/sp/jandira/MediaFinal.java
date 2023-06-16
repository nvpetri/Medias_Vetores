package br.senai.sp.jandira;

public class MediaFinal {

	public static void main(String[] args) {

		double mediaFinal = 0, somaNotas = 0, notas[] = new double[6];

		notas[0] = 8.8;
		notas[1] = 9.5;
		notas[2] = 8.9;
		notas[3] = 10.0;
		notas[4] = 6.7;
		notas[5] = 7.7;

		System.out.println(notas.length);

		// System.out.println("A nota 3 é " + notas[2]);

		notas[2] = 5.5;

		// System.out.println("A nota 3 é " + notas[2]);

		for (int i = 0; i < notas.length; i++) {
			somaNotas += notas[i];

		}
		mediaFinal = somaNotas / notas.length;
		System.out.println(mediaFinal);

	}

}
