package cse214homework4;
//Jack Smith 110366081

public class DirectAddressTable<V extends Hashable> implements Dictionary<V> {
    
    private final int SIZE = 26; //for the 26 letters of the alphabet
    private int largestKey = 0; //set to 0 by default, max value 25
    private V[] table;
    
    public DirectAddressTable(){      
        table = (V[]) new Hashable[SIZE];      
    }

    @Override
    public boolean isEmpty() {      
        for(int i = 0; i < SIZE; i++){            
            if(this.table[i] != null)
                return false;         
        }  
            return true;   
    }

    @Override
    public void insert(V value) throws NullPointerException {
        if(value != null){
            int val = value.hash();
            table[val] = value;
            if(largestKey < val)
                largestKey = val;
        }else
            throw new NullPointerException();
    }

    @Override
    public V delete(V value) throws NullPointerException {          
        if(value != null){
            if(table[value.hash()] != null){
                table[value.hash()] = null;
                return value;
            }else
                return null;
        }else{
            throw new NullPointerException();
        }
    }

    @Override
    public V find(int key) {
        return table[key];
    }
    
    @Override
    public String toString(){
        String s = "";
        for(int i = 0; i < largestKey+1; i++){
            if(table[i] != null)
                s += (i + " -- " + table[i].toString() + "\n");
            else
                s += (i + " -- " + " null \n");
        }
        return s;
    }
    
}
