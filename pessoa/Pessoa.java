package pessoa;

public class Pessoa {
 
  private String name;
  private String age;
  // private String cpf;
  // private String city;
  // private String country;
  // private String state;
  

  public void setName(String name){
    this.name = name;
  }
  public void setAge(String age){
    this.age = age;
  }
//   public void setCPF(String cpf){
//     this.cpf = cpf;
//   }
//   public void setCity(String city){
//     this.city = city;
//   }
//  public void setState(String state){
//     this.state = state;
//   }
//   public void setCountry(String country){
//     this.country = country;
  

  public String getName(){
    return this.name;
  }
  public String getAge(){
    return this.age;
  }
  
  
  public String imprimirTipo(){
    return "Apenas Pessoa";
  }

//   void setAge(String cpf){
//     this.age = cpf;
//   }
//   void setCPF(String cpf){
//     this.cpf = cpf;
//   }
//   void setCity(String cpf){
//     this.city = cpf;
//   }
//  void setState(String cpf){
//     this.state = cpf;
//   }
//   void setCountry(String cpf){
//     this.country = cpf;
//   }
 

}
