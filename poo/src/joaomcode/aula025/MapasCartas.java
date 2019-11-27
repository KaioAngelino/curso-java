package joaomcode.aula025;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapasCartas {
	
	public static void main(String[] args) {
		Map<String, Integer> mapa = new LinkedHashMap<>();
		
		mapa.put("Ás", 1);
		mapa.put("2", 2);
		mapa.put("3", 3);
		mapa.put("4", 3);
		mapa.put("5", 5);
		mapa.put("6", 6);
		mapa.put("7", 7);
		mapa.put("8", 8);
		mapa.put("9", 9);
		mapa.put("10", 10);
		mapa.put("J", 11);
		mapa.put("Q", 12);
		mapa.put("K", 13);
		
		for (String key : mapa.keySet()) {
			System.out.println(key);
		}
		
		System.out.println(" ");
		
		for (int key : mapa.values()) {
			System.out.println(key);
		}
		
		System.out.println(" ");
		
		for (Map.Entry<String, Integer> key : mapa.entrySet()) {
			System.out.println(key.getKey()+" "+key.getValue());
		}
	}

}
