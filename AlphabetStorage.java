package cse214homework4;

import java.io.*;

//Jack Smith 110366081

public class AlphabetStorage {

    public static void main(String[] args) throws IOException {
        DirectAddressTable<Alphabet> alphabetTable = new DirectAddressTable<>();
        System.out.println("Enter the initial input - comma-separated lower-case letters:");
        InputStreamReader isr = new InputStreamReader(System.in);
        try (BufferedReader reader = new BufferedReader(isr)) {
            String input = reader.readLine();
            for (String s : input.trim().split(",")) {
                alphabetTable.insert(new Alphabet(s.charAt(0)));
            }
            System.out.println(alphabetTable.toString());
            System.out.println("The commands available are insert, delete, and find" + "\n"
                    + "Each command takes one lower-case letter as an argument."
                    + " Type 'done' to exit the program.");
            Alphabet letter;
            while (true) {
                input = reader.readLine();
                String[] arr = input.split(" ");
                if(arr[0].equals("insert")) {
                    letter = new Alphabet(arr[1].charAt(0));
                    alphabetTable.insert(letter);
                    System.out.println(letter.toString() + " was inserted.");
                    System.out.println(alphabetTable.toString());
                }else if(arr[0].equals("delete")){
                    letter = new Alphabet(arr[1].charAt(0));
                    if(alphabetTable.delete(letter) != null)
                        System.out.println(letter.toString() + " was deleted.");
                    else
                        System.out.println(letter.toString() + " was already deleted or never existed.");
                    System.out.println(alphabetTable.toString());
                }else if(arr[0].equals("find")){
                    letter = new Alphabet(arr[1].charAt(0));
                    if(alphabetTable.find(letter.hash()) != null)
                        System.out.println(letter.toString() + " can be found in slot " + letter.hash());
                    else
                        System.out.println(letter.toString() + " does not exist in this table.");
                }else if(arr[0].equals("done")){
                    System.exit(0);
                }else{
                    System.out.println("Error: invalid command.");
                }
            }
        }
    }
}
