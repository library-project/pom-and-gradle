/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.m.fxcomponent;

import com.sun.javafx.animation.TickCalculation;

import java.text.DecimalFormat;

/**
 * @author Malaka SENANAYAKE
 */
public class NumberFormatUtil {
    //------------------------------------------------------------------------------------------------------------------

    public static String toCurencyFormat(String value) {
        String nonCommaValue = "";
        String nonSpaceValue = "";
        nonCommaValue = value.replace(",", "");
        nonSpaceValue = nonCommaValue.replace(" ", "");
        double finalOutput = Double.parseDouble(nonSpaceValue);
        DecimalFormat decFor = new DecimalFormat("#,###,##0.00");
        return (decFor.format(finalOutput));
    }
    //------------------------------------------------------------------------------------------------------------------

    public static String toDecimalFormat(String value) {
        String nonCommaValue = "";
        String nonSpaceValue = "";
        nonCommaValue = value.replace(",", "");
        nonSpaceValue = nonCommaValue.replace(" ", "");
        double finalOutput = Double.parseDouble(nonSpaceValue);
        DecimalFormat decFor = new DecimalFormat("0.00");
        return (decFor.format(finalOutput));
    }
    //------------------------------------------------------------------------------------------------------------------

    public static double toDouble(String value) {
        String nonCommaValue = "";
        String nonSpaceValue = "";
        nonCommaValue = value.replace(",", "");
        nonSpaceValue = nonCommaValue.replace(" ", "");
        double val = Double.parseDouble(nonSpaceValue);
        return val;
    }
    //------------------------------------------------------------------------------------------------------------------

    public static String toDouble(double value) {
        DecimalFormat decFor = new DecimalFormat("0.00");
        return (decFor.format(value));
    }

    //------------------------------------------------------------------------------------------------------------------
    public static double toDoubleFormat(double value) {
        DecimalFormat decFor = new DecimalFormat("0.00");
        return Double.parseDouble(decFor.format(value));
    }

    //------------------------------------------------------------------------------------------------------------------
    public static String toPositiveDouble(double value) {
        DecimalFormat decFor = new DecimalFormat("0.00");
        return (decFor.format(value * -1));
    }

    //------------------------------------------------------------------------------------------------------------------
    public static double toDecimalFormat(double value) {
        DecimalFormat decFor = new DecimalFormat("0.00");
        return (Double.parseDouble(decFor.format(value)));
    }
    //------------------------------------------------------------------------------------------------------------------

    public static String toCurencyFormat(double value) {
        DecimalFormat decFor = new DecimalFormat("#,###,###.00");
        return decFor.format(value);
    }
    //------------------------------------------------------------------------------------------------------------------

    public static int toInteger(String value) {
        String nonCommaValue = "";
        String nonSpaceValue = "";
        nonCommaValue = value.replace(",", "");
        nonSpaceValue = nonCommaValue.replace(" ", "");
        int val = Integer.parseInt(nonSpaceValue);
        return val;
    }
    //------------------------------------------------------------------------------------------------------------------
}
