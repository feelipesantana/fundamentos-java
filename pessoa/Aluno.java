package pessoa;

public class Aluno extends Pessoa{
  private int id;

  public void setId(int id){
    this.id = id;
  }

  public int getId(){
     return this.id;
  }

  public String imprimirTipo(){
    System.out.println(super.imprimirTipo());
    return "Você é Aluno";
  }

}
