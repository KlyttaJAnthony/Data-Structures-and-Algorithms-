

/**
 * implementing a binary search within an arry
 * THINGS TO NOTE: 
 * upperbounds and lowerbounds are what are considered to be the primary variables that
 * make a binary search a binary search(note because there are two bounds)
 * 
 * anyways, the insert function allows for linear search to be initiated since a linear
 * search only searches through an array "linearly"
 * meaning one at a time
 */

class OrderedArray{
    private long[] arrayOne;
    private int nElements;
    
    public OrderedArray(int max){
        arrayOne = new long[max];
        nElements = 0;
    }
    public int size(){
        return nElements;
    }
    public int find(long searchKey){
        int lowerBound = 0;
        int upperBound = nElements -1;
        int curIn;

        while (true){
            curIn = (lowerBound + upperBound) / 2;
            if(arrayOne[curIn] == searchKey){
                return curIn;                           //this line only returns true if the element was found
            }else if (lowerBound > upperBound){         
                return nElements;                       //if the binary search cannot find it
            }else{                                      //then divide the range
                if (arrayOne[curIn] < searchKey){
                    lowerBound = curIn + 1;             //this code indicates that what we are looking for is in the upper bound 
                }else{
                    upperBound = curIn - 1;             //this code indicates that what we are looking for is in the lower bound
                }
            }
        }

    }
    public void insert(long value){ 
        int x;
        for(x = 0; x < nElements; x++){ //find where the element is suppose to go
            if (arrayOne[x] > value){   //this is the linear search to find which index of the array
                break;
            }
        }
        for(int j = nElements; j > x; j--){ //move bigger ones up
            arrayOne[j] = arrayOne[j - 1];
        }
        arrayOne[x] = value; //insert it
        nElements++;         //increment it
    }
    public boolean delete(long value){
        int x = find(value);
        if(x == nElements){
            return false;
        }else{
            for(int j = x; j < nElements; j++){
                arrayOne[j] = arrayOne[j + 1];
            }
            nElements--;
            return true;
        }
    }
    public void display(){
        for(int x = 0; x < nElements; x++){
            System.out.print(arrayOne[x] + " ");
        }
        System.out.println();
    } 
}
class OrderedArrayApp{
    public static void main(String[] args){
        int maxSize = 100;
        OrderedArray arrayStruct;
        arrayStruct = new OrderedArray(maxSize);


        arrayStruct.insert(23);
        arrayStruct.insert(53);
        arrayStruct.insert(76);
        arrayStruct.insert(24);
        arrayStruct.insert(96);
        arrayStruct.insert(12);
        arrayStruct.insert(65);
        arrayStruct.insert(84);
        arrayStruct.insert(32);
        arrayStruct.insert(45);
        arrayStruct.insert(85);
        arrayStruct.insert(26);
        arrayStruct.insert(74);
        arrayStruct.insert(99);

        int searchKey = 543;
        if(arrayStruct.find(searchKey) != arrayStruct.size()){
            System.out.println("Found " + searchKey);
        }else{
            System.out.println("Can't find " + searchKey);
        }
        arrayStruct.display();

        arrayStruct.delete(76);
        arrayStruct.delete(26);
        arrayStruct.delete(99);
        arrayStruct.display();


    }
}