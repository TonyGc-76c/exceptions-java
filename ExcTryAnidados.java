/**
 * Programa: Bloques de Try anidadeos
 * 
 * Descripción:
 * Este programa hace uso de dos try catch anidados, uno para hacer
 * una excepción aitmetica y el otro para arrojar cualquier otra excepción.
 * 
 * @author TonyGc-76c
 */
public class ExcTryAnidados {
	public static void main(String[] args) {
		// declaración de matrices
		int nums[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };
		// bloques try-catch anidados para manejar excepciones.
		try {
			// El for para iterar a través de los elementos de la matriz `nums`. Dentro
			// intenta dividir los elementos de`nums` y `denom` e imprimir el resultado
			for (int i = 0; i < nums.length; i++) {
				try {
					System.out.println(nums[i] + " / " + denom[i] + " es " + nums[i] / denom[i]);
				} catch (ArithmeticException exc) { // Si ocurre `ArithmeticException` (división por cero) imprime el mensaje
					System.out.println("No se puede dividir por cero");
				}
			}
		} catch (ArrayIndexOutOfBoundsException exc) {  // cuando ocurre cualquier excepción imprime el mensaje
		// En este caso la excepción es ponque la longitud `nums` es mayor a la de `denom` y no todos los
		// elementos pueden ser divididos.
			System.out.println("Alguna excepcion ocurrio");
			System.out.println("ERROR: Programa Terminado");
		}
	}
}