/*
in this program we created an array called arr. We then placed ten data items within it.
We then searched for the items with a value of 66, and then displayed all the items.
Then, we removed the items with 55, and then displayed the remaining 9 items after deletion.
*/

class Arrays{
  public static void main(String[] args){


    long[] arr; //creating an array
    arr = new long[100]; //the array we created can hold only 100 elements
    int nElems = 0; //number of items within the array
    int j; //loop variable (j=0; j < nElems; j++)
    long searchKey; //variable to reference when searching for the correct element


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

//--------------------------------------------------------

    for(j=0; j < nElems; j++) //displays the items. Before, we would reference j < 0, but we need the searching variable nElems
    System.out.print(arr[j] + " ");
    System.out.println(" ");

//---------------------------------------------------------

    searchKey = 66; //finds item with key of 66
    for(j = 0; j < nElems; j++) //for each element
      if (arr[j] == searchKey) //was the item found?
        break;                 //if item was found then this exits before it goes the loops goes to the end
    if(j == nElems)              //is the loop at the end?
      System.out.println("Can't find " + searchKey); //yes it is at the end
    else
      System.out.println("Found " + searchKey); //no it is not at the end

//---------------------------------------------------------

    searchKey = 55;             //deletes item with key of 55
    for(j = 0; j < nElems; j++) //look for the item that must be deleted
      if (arr[j] == searchKey)
        break;
    for(int k = j; k < nElems - 1; k++) //shift higher items downward
      arr[k] = arr[k + 1];
    nElems--;                           //decrement the size of the array

//--------------------------------------------------------
//displays items
    for(j = 0; j < nElems; j++)
      System.out.print( arr[j] + " ");
    System.out.println(" ");

  }
}
