package org.m.fxcomponent;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

/**
 *
 * @author malaka senanayake @ Creative IT
 */
public class TextFieldUtil {

    private static final String DEFAULT_STYLE = "-border-colour:-border-colour;-text-colour :-text-colou;"; // normal colour
    private static final String ERROR_STYLE = "-border-colour:-error-border-colour;-text-colour :-error-text-colour;"; // error colour

    //------------------------------------------------------------------------------------------------------------------
    public static void setEmpty(TextField ar[]) {
        for (int i = 0; i < ar.length; i++) {
            ar[i].clear();
            ar[i].setStyle(DEFAULT_STYLE);
        }
    }
//******************************************************************************

    public static void setEmpty(TextField ar[], boolean isSaved) {
        if (isSaved) {
            for (int i = 0; i < ar.length; i++) {
                ar[i].clear();
                ar[i].setStyle(DEFAULT_STYLE);
            }
        }
    }
//******************************************************************************

    public static boolean isNotEmpty(TextField ar[]) {
        boolean b = true;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i].getText().isEmpty()) {
                toError(ar[i]);
                AlertsUtil.waningMessage("You cannot save data with empty fields , please fill data and retry");
                toDefault(ar[i]);
                ar[i].requestFocus();
                i = ar.length;
                b = false;
            }
        }
        return b;
    }
//******************************************************************************

    public static boolean isNotEmpty(TextField textField) {
        boolean b = true;
        if (textField.getText().isEmpty()) {
            toError(textField);
            AlertsUtil.waningMessage("You cannot save data with empty fields , please fill data and retry");
            toDefault(textField);
            textField.requestFocus();
            b = false;
        }
        return b;
    }
//******************************************************************************

    public static boolean isPhoneNumbersValid(TextField ar[]) {
        boolean b = true;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i].getText().length() < 10) {
                ar[i].setStyle(ERROR_STYLE);
                AlertsUtil.waningMessage(" you entered phone number hasnot 10 numbers, please enter valid phone number");
                ar[i].requestFocus();
                i = ar.length;
                b = false;
            }
        }
        return b;
    }

//******************************************************************************
    public static boolean isPhoneNumberValid(TextField textField) {
        boolean b = true;
        if (textField.getText().length() < 10) {
            AlertsUtil.waningMessage(" Phone number is not valid , please valid phone number ");
            toError(textField);
            textField.requestFocus();
            b = false;
        }
        return b;
    }
//******************************************************************************

    public static void checkPhoneNumber(TextField textField) {
        if (textField.getText().length() < 10) {
            AlertsUtil.waningMessage(" Phone number is not valid , please valid phone number ");
            toError(textField);
            textField.clear();
            textField.requestFocus();
        }
    }
//******************************************************************************

    public static void checkPhoneNumbers(TextField ar[]) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i].getText().length() < 10) {
                toError(ar[i]);
                AlertsUtil.waningMessage(" Phone number is not valid , please valid phone number ");
                ar[i].clear();
                ar[i].requestFocus();
                i = ar.length;
            }
        }
    }
//******************************************************************************

    public static boolean isLargeValue(TextField checkValueTextField) {
        boolean b = true;
        if (checkValueTextField.getStyle().equals(ERROR_STYLE)) {
            b = false;
            AlertsUtil.waningMessage(" You enterd value is lager than excist value , please enter small value or equal value & try again");
            checkValueTextField.clear();
            checkValueTextField.requestFocus();
        }
        return b;
    }
//******************************************************************************

    public static boolean isSmallValue(TextField checkValueTextField) {
        boolean b = true;
        if (checkValueTextField.getStyle().equals(ERROR_STYLE)) {
            b = false;
            AlertsUtil.waningMessage(" You enterd value is smaller than excist value , please enter large value & & try again");
            checkValueTextField.clear();
            checkValueTextField.requestFocus();
        }
        return b;
    }
//******************************************************************************

    public static void toError(TextField textField) {
        textField.setStyle(ERROR_STYLE);
    }
//******************************************************************************

    public static void toDefault(TextField textField) {
        textField.setStyle(DEFAULT_STYLE);
    }
//******************************************************************************

    public static void setEditable(TextField ar[]) {
        for (int i = 0; i < ar.length; i++) {
            if ((ar[i].getText().equals("0")) | (ar[i].getText().equals("0.0")) | (ar[i].getText().equals("0.00"))) {
                ar[i].setEditable(true);
            } else {
                ar[i].setEditable(false);
            }
        }
    }
//******************************************************************************

    public static void setFocus(final TextField textField) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                textField.requestFocus();
                System.gc();
            }
        });
    }
