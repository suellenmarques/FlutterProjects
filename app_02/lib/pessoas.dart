import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class Pessoas extends StatefulWidget {
  const Pessoas({Key? key}) : super(key: key);

  @override
  _PessoasState createState() => _PessoasState();
}

class _PessoasState extends State<Pessoas> {
  String numberPeoples = "0";
  int resultPeoples = 0;

  void _addPessoas() {
    setState(() {
      int resultPeoples = int.parse(numberPeoples);

      int resultado = resultPeoples + 1;

      numberPeoples = '$resultado';
    });
  }

  void _removePessoas() {
    setState(() {
      int resultPeoples = int.parse(numberPeoples);

      int resultado = resultPeoples - 1;

      if (resultado <= 0) {
        resultado = 0;
      }

      numberPeoples = '$resultado';
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: _title(),
      backgroundColor: Colors.pink,
      body: _body(),
    );
  }

  _title() {
    return AppBar(
      title: Text("Pessoas presentes na Loja"),
      centerTitle: true,
      backgroundColor: Colors.black,
    );
  }

  _body() {
    return Container(
      child: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            _boasVindas(),
            _campoNumero(),
            _containerButtons(),
          ],
        ),
      ),
    );
  }

  _campoNumero() {
    return Container(
      child: Text(
        numberPeoples,
        style: TextStyle(fontSize: 20),
      ),
    );
  }

  _boasVindas() {
    return Container(
      child: Text("Contador de pessoas"),
    );
  }

  _containerButtons() {
    return Container(
      child: Row(
        mainAxisAlignment: MainAxisAlignment.center,
        children: <Widget>[
          _buttonAction("Acrescentar"),
          _buttonAction("Decrementar"),
        ],
      ),
    );
  }

  _buttonAction(action) {
    if (action == "Acrescentar") {
      return RaisedButton(
        color: Colors.green[100],
        onPressed: _addPessoas,
        child: Text(
          "Acrescentar",
          style: TextStyle(
            color: Colors.green[800],
            fontSize: 16,
          ),
        ),
      );
    }

    if (action == "Decrementar") {
      return RaisedButton(
        color: Colors.red[100],
        onPressed: _removePessoas,
        child: Text(
          "decrementar",
          style: TextStyle(
            color: Colors.red[800],
            fontSize: 16,
          ),
        ),
      );
    }
  }
}
