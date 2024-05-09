public class Produto 
{
  private int Id;
  private String CodBarra;
  private String Sku;
  private String Nome;
  private String Descricao;
  private String Categoria;
  private double Preco;
  private double Peso;
  private String Fabricante;

  public int getId() 
  {
    return Id;
  }

  public void setId(int Id)
  {
    this.Id = Id;
  }

  public String getCodBarra() 
  {
    return CodBarra;
  }

  public void setCodBarra(String CodBarra) 
  {
    this.CodBarra = CodBarra;
  }

  public String getSku() 
  {
    return Sku;
  }

  public void setSku(String Sku) 
  {
     this.Sku = Sku;
  }

  public String getNome() 
  {
     return Nome;
  }

  public void setNome(String Nome)
  {
    this.Nome = Nome;
  }

  public String getDescricao() 
  {
     return Descricao;
  }

  public void setDescricao(String Descricao) 
  {
     this.Descricao = Descricao;
  }

  public String getCategoria() 
  {
    return Categoria;
  }

  public void setCategoria(String Categoria) 
  {
    this.Categoria = Categoria;
  }

  public double getPreco() 
  {
     return Preco;
  }

  public void setPreco(double Preco) 
  {
     this.Preco = Preco;
  }

  public double getPeso() 
  {
    return Peso;
  }

  public void setPeso(double Peso) 
  {
    this.Peso = Peso;
  }

  public String getFabricante() 
  {
    return Fabricante;
  }

  public void setFabricante(String Fabricante) 
  {
    this.Fabricante = Fabricante;
  }
}
