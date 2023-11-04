import javax.swing.JOptionPane;
/**
 * Programa: Excepciones con métodos
 * 
 * Descripción:
 * Este programa hace uso de excepciones a partir de metodos
 * y una funcion personalizada, tambien de un bucle do-while.
 * 
 * @author TonyGc-76c
 */
public class ExcConMetodos extends Exception{
	// Método constructor
	ExcConMetodos() {
		super("Excepcion generada por el progrmador");
	}

	// Método constructor que toma una valor tipo cadena
	ExcConMetodos(String s) {
		super(s);
	}

	// Función "Método" con excepción personalizada si el usuario ingresa un cero.
	public void Metodo() throws ExcConMetodos // Indica que en esta clase se generara una excepcion de este tipo
	{
		int numero;
		String n;
		n = JOptionPane.showInputDialog("Teclee cero para lanzar la excepcion");
		numero = Integer.parseInt(n);
		if (numero == 0)
			throw new ExcConMetodos();// Se crea una nueva excepcion de la clase expropia
	}

	public static void main(String[] args) {
		System.out.println("Bienvenido al progrma que crea una excepcion");
		do
			try {
				ExcConMetodos Instancia = new ExcConMetodos();
				Instancia.Metodo();
			} catch (ExcConMetodos e) {
				System.out.println(e);
			}
		while (true);
	}
}