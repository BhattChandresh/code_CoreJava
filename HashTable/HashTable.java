/**
 *  Time Complexity for Hash table for insertion,deletion and searching is O(1)
 *  - ArraySize of underlying is = prime number
 *  - In Double hashing technique hashfunction2 should never return 0.
 *  There are three technique:
 *  - Linear Probing
 *  - Quadratic Probing
 *  - Double Hashing ( Here we will use two function)
 *     -- Function1 will return index of the array where the value to be stored
 *     -- Function 2 will return stepsize
 *     In case of collision we can use
 *     index = index + stepsize
 *     index = index % arraysize
 *
 *     Another technique is seperate chaining which is using LinkedList to avoid collision.
 */

package com.practice.java;

public class HashTable {
    String[] hashArray;
    int arraySize;
    int size =0;  //count the number of elements in hash table. (In hashArray of size == arraySize).

    public HashTable(int noOfSlots) {
        if (isPrime(noOfSlots)) {
            hashArray = new String[noOfSlots];
            arraySize = noOfSlots;
        } else {
            int primeCount = getNextPrime(noOfSlots);
            hashArray = new String[primeCount];
            arraySize = primeCount;
            System.out.println("Hash table size given " + noOfSlots + " is not a prime number");
            System.out.println("Hash table size changed to :" + primeCount);
        }
    }

    private boolean isPrime(int num) {
        for(int i=2; i * i<= num;i++) {
            if(num % 2 == 0)
                return false;
        }
        return true;
    }

    private int getNextPrime(int number) {
       for(int i = number;true;i++){
           if(isPrime(number))
               return i;
       }
    }

    // Returns index position
    private int hashFunc1(String word) {
        int hasVal = word.hashCode();
        hasVal = hasVal % arraySize;
        if(hasVal < 0)
            hasVal += arraySize;
        return hasVal;
    }

    //Returns the step size > 0 to use in case of collision
    private int hashFunc2(String word) {
        int hasVal = word.hashCode();
        hasVal %= arraySize;
        if(hasVal < 0)
            hasVal += arraySize;
        // For return value of step size , USE A PRIME NUMBER LESS THAN ARRAY SIZE.
        return 3 - hasVal % 3;
    }

    public void insert(String word) {
        int hasVal = hashFunc1(word);
        int stepSize = hashFunc2(word);

        while(hashArray[hasVal] != null) {
            hasVal = hasVal + stepSize;
            hasVal = hasVal % arraySize;
        }
        hashArray[hasVal] = word;
        System.out.println("Inserted the word " + word +  " at " + hasVal) ;
        size++;
    }


    public String find(String word) {
        int hasVal = hashFunc1(word);
        int stepSize = hashFunc2(word);

        while(hashArray[hasVal] != null) {
            if(hashArray[hasVal].equals(word)){
                return hashArray[hasVal];
            }
            hasVal = hasVal + stepSize;
            hasVal = hasVal % arraySize;
        }
        return hashArray[hasVal];
    }

    public void displayTable() {
        System.out.println("Table: ");
        for(int i=0;i < arraySize;i++) {
            if(hashArray[i] != null)
                System.out.println(i + " -- " + hashArray[i]);
            else
                System.out.println(i + " -- " + "NULL");
        }
        System.out.println();
    }
}
