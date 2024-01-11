

/**
 * Objective for this project:
 * 1) modify the if statement within the main method to print the found number. DONE
 * 2) fix the output statement to fix the foundtrue output. DONE
 * 3) create a method that includes a GUI that says: YOU FUCKING SUCK.
 */


import java.util.Scanner;
import javax.swing.*;



class SearchProject{
    private long[] structOne;
    private int nElements;

    public SearchProject(int max){
        structOne = new long[max];
        nElements = 0;
    }
    public boolean find(long searchKey){
        int x;
        for(x = 0; x < nElements; x++){
            if(structOne[x] == searchKey){
                break;
            }
        }
        if (x == nElements){
            return false;
        }else{
            return true;
        }
    }
    public void insert(long value){
        structOne[nElements] = value;
        nElements++;
    }
    public boolean delete(long value){
        int j;
        for( j = 0; j < nElements; j++){
            if( value == structOne[j] ){
                break;
            }
        }
        if(j == nElements){
            return false;
        }else{
            for(int k = j; k < nElements; k++){
                structOne[k] = structOne[k +1];
            }
            nElements--;
            return true;
        }
    }
    public void display(){
        for(int j = 0; j < nElements; j++){
            System.out.print(structOne[j] + " ");
        }
        System.out.println();
    }
    public static void callGUI(){
        JFrame frame = new JFrame("NUMBERS FRAME"); //creates panel with content inside
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close upon exit 
        frame.setSize(500,500); //size of frame
        JButton button = new JButton("Press it retard"); //creates button within the frame
        frame.getContentPane().add(button); //add the button to the frame
        frame.setVisible(true); //becomes visible
    }
}

class SearchArray{
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);

        int maxSize = 500;
        SearchProject ArrayStruct;
        ArrayStruct = new SearchProject(maxSize);


        //inserting 500 elements within an array
        for( long w = 0; w < 500; w++){
            long insertElement = w;
            ArrayStruct.insert(insertElement);
        }
        ArrayStruct.display();

        System.out.println("Request a number between 0 and 499");
        long numberFinder = myObj.nextLong();
        System.out.println("Alright, now request a second number between 0 and 499");
        long numberFinder2 = myObj.nextLong();

        //using the ArrayStruct function allows us to use the find() function to pin to find
        //whether or not if the number is the array.
        boolean searchKey1 = ArrayStruct.find(numberFinder);
        boolean searchKey2 = ArrayStruct.find(numberFinder2);

        if (searchKey1 && searchKey2){
            System.out.println("Found both numbers" + " " + numberFinder + " and " + numberFinder2 + ".");
        }else if (searchKey1){
            System.out.println("The first number is found" + " " + numberFinder);
        }else if (searchKey2){
            System.out.println("The second number is found" + " " + numberFinder2);
        }else{
            System.out.println("No number has been found.");
            ArrayStruct.callGUI();

        }
        // // System.out.println(numberFinder + " " + numberFinder2);    
    }
}
