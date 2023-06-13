package tipoDeDatosYVariablesCH27;

public class ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Hola Mundo");
		//Tipo de datos
		
			//byte: sirve para representar u valor número de 8 bits
			
			byte salas = 10;
			System.out.println(salas);
			
			//short: sirve para representar un valor numerico de 16 bits
			
			short asientos = 1120;
			System.out.println(asientos);
			
			//int: sirve para almacenar un valor numerico de 23 bits
			
			int dulces = 3476;
			System.out.println(dulces);
			
			//long: Sirve para representar un valor numerico 64 bits
			
			long clientes = 313600l;
			System.out.println(clientes);
			
			//datos que pueden tener punto decimal
			
			//float: Srive para almacenar un valor numerico de 23 bits
			
			float palomitas = 35.5f;
			System.out.println(palomitas);
			
			//double: Sirve para representar un valor numerico de 64 bits
			
			double ganancia = 23770880.7d;
			System.out.println(ganancia);
			
			//boolean: Sirve para representar valores booleanos y solamente tiene dos salidas , verdadero y falso
			//char: Sirve para representar un caracter o un numero (pero solamento uno)
			
			//casting o casteo: Sirve para realizar una conversion de tipos de datos a uno mas grande o mas pequeño, incluso a uno diferente 
			
			double num = 59.7d;
			//casteo a entero
			int numInt = (int) num;
			System.out.println("double" + numInt);
			
			long numlong = (long) num;
			System.out.println("long" + numlong);
			
			String cantidad = "85";
			String precio = "59.7";
			
			int cantidadEntero = Integer.parseInt(cantidad);
			double precioDouble = Double.parseDouble(precio);
			
			System.out.println("El valor de la compra es:" + (cantidadEntero * precioDouble));
			
			//Operadores aritmenticos
			
			int dias = 28;
			dias = dias + 2;
			System.out.println("dias" + dias);
			
			//Operadores de incremento y decremento
			int p = 0;
			p++;
			p++;
			p++;
			System.out.println(p);
			
			/* Operadores Relacionales
			 == Compara si un operador es igual a otro
			 != diferente a
			 > mayor que
			 < menor que
			 <= mayor o igual
			 >= menor o igual
			  */
			
			int a = 10;
			int b = 15;
			boolean resultado;
			resultado = a ==b;
			System.out.println("resultado de la operacion " + resultado);
			
			
			
			

	}

}
