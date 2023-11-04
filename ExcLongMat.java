/**
 * Programa: Excepción por longitud de una matriz
 * 
 * Descripción:
 * Este programa hace uso de un try catch para generar un 
 * mensaje de excepción de una división entre cero.
 * 
 * @author TonyGc-76c
 */
public class ExcLongMat {
	public static void main(String[] args) {
		int numero[] = new int[5];
		try {
			// Se le quiere asignar el valor de 0 sin embargo la matriz 
			// tiene una longitud de 5, esto dará como resultado una
			// `ArrayIndexOutOfBoundsException` porque el índice 7 
			// está fuera de los límites de la matriz.
			numero[7] = 0;
		} catch (java.lang.ArrayIndexOutOfBoundsException Error) {
			System.out.println("Solo pueden ser 5");
		}
	}
}