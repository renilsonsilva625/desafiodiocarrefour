var scanf = require("scanf")
function CalculaSalario(bruto, adicional){
    if (bruto <= 1100.0)

        total = (bruto -(bruto * 0.05))+ adicional;
    else if (bruto <=2500.0)
        total = (bruto -(bruto * 0.1))+ adicional;
    else if (bruto > 2500.0)
        total = (bruto -(bruto * 0.15))+ adicional;
    
    return total;
}

console.log("digite o valor bruto do salario:");
var bruto = scanf('%f');
console.log("digite o valor do adicional:");
var adicional = scanf('%f');
console.log(CalculaSalario(bruto,adicional));