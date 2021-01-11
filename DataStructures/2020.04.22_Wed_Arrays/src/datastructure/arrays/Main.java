package datastructure.arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] intArray = new int[7]; //arrays are static
        //arrays are not dynamic u have to state how many values
        // arrays re Zero based , it counts from 0
        //you dont have to fill the whole array
        intArray[0] = 20;  //first position
        intArray[1] = 35;
        intArray[2] = 15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = 22;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
// elements of arrays are stored as one block in memory
// all values in an array are of save value
// if one value is 4 bytes then all of them are 4 each
// so even if u do an array of string , it will still be same size each beacuse
// u store the object reference of the strings in the array
// coz of the index wecan even calcualet the momory

by x+i*y