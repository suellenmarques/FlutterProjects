void main() {
//Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um valor referente ao
//pagamento da somatória destes valores. Calcular e exibir o troco que deverá ser devolvido.

  double p1 = 1;
  double p2 = 1;
  double p3 = 1;
  double p4 = 1;
  double p5 = 1;

  double pagamentoCliente = 10;

  double calculoTroco(num1, num2, num3, num4, num5, pagamentoCliente) {
    double soma = p1 + p2 + p3 + p4 + p5;

    double troco = pagamentoCliente - soma;

    return troco;
  }

  double total = calculoTroco(p1, p2, p3, p4, p5, pagamentoCliente);

  print("O troco é de: $total reais");
}
