import java.util.Scanner;


public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor bruto do salario:"); 
        float bruto = sc.nextFloat(); 
        System.out.println("Informe o valo do adicional"); 
        float adicional = sc.nextFloat();
        float total = 0;

        if(bruto <= 1100.0){
            total = (bruto -(bruto * 0.05f)) + adicional;
        }else if (bruto <= 2500.0){
            total = (bruto -(bruto * 0.1f)) + adicional;
        }else if(bruto > 2500.0){
            total = (bruto -(bruto * 0.15f)) + adicional;
        }

        System.out.println(total);
    }
    
}

