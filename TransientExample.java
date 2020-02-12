package com.practice.serde;

import java.io.Serializable;

/**
 * This class demonstrate the use of transient keyword.
 *  transient is a modifier and it is applicable only to a variable.
 *  One can not apply it to class, method, interface.
 *  transient means "NOT TO SERIALIZE".
 *  variable which is declared as transient, JVM will save the default value of the variable
 *  in a file rather then the declared value.
 *  Here, JVM will save the value of z as 0 rather than 70.
 *  There are two use of transient variable in serialization,
 *  1. We do not want to save / serialize the sensitive data during serialization for example Password or PIN number.
 *  2. We do not want to save / serialize the data that we can calculate from other variables.
 *
 *  NOTE:
 *  We can consider two more keywords static and final with respect to serialization.
 *      - If we declare the variable static, static variables do not take part in serialization because static variable are
 *        class level variable and it gets stored in 'Method Area' of JVM.
 *      - if we declare the variable as final then it is constant and during class loading JVM will replace  all the  final variable with constant.
 *        For example : final int ONE = 1;  then JVM will replace all the ONE with value 1 during class loading and constant can not be serialize.
 *        ONLY instance variable can be serialized.
 */

public class TransientExample implements Serializable {
    int x = 50;
    int y = 60;
    transient int z = 70;
    String str = "transient";
    static  String statcistr = "Core Java";
    final double dbl = 56.89;
}
