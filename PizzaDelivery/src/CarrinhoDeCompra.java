
public class CarrinhoDeCompra {
	
	private int totalPizzas = 0;
	
	Pizza[] carrinhoCompra = new Pizza[50];
	
	public void adicionaPizza (Pizza novaPizza) {
		if (novaPizza.getNumeroIngredientesPizza() == 0)
			System.out.println("Houve uma Pizza sem ingredientes");
		else {
			carrinhoCompra [this.totalPizzas] = novaPizza;
			this.totalPizzas++;
		}
		
	}
	
	public int getValorTotalCompra() {
		int valorTotal = 0;
		
		for (int i = 0; carrinhoCompra[i] != null; i++)
			valorTotal += carrinhoCompra[i].getPreco();
		
		return valorTotal;
	}
	
	public int getTotalPizzas() {
		return totalPizzas;
	}
}
