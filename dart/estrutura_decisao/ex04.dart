void main() {
//Entrar com o peso e a altura de uma determinada pessoa.
//Após a digitação, exibir se esta pessoa está ou não com seu peso ideal. Fórmula: peso/altura².

  double peso = 53;
  double altura = 1.64;

  String pessoa = "Feminino";

  double imc = peso / (altura * altura);
  print(imc);

  if (pessoa == "Feminino") {
    if (imc < 19) {
      print("Abaixo do peso");
    }
    if (19 <= imc && imc < 24) {
      print("Peso ideal");
    }
    if (imc >= 24) {
      print("Acíma do peso");
    }
  }
}
