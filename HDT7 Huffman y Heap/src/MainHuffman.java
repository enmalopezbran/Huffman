/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Diego Fernando Rivera Escobar 15085
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
                        char letra = huffman.busquedaChar(value, huffman.x);
                        System.out.println(letra);
                        break;
                    case "2":
                        System.exit(0);
                        break;
                }
	}
}

