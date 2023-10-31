import java.util.HashMap;
import java.util.Map;

public class Collections{
  public static void main(String[] args) {
    Map<String, Integer> notes = new HashMap<>();

    notes.put("Ney", 11);
    notes.put("Felipe", 10);

    var nota = notes.get("Felipe");

    for(Map.Entry<String,Integer> entry:notes.entrySet()){
      String key = entry.getKey();
      Integer value = entry.getValue();

      System.out.println("A chave é: "+ key + " O valor é: "+ value);
    }
    System.out.println(nota);
  }
}