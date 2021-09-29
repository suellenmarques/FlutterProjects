void main() {
//Entrar via teclado com um valor qualquer. Após a digitação, exibir a tabuada do valor solicitado, no intervalo de um a dez.
  double valor = 7;
  for (int i = 10; i > 0; i--) {
    double resultado = valor * i;
    print("$valor X $i = $resultado");
  }
}
