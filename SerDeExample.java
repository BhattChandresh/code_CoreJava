package com.practice.serde;

import java.io.Serializable;

/**
 *  Variable str, x,y are considered as instance variable.
 *  It also represents the object state.
 *
 */

public class SerDeExample implements Serializable {
    String str = "SerDeExample";
    int x =100;
    int y = 250;
}
