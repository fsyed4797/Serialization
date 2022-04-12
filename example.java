package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class example {

	public static void main(String[] args)
	{
		SerializationDeserialization object = new SerializationDeserialization("john", 807854301, "test@gmail.com", 23-02-1996);
		String filename = "test.txt";

		try {

			// Saving of object in a file
			FileOutputStream file = new FileOutputStream
					(filename);
			ObjectOutputStream out = new ObjectOutputStream
					(file);

			// Serialize
			out.writeObject(object);

			out.close();
			file.close();

			System.out.println("Object has been serialized\n"
					+ "Data before Deserialization.");
			printdata(object);

			// value of static variable changed
			object.dob = 15-03-2001;
		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		object = null;

		try {

			
			FileInputStream file = new FileInputStream
					(filename);
			ObjectInputStream in = new ObjectInputStream
					(file);

			// Deserialize
			object = (SerializationDeserialization)in.readObject();

			in.close();
			file.close();
			System.out.println("Object has been deserialized\n"
					+ "Data after Deserialization.");
			printdata(object);

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException" +
					" is caught");
		}
	}

	public static void printdata(SerializationDeserialization object1)
	{

		System.out.println("name = " + object1.name);
		System.out.println("email = " + object1.email);
		System.out.println("phone = " + object1.phone);
		System.out.println("dob = " + object1.dob);
	}
}

