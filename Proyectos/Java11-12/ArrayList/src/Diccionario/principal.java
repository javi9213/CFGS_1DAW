package Diccionario;

import java.util.*;

public class principal {

	HashMap<String,String> diccionario;
	
	public principal(){
		diccionario = new HashMap<String, String>();
	}
	
	public void insertar(){
		diccionario.put("hola", "hello");
		diccionario.put("adios", "bye");
		diccionario.put("hello", "hola");
		diccionario.put("bye", "adios");
	}
	
	@SuppressWarnings("unchecked")
	public void mostrar(){
		Set<Map.Entry<String, String>> a = diccionario.entrySet();
		@SuppressWarnings("rawtypes")
		Iterator it = a.iterator();
		Map.Entry<String, String> elem;
		
		while(it.hasNext()){
			elem = (Map.Entry<String, String>)it.next();
			System.out.println(elem.getKey()+" "+elem.getValue());
		}
	}
	
	public void buscarE(String espa){
		
		if(diccionario.containsKey(espa)){
			System.out.println("La palabra "+espa+ " en Español es: "+diccionario.get(espa)+" traducido al Ingles");
		}else{
			System.out.println("La palabra "+espa+ "no esta contemplada en este diccionario");
		}
		
	}
	
	public void buscarI(String ing){
		
		if(diccionario.containsValue(ing)){
			System.out.println("La palabra "+ing+" en Ingles es: "+diccionario.get(ing)+" traducido al Español");
		}else{
			System.out.println("La palabra "+ing+" no esta contemplada en este diccionario");
		}
	}
}