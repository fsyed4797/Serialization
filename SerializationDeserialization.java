package serialization;

import java.io.*;
  
class SerializationDeserialization implements Serializable {

private static final long serialVersionUID = 129348938L;
    transient int dob;
    String email;
    String name;
    int phone;  
  
    // constructor
public SerializationDeserialization(String name, int phone, String email, int dob)
    {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.dob = dob;
    }
  
}
  
  