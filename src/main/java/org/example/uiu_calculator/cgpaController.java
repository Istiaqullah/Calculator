package org.example.uiu_calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class cgpaController {

    @FXML
    void installment(ActionEvent event) throws IOException {
        org.example.uiu_calculator.Main.changeScene(event,"installment.fxml","Installment calculator");
    }

@FXML
    TextField credt1;
    @FXML
    TextField credt2;
    @FXML
    TextField credt3;
    @FXML
    TextField credt4;
    @FXML
    TextField credt5;
    @FXML
    TextField credt6;
    @FXML
    TextField point1;
    @FXML
    TextField point2;
    @FXML
    TextField point3;
    @FXML
    TextField point4;
    @FXML
    TextField point5;
    @FXML
    TextField point6;
    @FXML
    CheckBox c1;
    @FXML
    CheckBox c2;
    @FXML
    CheckBox c3;
    @FXML
    CheckBox c4;
    @FXML
    CheckBox c5;
    @FXML
    CheckBox c6;
    @FXML
    Label result;
    @FXML
    void Calculate(ActionEvent event) {
        double total_credits = 0.0;
        double total_points = 0.0;
        if(!credt1.getText().trim().isEmpty() && !point1.getText().trim().isEmpty()&& c1.isSelected()){
            double c1=Double.parseDouble(credt1.getText());
            double p1=Double.parseDouble(point1.getText());
            total_credits+=c1;
            total_points+=c1*p1;
        }
        if(!credt2.getText().trim().isEmpty() && !point2.getText().trim().isEmpty()&& c2.isSelected()){
            double c2=Double.parseDouble(credt2.getText());
            double p2=Double.parseDouble(point2.getText());
            total_credits+=c2;
            total_points+=c2*p2;
        }
        if(!credt3.getText().trim().isEmpty() && !point3.getText().trim().isEmpty()&& c3.isSelected()) {
            double c3 = Double.parseDouble(credt3.getText());
            double p3 = Double.parseDouble(point3.getText());
            total_credits += c3;
            total_points += c3 * p3;
        }
        if(!credt4.getText().trim().isEmpty() && !point4.getText().trim().isEmpty()&& c4.isSelected()) {
            double c4 = Double.parseDouble(credt4.getText());
            double p4 = Double.parseDouble(point4.getText());
            total_credits += c4;
            total_points += c4 * p4;
        }
        if(!credt5.getText().trim().isEmpty() && !point5.getText().trim().isEmpty()&& c5.isSelected()) {
            double c5 = Double.parseDouble(credt5.getText());
            double p5 = Double.parseDouble(point5.getText());
            total_credits += c5;
            total_points += c5 * p5;    }
        if(!credt6.getText().trim().isEmpty() && !point6.getText().trim().isEmpty()&& c6.isSelected()) {
            double c6 = Double.parseDouble(credt6.getText());
            double p6 = Double.parseDouble(point6.getText());
            total_credits += c6;
            total_points += c6 * p6;    }
        if(total_credits==0){
            result.setText("Please enter at least one course");
        }else{
            double cgpa=total_points/total_credits;
            result.setText(String.format("Your CGPA is: %.2f",cgpa));   }





}}
