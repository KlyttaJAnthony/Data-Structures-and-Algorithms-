
import java.util.Arrays;

public class intFinder{
    public static void main(String[] args){

        long[] structOne; //creating the array
        structOne = new long[100]; //initializing the size of the array
        long searchKey; //key for finding numbers
        int x; //need this for iterating for the key with the loops
        int nElements = 0; //nElements indicates our length of array


        for (int i = 0; i < structOne.length; i++){
            structOne[i] = i + 1;
        }
        System.out.println(Arrays.toString(structOne));




        //Finding the item 2
        searchKey = 2;
        nElements = structOne.length;

        for(x = 0; x < nElements; x++){
            if(structOne[x] == searchKey)
                break;
        }
        if(x == nElements){
            System.out.println("Can't find the search key: " + searchKey);
        }else{
            System.out.println("Found the search key: " + searchKey);
        }

        //deleting the item 25
        //much like before we have to match the searchKey with x iterating over the length of the array
        //this for loop looks for the element
        searchKey = 25;
        for(x = 0; x < nElements; x++){
            if (structOne[x] == searchKey){
                break;
            }
        }
        //this for loop moves all the elements down.
        for(int k = x; k < nElements - 1; k++){
            structOne[k] = structOne[k + 1];
        }
        nElements--;  //this line erases the searchKey
        System.out.println(Arrays.toString(structOne));

        // searchKey = 100;
        // for(x = 0; x < nElements; x++){
        //     if (structOne[x] == searchKey){
        //         break;
        //     }
        // }
        // for (int s = x; s < nElements - 1; s++){
        //     structOne[s] = structOne[s + 1];
        // }
        // nElements --;
        // System.out.println(Arrays.toString(structOne));

    }
    
}