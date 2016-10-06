public class BusquedaArbol
{
    private Nodo nodoRaiz;
    private char chr;
    private char charArray[];
    private int i=0;
    public String patron = "";
    public BusquedaArbol(Nodo myNode, char [] charArray)
    {
        String temp;
        int i;
        nodoRaiz = myNode;
        this.charArray = charArray;
        for(i = 0; i < charArray.length; i++)
        {
            temp = buscar(nodoRaiz, "", charArray[i]);
            patron += temp+" ";
            System.out.println("My values: "+charArray[i]+" "+temp+" "+nodoRaiz.frecuencia);
        }
    }
    
    public String buscar(Nodo nodoRaiz, String value,char miChar)
    {
        String valor ="";
        if(nodoRaiz != null)
        {
            if(nodoRaiz.izq != null)
                valor = buscar(nodoRaiz.izq, value+"0", miChar);
            if(nodoRaiz.chr == miChar)
                return value;

            else
            {
                if("".equals(valor))
                {
                    return buscar(nodoRaiz.der, value+"1",miChar);
                }
                else
                {
                    return valor;
                }
            }
        }
        else
        {
            return "";
        }
    }
        
}
    
