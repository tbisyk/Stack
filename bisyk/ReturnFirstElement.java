package com.gmail.t.bisyk;

	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.io.Serializable;

public class ReturnFirstElement implements Serializable{


		public ReturnFirstElement() {
			super();
		}

		
	    public void saveElementToFile(Object fistElement) throws IOException {
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"))) {
	            oos.writeObject(fistElement);
	            oos.close();
	        } catch (IOException e) {
	            throw e;
	        }
	    }

	    public Object readElementFromFile() {
	    	Object obj = null;
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"))) {
	            obj = (Object) ois.readObject();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return obj;
	    }
		
	}
