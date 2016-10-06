/**
 *Main pide los datos y mira si no ingreso mal un codigo
 * Diego Fernando Rivera Escobar 15085
 *Enma Lopez 15122
 * Programación orientada a objetos
 */
import java.util.*;

public class MainHuffman
{
    static Huffman huffman;
    private static Scanner input = new Scanner(System.in);
    private static String value;
    public static void main(String args[])
	{
		System.out.print("Ingrese texto: ");
                value = input.nextLine();
                System.out.println("Texto ingresado: "+value);
                huffman = new Huffman(value);
                System.out.println("Escoja una opcion: ");
                System.out.println("1.Buscar letra");
                System.out.println("2.Salir");
                value = input.nextLine();
                switch (value){
                    case "1":
                        System.out.print("Ingrese el codigo de la letra: ");
                        value = input.nextLine();
                        char letra = huffman.busquedaChar(value);
                        if (letra == '*')
                        {
                            System.out.println("Codigo incorrecto");
                        }
                        else
                        {
                            System.out.println(letra);
                        }
                        break;
                    case "2":
                        System.exit(0);
                        break;
                }
	}
}

