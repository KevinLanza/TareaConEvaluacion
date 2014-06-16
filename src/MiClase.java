
public class MiClase
{
	//devuelve la suma de a y b
	static int sumarNumeros(int a, int b)
	{
		return a + b;//Se suman los dos numeros a y b para obtener resultado
	}
	
	//devuelve la resta de a y b
	static int restarNumeros(int a, int b)
	{
		return a - b;//Se resta los dos numeros a y b para obtener resultado
	}
	
	//devuelve la multiplicación de a y b
	static int multiplicarNumeros(int a, int b)
	{
		return a * b;//Se multiplica los dos numeros a y b para obtener resultado
	}
	
	//devuelve true si num es par, de lo contrario, devuelve false
	static boolean esPar(int num)
	{
		if ( (num % 2) == 0)//Se evalua la condicion if para sacar el residuo
		{
			return true;//devuelve true si es verdadero
		}
		return false;//devuelve false si no se cumple la condicion
	}
	
	//devuelve el numero mayor entre a, b o c
	static int getMayor(int a, int b, int c)
	{
		int resultado = 0;
		{
		if ( a > b && a > c)//Se evalua para la variable a
			{
			return a;
			}
		if (b > c && b > a)//se evalua para la variable b
			{
		return b;
			}
		if (c > a && c > b)//se evalua para la variable c
			{
			return c;
			}
		}
		return resultado;//devuelve el resultado dependiedo de los datos
	}
	
	
	//devuelve num elevado a la potencia
	static int potencia(int num, int potencia)
	{
	int total;//se establece una variable
	total = (int) Math.pow(num,potencia);//se calcula la potencia del numero
	return total;//devuelve el resultado
	
	}
	
	//devuelve el numero mayor del arreglo
	static int sumarArreglo(int arreglo[])
	{
		int suma = 0;//se establece una variable 
		
		for (int i = 0; i < arreglo.length;i++)//se hace un ciclo for para recorrer el arreglo
		suma += arreglo[i];//Se establece la igualdad entre la condicion y el arreglo
		
		return suma;//devuelve el resultado
	}
	

	
	//devuelve el numero mayor de un arreglo
	static int getMayorArreglo(int arreglo[])
	{
		int resultado = arreglo [0];//Se establece la variable
		for(int x = 0;x < arreglo.length; x++ )//se hace un ciclo for para recorrer el arreglo
		{
			
			if(arreglo[x ] > resultado)//se evalua una condicion 
				resultado = arreglo[x];
		}
		return resultado;//devuelve el resultado
	
	}
	
	//devuelve el numero menor de un arreglo
	static int getMenorArreglo(int arreglo[])
	{
		int resultado = arreglo [0];//se establece una variable
		for(int x = 0;x < arreglo.length; x++ )//se hace un ciclo for para recorrer el arreglo
		{
			
			if(arreglo[x ] < resultado)//se evalua la condicion 
				resultado = arreglo[x];
		}
		return resultado;//devuelve el resultado
	}
	
	//devuelve true si encuentra cadena dentro arreglo
	static boolean existe(String arreglo[],String cadena)
	{
		for(int x = 0;x < arreglo.length; x++ )//se hace un ciclo for para recorrer el arreglo
		{
			if(arreglo[x].equals(cadena))//se evalua la condicion
				return true;//devuelve si es verdadero
		}
		return false;//devuelve si es falso
	}
	
	public static void main(String args[])
	{
	
	}
}
