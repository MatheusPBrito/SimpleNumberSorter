import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  public static void main (String ... args){

    int numero = 0;
    String numeroStr;
    Scanner input = new Scanner(System.in);
    while (true) {
      System.out.print("Escreva um número: ");
      if (input.hasNextInt()) {
        numero = input.nextInt(); 
        break;
      }
      else{
        System.out.println("Valor inválido!");
        input.nextLine();
      }
    }
    numeroStr = Integer.toString(numero);
    ArrayList<Integer> numeroArray = new ArrayList<Integer>();
    for (int i = 0; i < numeroStr.length(); i++){
       numeroArray.add(Integer.parseInt(numeroStr.valueOf(numeroStr.charAt(i)))); 
    }

    for (int y = 0; y < numeroArray.size(); y++) {
      for (int i = 0; i < numeroArray.size(); i++){
          int valorDoNumAtual = numeroArray.get(i);
          int valorProxNum = 0;
          if(i + 1 < numeroArray.size()){
            valorProxNum = numeroArray.get(i + 1);
            if(numeroArray.get(i + 1) < numeroArray.get(i)){
              numeroArray.set(i + 1, valorDoNumAtual);
              numeroArray.set(i, valorProxNum);
            }
          }
      }
    }

    for (int i = 0; i < numeroArray.size(); i ++){
      System.out.print(numeroArray.get(i));
    }
    System.out.println("");
  }
}
