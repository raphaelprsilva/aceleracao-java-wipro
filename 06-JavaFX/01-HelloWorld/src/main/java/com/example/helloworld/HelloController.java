package com.example.helloworld;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
  @FXML
  private Label welcomeText;

  @FXML
  protected void onHelloButtonClick() {
    welcomeText.setText("Bem-vindo(a) à sua primeira aplicação javaFX.");
  }
}