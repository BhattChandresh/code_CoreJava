package com.practice.serde;

import java.io.*;

/**
 *  Courtesy : Durga Software(DURGASOFT)
 *  16-02-2020
 *  Concept :
 *  - In serialization/Deserialization it is possible to serialize and deserialize multiple objects in a single file.
 *  - Rule of thumb is, the order in which we serialize the objects, we need to deserialize the objects in the same order.
 *  - For example, here there are 3 classes 1) Emp 2) Department and 3) Product.
 *  - If serialize the objects in the  order of Emp,Department and Product then we need to deserialize it in the order of
 *    Emp,Department and Product.
 *  - In real world, it is possible that we do not know the order of serialization then during deserialization we need to read the object
 *    first and then use the instance of operator.
 *
 */

public class SerializeAndDeserializeMultipleObject {
    public static void main(String[] args) {
        Emp emp1 = new Emp("Bhavesh Joshi", 4000.0);
        Emp emp2 = new Emp("Rahul Singh", 3800.0);
        Department dept1 = new Department("Sales", "Robort S");
        Department dept2 = new Department("HR", "Mital D");
        Product product1 = new Product("ProductSuper", "InfraStructure");
        Object[] obj = new Object[5];
        /**
         * Serialization Part
         *  An ObjectOutputStream writes primitive data types and graphs of Java objects to an OutputStream.
         *  Only objects that support the java.io.Serializable interface can be written to streams.
         *  FileOutputStream takes the binary data and writes them into the file.
         *  A file output stream is an output stream for writing data to a File or to a FileDescriptor.
         */
        try {
            FileOutputStream fs = new FileOutputStream("multipleobj.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            obj[0] = (Emp) emp1;
            obj[1] = (Emp) emp2;
            obj[2] = (Department) dept1;
            obj[3] = (Department) dept2;
            obj[4] = (Product) product1;
            for (int index = 0; index <= obj.length - 1; index++) {
                os.writeObject(obj[index]);
            }
            os.close();
            fs.close();
        } catch (IOException e) {
            System.out.println("Serialization IOException : " + e.getMessage());
        }

        /**
         *  DeSerialization Part
         *  An ObjectOutputStream writes primitive data types and graphs of Java objects to an OutputStream.
         *  Only objects that support the java.io.Serializable interface can be written to streams.
         *  FileOutputStream takes the binary data and writes them into the file.
         *  A file output stream is an output stream for writing data to a File or to a FileDescriptor.
         */
        try {
            FileInputStream fi = new FileInputStream("multipleobj.ser");
            ObjectInputStream oi = new ObjectInputStream(fi);
            Object object = null;
            for (int index = 0; index <= obj.length - 1; index++) {
                object = oi.readObject();
                if (object instanceof Emp) {
                    Emp e11 = (Emp) object;
                    System.out.println(e11.empName + "," + e11.salary);
                }
                else if (object instanceof Emp) {
                    Emp e12 = (Emp) object;
                    System.out.println(e12.empName + "," + e12.salary);
                }
                else if(object instanceof Department) {
                    Department d11 = (Department) object;
                    System.out.println(d11.departmentName + "," + d11.managerName);
                }
                else if(object instanceof Department) {
                    Department d12 = (Department) object;
                    System.out.println(d12.departmentName + "," + d12.managerName);
                }
                else if(object instanceof Product) {
                    Product p11 = (Product) object;
                    System.out.println(p11.productName + "," + p11.type);
                }
            }
            System.out.println("** Deserialization Successful. **");
            oi.close();
            fi.close();
        } catch (FileNotFoundException fe) {
            System.out.println("Deserialization FNFE : " + fe.getMessage());
        } catch (ClassNotFoundException ce) {
            System.out.println("Desrialization ClassNotFoundException : " + ce.getMessage());
        } catch (IOException e) {
            System.out.println("Deserialization IOException : " + e.getMessage());
        }
    }
}
