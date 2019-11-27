package joaomcode.aula025;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Mapas {

	public static void main(String[] args) {
		ArrayList<String> listas = new ArrayList<>();

		// Criando um Map
		 Map<String, String> mapa = new HashMap<>();

		// Criando um LinkedHashMap
//		 Map<String, String> mapa = new LinkedHashMap<>();

		mapa.put("Pobrema", "Problema");
		mapa.put("Vc", "Você");
		mapa.put("De rocha", "Maneiro");
		mapa.put("Arriegua", "Poxa");

		for (String key : mapa.keySet()) {
			System.out.println(key);
		}
		
		System.out.println(" ");
		
		for (String key : mapa.values()) {
			System.out.println(key);
		}
		
		System.out.println(" ");
		
		for (Map.Entry<String, String> item : mapa.entrySet()) {
			System.out.println(item.getKey()+ " : "+item.getValue());
		}

	}

}
