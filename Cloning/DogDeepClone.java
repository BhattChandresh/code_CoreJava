/**
 *  Deep Cloning :
 *  The process of creating exactly duplicate independent copy including contained object is called
 *  deep cloning.
 *  In deep cloning if the main object contains any primitive variables then in the cloned object duplicated copies will be created.
 *  if the main object contains any reference variable then the corrosponing contained object also will be created in cloned copy.
 *  We need to override the Object class clone() method.
 */
package com.practice.java.CloingDemo;

public class DogDeepClone implements Cloneable {
    int i;
    CatDeep c;

    DogDeepClone(CatDeep c, int i) {
        this.i = i;
        this.c = c;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        CatDeep c1 = new CatDeep(c.j);
        DogDeepClone d1 = new DogDeepClone(c1, i);
        return  d1;
    }
}

class CatDeep {
    int j;
    CatDeep(int j) {
        this.j   = j;
    }
}
