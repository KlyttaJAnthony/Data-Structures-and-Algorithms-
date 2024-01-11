/*
in this program we created an array called arr. We then placed ten items within the Array.
We searched for the item with the value of 66, displayed all the items thereafter.
Then, we removed the item with the value of 55, and the displayed the remaining 9 items after deletion.
*/

class Array{
  public static void main(String[] args){


    long[] arr; //reference an array
    arr = new long[100]; //can potentially hold up to 100 elements
    int nElems = 0; //number of items
    int j; //loop counter
    long searchKey; //key of item to search for


    arr[0] = 77; //inserting 10 elements to the arr array
    arr[1] = 99;
    arr[2] = 44;
    arr[3] = 55;
    arr[4] = 22;
    arr[5] = 88;
    arr[6] = 11;
    arr[7] = 00;
    arr[8] = 66;
    arr[9] = 33;
    nElems = 10; //initialized the first ten elements within the array


    for(j=0; j < nElems; j++) //displays the items.
      System.out.print(arr[j] + " ");
    System.out.println(" ");
  }
}
