import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) 
  {
    Funcoes func = new Funcoes();
    Scanner scanner = new Scanner(System.in);
    int opcao;

    do 
    {
      System.out.println("Escolha uma opção:");
      System.out.println("1 - Incluir produto");
      System.out.println("2 - Alterar produto");
      System.out.println("3 - Excluir produto");
      System.out.println("4 - Listar todos os produtos");
      System.out.println("5 - Listar um produto");
      System.out.println("0 - Sair");
  
      opcao = scanner.nextInt();

      System.out.println("\n");
  
      switch (opcao) 
      {
        case 1:
          Produto produto1 = new Produto();
          // Defina os atributos do produto1
          func.incluirProduto(produto1);
          break;
        case 2:
          System.out.println("Digite o ID do produto que deseja alterar:");
          int idAlterar = scanner.nextInt();
          Produto novoProduto = new Produto();
          // Defina os atributos do novo produto
          func.alterarProduto(idAlterar, novoProduto);
          break;
        case 3:
          System.out.println("Digite o ID do produto que deseja excluir:");
          int idExcluir = scanner.nextInt();
          func.excluirProduto(idExcluir);
          break;
        case 4:
          func.listarTodosProdutos();
          break;
        case 5:
          System.out.println("Digite o ID do produto que deseja listar:");
          int idListar = scanner.nextInt();
          func.listarProduto(idListar);
          break;
        case 0:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida!");
          break;
        }
    } while (opcao != 0);

    scanner.close();
  }
}