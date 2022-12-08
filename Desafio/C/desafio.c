#include <stdio.h>
#include <stdlib.h>

int main(){
    float bruto, adicional, total;
    printf("Digite o valor bruto do salario:");
    scanf("%f", &bruto);
    printf("\nDigite o valor do adicional:");
    scanf("%f", &adicional);
    if(bruto <= 1100.0){
        total = (bruto -(bruto * 0.05))+ adicional;
    }else if (bruto <= 2500.0){
        total = (bruto -(bruto * 0.1))+ adicional;
    }else if(bruto > 2500.0){
        total = (bruto -(bruto * 0.15))+ adicional;
    }
    printf("%.2f\n", total);
    return 0;
}