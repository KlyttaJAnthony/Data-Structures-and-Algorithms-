

class HighArray{
    
    private long[] structOne; //array
    private int nElements; //number of elements within the array

    public HighArray(int max){
        structOne = new long[max]; //variable for the amount of elements that will be put into the array
        nElements = 0;
    }
    public boolean find(long searchKey){ //finding specific value
        int x;
        for( x = 0; x < nElements; x++){ //loops through the elements of the list
            if(structOne[x] == searchKey){ //if the loop finds the element, break the loop
                break;
            }
        }
        if (x == nElements){ //if the loop goes all the way to the end
            return false; //if the loop goes all the way to the end, returns a false statement, the element doesn't exist
        }else{
            return true; //if the loop goes all the way to the end, and finds teh element, returns a true, the element exists
        }
    }
    public void insert(long value){ //putting an element into the array
        structOne[nElements] = value; //insert the element into the array
        nElements++; //increment the size of the array
    }
    public boolean delete(long value){
        int j;
        for( j = 0; j < nElements; j++){ //look for the element
            if( value == structOne[j]){
                break;
            }
        }
        if(j == nElements){ //can't find the element? Return false, doesn't exist
            return false;
        }else{ //found the element?
            for(int k = j; k < nElements; k++){ //move the higher elements down 
                structOne[k] = structOne[k + 1];
            }
            nElements--; //decrement the size
            return true;
        }
    }
    public void display(){
        for(int j = 0; j < nElements; j++){
            System.out.print(structOne[j] + " ");
        }
        System.out.println(); //remember to put the print statement after the loop so that it displays on one line
    }
}
class HighArrayApp{
    public static void main(String[] args){

        int maxSize = 100; //size of the array
        HighArray ArrayStruct;
        ArrayStruct = new HighArray(maxSize); //create an array object

        ArrayStruct.insert(23);
        ArrayStruct.insert(34);
        ArrayStruct.insert(54);
        ArrayStruct.insert(86);
        ArrayStruct.insert(94);
        ArrayStruct.insert(74);
        ArrayStruct.insert(65);
        ArrayStruct.insert(10);
        ArrayStruct.insert(1);
        ArrayStruct.insert(87);

        ArrayStruct.display();


        int searchKey = 23;
        if (ArrayStruct.find(searchKey)){
            System.out.println("Found " + searchKey);
        }else{
            System.out.println("Can't find " + searchKey);
        }

        ArrayStruct.delete(23);
        ArrayStruct.delete(65);
        ArrayStruct.delete(1);

        ArrayStruct.display();

        /** 
         * the main() method only concerns itself with what is within the array rather than how the array functions
         * for instance in the LowArray.java program, the program's functionality are within the main method
         * where as in the HighArray.java program, the programs functionality are all within the HighArray.java program
         * and the main() method only plays with the array. 
         * This level of functionality is called Abstraction. By having the main() method only handle the cursory parts of it, 
         * we make it easier for end users to interact with the array
        */
    }
}