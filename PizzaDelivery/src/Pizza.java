import java.util.HashMap;
import java.util.Map;


public class Pizza {
	
	private static Map <String, Integer> ingredientes = criarHashMap();
	private static Map <String, Integer> criarHashMap() {
	
		Map <String,Integer> hashMap =  new HashMap<String,Integer>();
		
		hashMap.put("calabresa", 0);
		hashMap.put("azeitona", 0);
		hashMap.put("ovo", 0);
		hashMap.put("pimentao", 0);
		hashMap.put("camarao", 0);
		hashMap.put("presunto", 0);
		hashMap.put("rucula", 0);
		hashMap.put("tomate", 0);
		hashMap.put("champignon", 0);
		
		return hashMap;
	}
	
	private int ingredientesPizza = 0;
	

	public void adicionaIngrediente(String ingrediente) {
		this.ingredientesPizza++;
		contabilizaIngrediente(ingrediente);
	}
	
	
	public int getNumeroIngredientesPizza() {
		return ingredientesPizza;
	}
	
	private static void contabilizaIngrediente(String ingredienteUsado) {
		ingredientes.put(ingredienteUsado, (ingredientes.get(ingredienteUsado) + 1));
	}
	
	
	public int getPreco() {
		if (this.ingredientesPizza < 3) 
			return 15;
			
		if (this.ingredientesPizza <= 5) 
			return 20;
		
		return 23;
	}
		
	public void printIngredientes() {
		
		for (String key : ingredientes.keySet())
			System.out.println("O ingrediente " + key + " foi usado " + ingredientes.get(key) + " vezes.");
	}
}	




