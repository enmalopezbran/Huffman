/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt7;

/**
 *
 * @author enmalopezbran
 */
public class Nodo {
    protected int frecuencia;
    protected char chr;
    protected Nodo izq, der;
    
    /*Constructor*/
 
    public Nodo(int frecuencia, char chr, Nodo izq, Nodo der){
    this.frecuencia = frecuencia;
    this.chr = chr;
    this.izq = izq;
    this.der = der;
    }
    public Nodo(){
        
    }
    
    /*Compara la frecuencia de los nodos para poder utilizarlo como un arbol binario*/
    /*Nodo mayor hacia la derecha, nodo menor hacia la izquierda*/
    
    public Nodo agregarNodo(Nodo nodo1,Nodo nodo2){
        if(nodo1.frecuencia < nodo2.frecuencia){
            izq = nodo1;
            der = nodo2;
        }else{
            der =nodo1;
            izq = nodo2;
        }
        frecuencia = nodo1.frecuencia + nodo2.frecuencia;
        return this;
    }

}
