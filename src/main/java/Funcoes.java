import java.util.ArrayList;
import java.util.List;

public class Funcoes 
{
    private int i;
    private List<Produto> produtos;
    
    public Funcoes() 
    {
        produtos = new ArrayList<Produto>();
    }
    
    // Tenatndo incluir um novo produto na lista
    public void incluirProduto(Produto produto) 
    {
        produtos.add(produto);
        System.out.println("Produto adicionado");
    }
    
    // Alterar um produto existente na lista
    public void alterarProduto(int id, Produto novoProduto) 
    {
        for(i=0; i<produtos.size(); i++) 
        {
            if (produtos.get(i).getId() == id) 
            {
                produtos.set(i, novoProduto);
                System.out.println("Produto alterado!");
                return;
            }
        }
        System.out.println("O produto não foi encontrado");
    }
    
    // Excluir um produto existente
    public void excluirProduto(int id) 
    {
        for (Produto produto : produtos) 
        {
            if (produto.getId() == id) 
            {
                produtos.remove(produto);
                System.out.println("Produto removido");
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }
    
    // listando todos os produtos
    public void listarTodosProdutos() 
    {
        for (Produto produto : produtos) 
        {
            System.out.println(produto);
        }
    }
    
    //listando um produto específico pelo seu ID
    public void listarProduto(int id) 
    {
        for (Produto produto : produtos) 
        {
            if (produto.getId() == id) 
            {
                System.out.println(produto);
                return;
            }
        }
        System.out.println("Produto não encontrado");
    }
}