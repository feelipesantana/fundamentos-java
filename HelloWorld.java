import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
  public static void main(String[] args){
    // float data = 50.4f;
    // float value = 38.1f;
    // for(float i = 0.1f; i<= data; i++){
    //   System.out.println("Result = "+ i);

    //   if(i == value){
    //     System.out.println("Valor i = a Value");
    //   }

      List<String> names = new ArrayList<>();
      names.add("Felipe");
      names.add("Santana");
      names.add("de JeSus");
      names.add("Ana Flavia");

      for(String name: names){
        System.out.println("O nome é: "+ name);
      }
      
    }




  
}