

/**
 * 
 * THING TO NOTE HERE, IF YOU ARE GOING TO COMPILE THE CODE, MAKE SURE TO COMPILE
 * LOWARRAY.JAVA FIRST, 
 * THEN RUN LOWARRAYAPP.JAVA LAST
 * 
 * --------------> Javac LowArray.java
 * --------------> Java LowArrayApp
 * 
 * THE CODE WAS NOT PROCESSING CORRECTLY UNTIL THAT WAS DONE.
 * 
 */
class LowArray{
    private long[] a;

    public LowArray(int size){ //constructor
        a = new long[size]; //setting the array
    }
    public void setElement(int index, long value){ //setting the value of the arrays
        a[index] = value;
        /**a represents the index, inputting at that particular instance a value: (index, value) */
    }
    public long getElement(int index){ // getting the values of the arrays
        return a[index];
    }
    // public static void main(String[] args){

    // }
}
class LowArrayApp{
    public static void main(String[] args){

        //referencing the lowArray
        LowArray structOne = new LowArray(100); //much like before, we are adding only 100 elements into the array
        int nElements = 0;
        int x;

        //inserting the items into the array:
        /**       
         * the setElement function has two variables: index, and value
         * when setting these variables below in the index, we can see that the first number is index, second is value
         * 
         * */


        structOne.setElement(0, 77);
        structOne.setElement(1, 23);
        structOne.setElement(2, 54);
        structOne.setElement(3, 97);
        structOne.setElement(4, 55);
        structOne.setElement(5, 63);
        structOne.setElement(6, 38);
        structOne.setElement(7, 90);
        structOne.setElement(8, 100);
        structOne.setElement(9, 13);
        structOne.setElement(10, 82);
        structOne.setElement(11, 34);
        nElements = 11;
        
        //displaying the items
        for( x = 0; x < nElements; x++){
            System.out.print(structOne.getElement(x) + " ");
        //  System.out.println("");
        }
        System.out.println();


        //finding the key 100
        int searchKey = 100;
        for(x = 0; x < nElements; x++){
            if(structOne.getElement(x) == searchKey){
                System.out.println("Found the key: " + searchKey);
                break;
            }
        }
        if (x == nElements){
            System.out.println("Can't find the key: " + searchKey);
        }
        
        // //practice, not being able to find the number 323
        // int searchKey = 323;
        // for(x = 0; x < nElements; x++){
        //     if(structOne.getElement(x) == searchKey){
        //         System.out.println("Found the key: " + searchKey);
        //         break;
        //     }
        // }
        // if (x == nElements){
        //     System.out.println("Can't find the key: " + searchKey);
        // }

        //deleting the value 97
        for (x = 0; x < nElements; x++){
            if (structOne.getElement(x) == 97){
                break;
            }
        }
        for (int i = x; i < nElements; i++){
            structOne.setElement(i, structOne.getElement(i + 1));
        }
        nElements --;

        for (x = 0; x < nElements; x++){
            System.out.print(structOne.getElement(x) + " ");
        }
        System.out.println("");
    }
}