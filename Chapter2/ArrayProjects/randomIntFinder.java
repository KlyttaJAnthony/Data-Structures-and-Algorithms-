import java.util.Random;
import java.util.Arrays;


// int nElements = 0; for known numbers 

public class randomIntFinder{
    public static void main(String[] args){

        Random random = new Random();

        int[] structOne;
        structOne = new int[100];

        //the random array
        for(int i = 0; i < structOne.length; i++){
            structOne[i] = random.nextInt(100) + 0;
        }
        System.out.println(Arrays.toString(structOne));

        //the known array

       

        // int nElements = 0; for known numbers  
        int x;
        int searchKey;
        int nElements = structOne.length;

        searchKey = 35;
        for(x = 0; x < nElements; x++){
            if(structOne[x] == searchKey)
            break;
        }
        if(x == nElements)
            System.out.println("Can't find the key " + searchKey);
        else
            System.out.println("Found the key " + searchKey);
        
    }
}