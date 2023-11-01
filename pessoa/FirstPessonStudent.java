package pessoa;

public class FirstPessonStudent {
  

  public static void main(String[] args) {
     Aluno aluno1 = new Aluno();
     Professor professor1 = new Professor();

     aluno1.setName("Felipe");
     aluno1.setAge("27");
    //  aluno1.setCPF("392793190381");
     aluno1.setId(5);

     System.out.println("o nome do primeiro aluno é: "+ aluno1.getName()+ " e sua matricula é: " + aluno1.getId());

      System.out.println(aluno1.imprimirTipo());
       System.out.println(professor1.imprimirTipo());
  }

}
