/**
 *  Below question is asked  at VMWare for the role of DevOps.
 *  Question is : Find out the given String is balanced or unbalanced.
 *  "[{()}]" --> Balanced String i.e. Match each symbol in string and if we find opening and closing symbol then String is balanced
 *  "[{()} " --> Unbalanced String. If above condition is not matched then it is unbalanced.
 *
 *  Testing done on:
 *  [{}()]  -> Output : Balanced
 *  [{()}] -> Output : Balanced
 *  [{()} -> Output : Unbalanced.
 *  <()>{][} -> Output : Balanced
 *
 *
 */
package com.practice.java;

import java.util.*;

public class BalancedString {
    static Map<Character,Character> map = new HashMap<Character,Character>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        prepareLookup();
        balanceOrUnbalanced(input);
    }

    static void balanceOrUnbalanced(String input) {
        boolean isBalanced = false;
        char [] c = input.toCharArray();
        for(int index=0;index<c.length;index++) {
            Character symbol = map.get(c[index]);
            if((index > 0) && (isBalanced == false)){
                System.out.println("Unbalanced");
                break;
            }
            for(int index1=0;index1<c.length;index1++) {
//                System.out.println(symbol + " = " + c[index1]);
                if(symbol.equals(c[index1])) {
                    isBalanced = true;
                    break;
                }
            }
        }
        if(isBalanced == true)
            System.out.println("Balanced");
        else
            System.out.println("Unbalanced");
      }

    static void prepareLookup() {
        map.put('[',']');
        map.put(']','[');
        map.put('{','}');
        map.put('}','{');
        map.put('(',')');
        map.put(')','(');
        map.put('<','>');
        map.put('>','<');
    }

}
