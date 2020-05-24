/**
 * Demonstration of 3 methods.
 *  (1) putIfAbsent -> put the Entry into ConCurrentHashMap only if the key is absent
 *  (2) remove() -> remove the Entry from ConCurrentHashMap  if both given key and value are matched.
 *  (3) replace() -> replace the value from ConCurrentHashMap if the both given key and values matched.
 */
package com.practice.java.ConcurrentCollection;

import java.util.concurrent.ConcurrentHashMap;

public class ConCurrentHashMapDemo1 {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();
        chm.put(101,"A");
        chm.put(102,"B");
        chm.putIfAbsent(103,"C");
        System.out.println(chm);
        chm.remove(101,"D");
        System.out.println(chm);
        chm.replace(102,"B","E");
        System.out.println(chm);
    }
}
