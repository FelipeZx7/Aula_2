package Aula_2;

public class Cachorro {
  public String nome;
  public String raca;
  public String idade;
  public String cor;
  
  
  public void latir() {
	  System.out.println("O cachorro " + nome + "latir");
  }
  
  public void GetCachorro() {
  System.out.println(
		  "Nome; " + nome +
		  "\nRaça: "  + raca +
		  "\nIdade: " + idade +
		  "\nCor: " + cor
	);
	  
  }
}
