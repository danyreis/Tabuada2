import java.util.Scanner;

public class tabuada1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        System.out.println("Qual operação deseja realizar:\n 1.Adição \n 2.Subtração \n 3.Multiplicação \n 4.Divisão");
        int operacao = entrada.nextInt();
        System.out.println("Qual o número que deseja iniciar a tabuada? ");
        int tabuada = entrada.nextInt();
        
        for (int i = 1; i<=10; i++){
            if(operacao == 1){
                System.out.println(tabuada+"+"+i+"="+(i+tabuada));
            }else if(operacao == 2){                  
                System.out.println(tabuada+"-"+i+"="+(tabuada-i));       
            }else if(operacao == 3){
                System.out.println(tabuada+"*"+i+"="+(i*tabuada));
            }else if(operacao == 4){
                System.out.println(tabuada+":"+i+"="+(tabuada/i));
            }
        }
        System.out.println("Fim da tabuada");
    }
}