//******************************************************************************

    public static void setNormal(TextField ar[]) {
        for (int i = 0; i < ar.length; i++) {
            ar[i].setStyle(DEFAULT_STYLE);
        }
    }
//******************************************************************************

    public static void setFocusToNext(TextField currentTextField, TextField nextTextField) {
        if (currentTextField.getText().length() == 0) {
            setFocus(currentTextField);
        } else {
            setFocus(nextTextField);
        }
    }
//******************************************************************************

    public static void copyValue(TextField valueTextField, TextField copyTextField) {
        if (valueTextField.getText().length() != 0) {
            copyTextField.clear();
            copyTextField.setText(valueTextField.getText());
        }
    }
//******************************************************************************

    public static boolean isNotAvalable(TextField textField, boolean avalability) {
        if (avalability == true) {
            toError(textField);
            AlertsUtil.waningMessage("" + textField.getText() + "  already excist in system , please enter another value");
            textField.clear();
            textField.setDisable(false);
            setFocus(textField);
            toDefault(textField);
            return false;
        } else {
            toDefault(textField);
            return true;
        }
    }
//******************************************************************************

    public static void toOnlyPhoneNumber(final TextField textField) {
        textField.setOnKeyTyped(new EventHandler<javafx.scene.input.KeyEvent>() {
            @Override
            public void handle(javafx.scene.input.KeyEvent evt) {
                TextFieldUtil.toDefault(textField);
                if (evt.getCharacter().matches("[0-9]")) {
                    if (textField.getText().length() == 10) {
                        evt.consume();
                    } else {

                    }
                } else {
                    evt.consume();
                }
            }
        });
    }
//******************************************************************************

    public static void toOnlyIntPositive(final TextField textField) {
        textField.setOnKeyTyped(new EventHandler<javafx.scene.input.KeyEvent>() {
            @Override
            public void handle(javafx.scene.input.KeyEvent evt) {
                if (evt.getCharacter().matches("[0-9]")) {
                    if (textField.getText().length() == 0) {
                        if (evt.getCharacter().matches("0")) {
                            evt.consume();
                        }
                    }

                } else {
                    evt.consume();
                }
            }
        });
    }
//******************************************************************************

    public static void toOnlyInt(TextField textField) {
        textField.setOnKeyTyped(new EventHandler<javafx.scene.input.KeyEvent>() {
            @Override
            public void handle(javafx.scene.input.KeyEvent evt) {
                if (evt.getCharacter().matches("[0-9]")) {

                } else {
                    evt.consume();
                }
            }
        });
    }
//******************************************************************************

    public static void toOnlyDecimalPositive(final TextField textField) {
        textField.setOnKeyTyped(new EventHandler<javafx.scene.input.KeyEvent>() {
            @Override
            public void handle(javafx.scene.input.KeyEvent evt) {
                if (evt.getCharacter().matches("[0-9.]")) {
                    if (textField.getText().length() == 0) {
                        if (evt.getCharacter().matches("0")) {
                            evt.consume();
                        }
                    }
                    if (evt.getCharacter().matches("[.]")) {
                        int i = textField.getText().indexOf('.');
                        if (i != -1) {
                            evt.consume();
                        } else if (textField.getText().isEmpty()) {
                            evt.consume();
                        }
                    }

                } else {
                    evt.consume();
                }
            }
        });
    }
//******************************************************************************

    public static void toOnlyDecimal(final TextField textField) {
        textField.setOnKeyTyped(new EventHandler<javafx.scene.input.KeyEvent>() {
            @Override
            public void handle(javafx.scene.input.KeyEvent evt) {
                if (evt.getCharacter().matches("[0-9.]")) {
                    if (evt.getCharacter().matches("[.]")) {
                        int i = textField.getText().indexOf('.');
                        if (i != -1) {
                            evt.consume();
                        } else if (textField.getText().isEmpty()) {
                            evt.consume();
                        }
                    }

                } else {
                    evt.consume();
                }
            }
        });
    }
//******************************************************************************

    public static void toOnlyCapitalLetters(TextField textField) {
        textField.setOnKeyTyped(new EventHandler<javafx.scene.input.KeyEvent>() {
            @Override
            public void handle(javafx.scene.input.KeyEvent evt) {
                if (evt.getCharacter().matches("[A-Z ]")) {

                } else {
                    evt.consume();
                }
            }
        });
    }
//******************************************************************************

    public static void toOnlySimpleLetters(TextField textField) {
        textField.setOnKeyTyped(new EventHandler<javafx.scene.input.KeyEvent>() {
            @Override
            public void handle(javafx.scene.input.KeyEvent evt) {
                if (evt.getCharacter().matches("[a-z ]")) {

                } else {
                    evt.consume();
                }
            }
        });
    }
