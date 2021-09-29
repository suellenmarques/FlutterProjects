void main() {
//  Armazenar o nome, sexo e idade de 5 pessoas.
//   As entradas devem ser apenas “F” ou “M” para o sexo e valores
//     positivos para a idade. Após a digitação dos dados, exibir os dados
//     (nome, sexo e idade) de todas as pessoas do sexo feminino.

  Pessoa p1 = Pessoa("Suellen", "F", 24);
  Pessoa p2 = Pessoa("Luiz", "M", 22);
  Pessoa p3 = Pessoa("Emanuel", "M", 21);
  Pessoa p4 = Pessoa("Manoel", "M", 60);
  Pessoa p5 = Pessoa("Katia", "F", 51);

  final pessoas = [p1, p2, p3, p4, p5];

  for (Pessoa p in pessoas) {
    if (p.sexo == "F") {
      print("================");
      print(p.nome);
      print(p.sexo);
      print(p.idade);
      print("================");
    }
  }
}

class Pessoa {
  String nome;
  String sexo;
  int idade;
  Pessoa(this.nome, this.sexo, this.idade);
}
