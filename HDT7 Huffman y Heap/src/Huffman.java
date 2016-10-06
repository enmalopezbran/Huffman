
package hdt7;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

public class Huffman {
	
//	private static String value;
	private static char charArray[]; //Convierte la cadena en un array
	private static int table[] = new int[0x7f]; //Tiene la frecuencia del item
        private static Node miNodo[]; //the main Priority Queue, the Final Tree generated is stored in spot 0.
	private static int tamanoTabla = 0;//El largo de la tabla que tiene el carater 
        private static Tree myTree; //A variable that holds the Tree
        private static int tamanoNodo = 0;//all increments or decrements are made to this value
        public Node x;
        public static BusquedaArbol busqueda; //The Class Responsible for Decoding the Huffman Trees
        
        
        public Huffman(String value)
        {
            frequencyTable(value);
            nodeArrange();
            x = createTree();
            busqueda = new BusquedaArbol(x,charArray);
        }
        public char busquedaChar(String input){
        Node head= null;
        char letra;
        char now;
        int i;
        if (miNodo[0] != null)
        {
           for(i = 0; i < input.length()-1; i++)
           {
               now = input.charAt(i);
               if (now == 1 && miNodo[i].right != null)
               {
                   head= miNodo[i].right;
               }
               else if (now == 0 && miNodo[i].left != null)
               {
                   head = miNodo [i].left;
               }
           }   
        }
        if (head== null){
            return letra = '*';
        }
        letra = head.chr;
        return letra;
        }
        public static void frequencyTable(String value)
	{
		int i;
                charArray = value.toCharArray();
		for(i = 0; i < charArray.length; i++)
			table[getAscii(charArray[i])] += 1; 
	}
	
	public static int getAscii(char substringValue)
	{
		return substringValue&0x7f;
	}
	
        public static void nodeArrange()    
        {
            int counter = 0;
            int j = 0;
            for(int i = 0; i < table.length; i++)
            {
                if(table[i]>0)
                    counter++;
            }
            
            tamanoTabla =  counter;
            counter = 0;    
            miNodo = new Node[tamanoTabla];
            
            for(int i = 0; i < 127; i++)
            {
                if(table[i] != 0)
                {
                    miNodo[counter]= new Node(table[i], (char)i, null, null);
                    counter++;
                }
            }
            tamanoNodo = miNodo.length;
            sort();
            
        }
        
        public static Node createTree()
        {
           for(int i = 1; i < tamanoNodo; i++)
           {
               try
               {
                   if(miNodo[1].frequency >= miNodo[0].frequency)
                   {
                       myTree = new Tree(miNodo[0],miNodo[i]);
                       miNodo[0] = myTree;
                       moveItems(i, tamanoNodo);
                       tamanoNodo -= 1; 
                       i -= 1;
                       sort();
                   }
                   else
                   {
                       if(i+1 < tamanoNodo)
                       {
                            myTree = new Tree(miNodo[i], miNodo[i+1]);
                            miNodo[1] = myTree;
                            moveItems(i+1, tamanoNodo);
                            sort();
                            tamanoNodo -= 1;
                            i -= 1;
                       }
                       else
                       {
                           miNodo[1] = miNodo[i];
                           miNodo[0] = new Tree(miNodo[0], miNodo[1]);
                       }
                   }
               }
               catch(Exception e)
               {
                 //I dare this program to crash...hahaha
               }
           }
            return miNodo[0];
        }
        
        private static void moveItems(int index, int length)
        {   try
            {
                for(int i = index; i < length; i++)
                    miNodo[i] = miNodo[i+1];
                
            }
            catch(Exception e)
            {
                //See...this program is uncrashable...lol
            }
        }
        private static void sort()
        {
            Node temp;
            for(int i = tamanoNodo-1; i > 1; i--)
            {
                for(int j = 0; j < i; j++)
                {
                    if(miNodo[j].frequency > miNodo[j+1].frequency)
                    {
                        temp = miNodo[j+1];
                        miNodo[j+1] = miNodo[j];
                        miNodo[j] = temp;
                    }
                    
                    if(miNodo[j].frequency == miNodo[j+1].frequency && miNodo[j].left != null)
                    {
                        temp = miNodo[j+1];
                        miNodo[j+1] = miNodo[j];
                        miNodo[j] = temp;
                    }
                }
            }
        }
}
