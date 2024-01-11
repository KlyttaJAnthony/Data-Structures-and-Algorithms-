/**
 * this program searches through an array that is created by inputting random integers within an array
 * 
 */

import java.util.Arrays;
import java.util.Random;

public class searchAlgorithm{
   

    public static void main(String[] args){

        //creating a random object
        Random random = new Random();
        //designating the structures as arrays that only fill in ints with only 100 elements
        int[] structOne;
        int[] structTwo;
        structTwo = new int[100];
        structOne = new int[100];
        
        //these variables measure the loop counters to find the element
        int x;
        int y;

        //this is a search key used in tandem with the variables to find the element
        int searchKey;
        int searchKey2;

        //this singifies the array size
        int nElements = structOne.length;
        int nElements2 = structTwo.length;



        //this loop argument inputs random integers within the array. the random portion is used to input integers within the array from 0 to 100
        for(int i = 0; i < structOne.length; i++){
            structOne[i] = random.nextInt(100) + 0;
        }
        System.out.println(Arrays.toString(structOne));

        for(int n = 0; n < structTwo.length; n++){
            structTwo[n] = random.nextInt(200) + 100;
        }
        System.out.println(Arrays.toString(structTwo));

        //declaring the searchKey to a specific integer 
        //then using our integer x, to cycle through the nElements, which is assigned to the length of the Arrays, 
        //meaning that if there are 100 index's, then x cycles and adds 100 to itself in order to count the amount in each array
        //if x in structOne[x] === searchKey, then the for loop breaks 
        searchKey = 2;
        for (x = 0; x < nElements; x++){
            if (structOne[x] == searchKey){
                break;
            }
        }
        searchKey2 = 101;
        for (y = 0; y < nElements2; y++){
            if (structTwo[y] == searchKey2){
                break;
            }
        }

        //once the search key is found, it then gets assigned to x, printing the elements out onto the terminal
        if (x == nElements){
            System.out.println("Can't find the key: " + searchKey);
        }else{
            System.out.println("The search key is: " + searchKey);
        }

        if (y == nElements2){
            System.out.println("Can't find the second key: " + searchKey2);
        }else{
            System.out.println("The second search key is: " + searchKey2);
        }
    }
}