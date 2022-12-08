import java.util.Scanner;

fun main() {
    var sc = Scanner(System.`in`)      
    println("Digite o valor bruto do salario:"); 
    var bruto = sc.nextFloat(); 
    println("Informe o valo do adicional"); 
    var adicional = sc.nextFloat();
    
    if(bruto <= 1100.0){
        println((bruto -(bruto * 0.05f)) + adicional);
    }else if (bruto <= 2500.0){
        println((bruto -(bruto * 0.10f)) + adicional);
    }else if(bruto > 2500.0){
        println((bruto -(bruto * 0.15f)) + adicional);
    }
}