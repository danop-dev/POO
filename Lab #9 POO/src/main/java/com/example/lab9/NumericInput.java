package com.example.lab9;


import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;


public class NumericInput {
    Label inputLabel;
    TextField textField;
    VBox inputContainer;
    Boolean hasError;
    String value;

    public NumericInput(String inputLabel) {
        this.inputLabel = new Label(inputLabel);
        textField = new TextField();
        addValidationListener();
    }

    VBox initInput() {
        inputContainer = new VBox(10, inputLabel, textField);

        return inputContainer;
    }

    void addValidationListener() {
        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            Label inputError;
            value = newValue;

            try {
                if (inputLabel.getText().equals("Divisor") && Double.parseDouble(newValue) == 13) {
                    throw new UnluckyException();
                }

                Double.parseDouble(newValue);

                if (newValue.contains(" ") || newValue.contains("d") || newValue.contains("f")) {
                    throw new NumberFormatException();
                }

                hasError = false;

                if (inputContainer.getChildren().size() == 3) {
                    inputContainer.getChildren().remove(2);
                }
            } catch (NumberFormatException exception) {
                if (inputContainer.getChildren().size() == 3) {
                    return;
                }

                hasError = true;

                inputError = new Label("Input accepts only numbers!");

                inputContainer.getChildren().add(inputError);
            } catch (UnluckyException exception) {
                if (inputContainer.getChildren().size() == 3) {
                    return;
                }

                hasError = true;

                inputError = new Label("Unlucky Exception!");

                inputContainer.getChildren().add(inputError);
            }
        });
    }
}
