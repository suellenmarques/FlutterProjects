void main() {
// Entrar via teclado com o valor de uma temperatura em graus Celsius,
//calcular e exibir sua temperatura equivalente em Fahrenheit.
//(3 °C × 9/5) + 32

  double graus = 15;

  double fahrenheitConversao(graus) {
    var fahrenheit = (graus * (9 / 5) + 32);

    return fahrenheit;
  }

  ;

  var temperatura = fahrenheitConversao(graus);

  print("$graus° em Fahrenheit é igual a: $temperatura");
}
