/**
 * Shallow Cloning :
 * The process of creating bitwise copy of an object is called shallow cloning.
 * If the main object contains primitive variables then exactly duplicates will be created in cloned object.
 * if the main object contains any reference variable then corrospoing object won't created, only duplicate reference variable created pointing to old object.
 * Object class clone method is used shallow cloing.
 *
 * Reference : Durga Software Solutions.
 */

package com.practice.java.CloingDemo;

public class DogShallow implements Cloneable {
    int i;
    CatShallow c;

    DogShallow(CatShallow c, int i) {
        this.c = c;
        this.i = i;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class CatShallow {
    int j;

    CatShallow(int j) {
        this.j  = j;
    }
}
