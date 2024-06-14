
public class While {
  public static void main(String[] args) {
    Double mesada = 50.00;

    while (mesada > 0) {
      Double valorDoce = (double) Math.random() * 11.75;

      if (valorDoce > mesada) {
        valorDoce = mesada;
      }
      System.out.println("Valor do doce: " + valorDoce + " adicionado ao carrinho");
      mesada = mesada - valorDoce;
    }

    System.out.println("Mesada: " + mesada);
    System.out.println("Você gastou toda sua mesada em doces");

  }
}
