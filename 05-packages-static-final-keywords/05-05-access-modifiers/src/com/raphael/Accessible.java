package com.raphael;

// Desafio:
// Sobre a interface abaixo, responda sobre a visibilidade dos métodos e atributos:

// 1. interface Accessible - Resposta: apenas no pacote com.raphael
// 2. SOME_CONSTANT - Resposta: public
// 3. methodA - Resposta: public
// 4. methodB - Resposta: public
// 5. methodC - Resposta: public

public interface Accessible {
  int SOME_CONSTANT = 100;
  public void methodA();
  void methodB();
  boolean methodC();
}
