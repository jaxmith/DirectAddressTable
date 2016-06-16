package cse214homework4;

//Jack Smith 110366081

public class Alphabet implements Hashable {

    private final char letter;
    
    public Alphabet(char c){        
        letter = Character.toLowerCase(c); //ensures input is lowercase        
    }
    
    /*
    The hash method converts the Alphabet object into an integer by subtracting the integer value of the character by 97
    97 is the value of the character 'a', meaning that 'a'.hash() corresponds to the slot 0
    Therefore, 0 - a, 1 - b, 2 - c, and so on... Each letter will have a unique key and no collisions will occur
    */
    
    @Override
    public int hash() {
        return letter - 97;
    }
    
    @Override
    public String toString(){
        return letter + "";
    }
    
}
