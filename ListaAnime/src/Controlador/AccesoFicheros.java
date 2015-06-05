package Controlador;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AccesoFicheros {
	
	public Object leerObjeto(String ruta) throws IOException, ClassNotFoundException{
		FileInputStream myFile=new FileInputStream(ruta);
		BufferedInputStream myBuff=new BufferedInputStream(myFile);
		ObjectInputStream myObject=new ObjectInputStream(myBuff);
		try {
			return myObject.readObject();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return myObject.readObject();
	}
	
	public void escribirObjeto(Object objeto, String ruta) throws FileNotFoundException, IOException{
		ObjectOutputStream objetoEscritura=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(ruta)));
		objetoEscritura.writeObject(objeto);
		objetoEscritura.close();
	}
}