//******************************************************************************

    public static void toValidate(final TextField textField) {
        textField.setOnKeyTyped(new EventHandler<javafx.scene.input.KeyEvent>() {
            @Override
            public void handle(javafx.scene.input.KeyEvent evt) {
                TextFieldUtil.toDefault(textField);
                if (evt.getCharacter().matches("[0-9.A-Za-z@ #$%&?/,\\+-]")) {

                } else {
                    evt.consume();
                }
            }
        });
    }
//******************************************************************************

    public static void toNonSpace(final TextField textField) {
        textField.setOnKeyTyped(new EventHandler<javafx.scene.input.KeyEvent>() {
            @Override
            public void handle(javafx.scene.input.KeyEvent evt) {
                TextFieldUtil.toDefault(textField);
                if (evt.getCharacter().matches("[0-9.A-Za-z@#$%&?/,+-]")) {

                } else {
                    evt.consume();
                }
            }
        });
    }
//******************************************************************************

    public static boolean isLargeValueInKeyRelease(TextField textField, double value) {
        boolean b = true;
        TextFieldUtil.toDefault(textField);
        if ((!textField.getText().isEmpty())) {
            double enterValue = NumberFormatUtil.toDouble(textField.getText());
            if (value < enterValue) {
                TextFieldUtil.toError(textField);
                b = false;
                AlertsUtil.waningMessage(" You enterd value is lager than  " + NumberFormatUtil.toDouble(value) + "  value , please enter small value or equal value & try again");
                textField.clear();
                textField.requestFocus();
            }
        } else {
            textField.clear();
            TextFieldUtil.toError(textField);
            b = false;
        }
        return b;
    }
//******************************************************************************

    public static boolean isSmallValueInKeyRelease(TextField textField, double value) {
        boolean b = true;
        TextFieldUtil.toDefault(textField);
        if ((!textField.getText().isEmpty())) {
            double enterValue = NumberFormatUtil.toDouble(textField.getText());
            if (value >= enterValue) {
                TextFieldUtil.toError(textField);
                b = false;
            }
        } else {
            textField.clear();
            TextFieldUtil.toError(textField);
            b = false;
        }
        return b;
    }
//******************************************************************************

    public static void calculateGoldPrizeInKeyRelease(TextField itemWaightTF, TextField poundValueTF, TextField goldPrizeTF) {
        toDefault(itemWaightTF);
        toDefault(poundValueTF);
        toDefault(goldPrizeTF);
        if ((!itemWaightTF.getText().isEmpty()) && (!poundValueTF.getText().isEmpty())) {
            double unitPoundValue = Double.parseDouble(poundValueTF.getText()) / 8;
            double goldValue = Double.parseDouble(itemWaightTF.getText()) * unitPoundValue;
            goldPrizeTF.setText(NumberFormatUtil.toDecimalFormat(goldValue + ""));
        }
        if (poundValueTF.getText().isEmpty()) {
            goldPrizeTF.clear();
            toError(poundValueTF);
        }
        if (itemWaightTF.getText().isEmpty()) {
            toError(itemWaightTF);
        }
    }
//******************************************************************************

    public static String calculateDeferenceInKeyRelease(TextField textField, double value) {
        double deference = 0;
        if ((!textField.getText().isEmpty()) && (value != 0)) {
            double enterValue = NumberFormatUtil.toDouble(textField.getText());
            deference = enterValue - value;
        } else {
            textField.setText("0.0");
        }
        return ("" + deference);
    }
//******************************************************************************

    public static String calculateSumInKeyRelease(TextField fristValueTF, TextField secondValueTF) {
        double addtion = 0;
        if ((!fristValueTF.getText().isEmpty()) && (!secondValueTF.getText().isEmpty())) {
            addtion = (NumberFormatUtil.toDouble(fristValueTF.getText())) + (NumberFormatUtil.toDouble(secondValueTF.getText()));
        } else {

        }
        return ("" + addtion);
    }
//******************************************************************************

    public static void typeSameInKeyRelease(TextField textField1, TextField textField2) {
        if (!textField1.getText().isEmpty()) {
            textField2.clear();
            textField2.setText(textField1.getText());
        } else {
            textField2.clear();
        }
    }
//******************************************************************************

    public static void isAvalabilityInKeyRelease(TextField textField, boolean avalability) {
        if (avalability == true) {
            toError(textField);
        } else {
            toDefault(textField);
        }
    }
//******************************************************************************

}
