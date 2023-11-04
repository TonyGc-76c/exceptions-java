/**
 * Programa: 5 claificaciones aleatorias y promedio
 * 
 * Descripción:
 * Este programa hace uso de un bucle while para generar 5 calificaciones
 * aleatorias, donde cada calificaciones no es mayor a 50 de valor.
 * 
 * @author TonyGc-76c
 * 
 */
public class ExceptionApp {
	public static void main(String[] args) {
		String str1 = "12";
		String str2 = "0";
		String respuesta;
		int numerador, denominador, cociente;
		try {
			numerador = Integer.parseInt(str1);
			denominador = Integer.parseInt(str2);
			cociente = numerador / denominador;
			respuesta = String.valueOf(cociente);// ValueOf se usa al contrario de parseInt
		} catch (NumberFormatException ex) {
			respuesta = "Se han introducido caracteres no numericos";
		} catch (ArithmeticException ex) {
			respuesta = "Division entre cero";
		}
		System.out.println(respuesta);
	}
}