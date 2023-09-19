import java.util.Scanner;

public class tabuada2 {
    public static void main (String[] args){
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Digite o número que deseja fazer as operações: ");
        int num = entrada1.nextInt();
        System.out.println("\nAdição:");
        for (int i=1; i<=10; i++){            
            System.out.println(+num+"+"+i+"="+(num+i));
        }
        System.out.println("\nSubtração:");
        for (int i=1; i<=10; i++){            
            System.out.println(+num+"-"+i+"="+(num-i));
        }
        System.out.println("\nMultiplicação:");
        for (int i=1; i<=10; i++){            
            System.out.println(+num+"*"+i+"="+(num*i));
        }
        System.out.println("\nDivisão:");
        for (int i=1; i<=10; i++){            
            System.out.println(+num+"/"+i+"="+(num/i));
        }       
    }
}
