
public class Principal {

	public static void main(String[] args) {
		
		
		CarrinhoDeCompra meuCarrinho = new CarrinhoDeCompra();
		
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("calabresa");
		p1.adicionaIngrediente("azeitona");
		p1.adicionaIngrediente("ovo");
		
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("pimentao");
		p2.adicionaIngrediente("camarao");
		
		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("calabresa");
		p3.adicionaIngrediente("ovo");
		p3.adicionaIngrediente("pimentao");
		p3.adicionaIngrediente("presunto");
		p3.adicionaIngrediente("rucula");
		p3.adicionaIngrediente("tomate");
		
		
		Pizza p4 = new Pizza();
		

		//foi feito um quarto teste para mostrar que o carrinho não aceitou uma pizza sem ingredientes (acusado em um print)
		
		meuCarrinho.adicionaPizza(p1);
		meuCarrinho.adicionaPizza(p2);
		meuCarrinho.adicionaPizza(p3);
		meuCarrinho.adicionaPizza(p4);
		
		System.out.println("--------------------------------------------------------------------------------------------");
		
		//pizzas devidamente adicionadas no carrinho, sendo que a quarta não será aceita
		
		System.out.println("Checkout : " + meuCarrinho.getTotalPizzas() + " pizzas -> " + meuCarrinho.getValorTotalCompra() + " reais");
		
		System.out.println("--------------------------------------------------------------------------------------------");
		
		//Total do Carrinho
		
		p1.printIngredientes();
		
		//Quantidade usada de cada ingrediente

	}

}
