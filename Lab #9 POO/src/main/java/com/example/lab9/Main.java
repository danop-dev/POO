package com.example.lab9;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        NumericInput dividendTextField = new NumericInput("Dividend");
        NumericInput divisorTextField = new NumericInput("Divisor");

        Button button = new Button("Do division");

        VBox appContainer = new VBox(20, dividendTextField.initInput(), divisorTextField.initInput(), button);
        appContainer.setPadding(new Insets(20));

        button.setOnMouseClicked(event -> {
            try {
                if (appContainer.getChildren().size() == 4) {

                    appContainer.getChildren().remove(3);
                }

                if (dividendTextField.hasError || divisorTextField.hasError) {
                    appContainer.getChildren().add(new Label("Fix errors before submitting"));
                    return;
                }

                if (Double.parseDouble(divisorTextField.value) == 0) {
                    appContainer.getChildren().add(new Label("Division by 0 is not allowed"));

                    return;
                }


                String result = String.valueOf(Double.parseDouble(dividendTextField.value) / Double.parseDouble(divisorTextField.value));
                appContainer.getChildren().add(new Text(result));
            } catch (NullPointerException exception) {
                appContainer.getChildren().add(new Label("One or both fields are empty!"));
            }
        });

        Scene scene = new Scene(new StackPane(appContainer), 250, 350);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}