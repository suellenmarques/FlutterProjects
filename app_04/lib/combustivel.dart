import 'package:flutter/material.dart';

class Combustivel extends StatefulWidget {
  const Combustivel({Key? key}) : super(key: key);

  @override
  _CombustivelState createState() => _CombustivelState();
}

class _CombustivelState extends State<Combustivel> {
  TextEditingController alcool = TextEditingController();
  TextEditingController gasolina = TextEditingController();
  String result = "Resultado";

  void _alcoolGasolina() {
    setState(() {
      double valueAlcool = double.parse(alcool.text);
      double valueGasolina = double.parse(gasolina.text);

      double divisaoLitro = valueAlcool / valueGasolina;

      if (divisaoLitro <= 0.7) {
        result = "Opte pelo alcool";
      } else {
        result = "Opte pela gasolina";
      }
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: _titulo(),
      body: _corpo(),
    );
  }

  _titulo() {
    return AppBar(
      title: Text("Alcool ou Gasolina"),
      centerTitle: true,
      backgroundColor: Colors.green[200],
    );
  }

  _corpo() {
    return SingleChildScrollView(
      padding: EdgeInsets.fromLTRB(10.0, 0, 10.0, 0.0),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.stretch,
        children: <Widget>[
          _foto(),
          _campo("Preço do litro do Alcool", alcool),
          _campo("Preço do litro da Gasolina", gasolina),
          _botao(),
          _texto(result),
        ],
      ),
    );
  }

  _campo(labelTitulo, objController) {
    return TextField(
      keyboardType: TextInputType.number,
      decoration: InputDecoration(
          labelText: labelTitulo, labelStyle: TextStyle(color: Colors.green)),
      textAlign: TextAlign.left,
      style: TextStyle(color: Colors.green, fontSize: 18.0),
      controller: objController,
    );
  }

  _botao() {
    return Padding(
        padding: EdgeInsets.only(top: 20.0, bottom: 20.0),
        child: Container(
            height: 50.0,
            child: RaisedButton(
              onPressed: _alcoolGasolina,
              child: Text("Comparar",
                  style: TextStyle(color: Colors.white, fontSize: 22.0)),
              color: Colors.green[200],
            )));
  }

  _texto(textoParaExibir) {
    return Text(textoParaExibir,
        textAlign: TextAlign.center,
        style: TextStyle(color: Colors.green, fontSize: 25.0));
  }

  _foto() {
    return Center(
        child: Image.network(
            "https://cdn-icons-png.flaticon.com/512/784/784867.png"));
  }
}