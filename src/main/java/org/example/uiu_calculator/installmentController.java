package org.example.uiu_calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class installmentController implements Initializable {
    @FXML
    private TextField credt;
    @FXML
    private TextField cost;
    @FXML
    private ChoiceBox<String> waiver;
    private final String[] waivers = {"0%", "25%", "50%", "100%"};

    @FXML
    private Label first;
    @FXML
    private Label second;
    @FXML
    private Label third;
    @FXML
    Label result;
   @FXML
   CheckBox gym;
   @FXML
   CheckBox transport;


    @FXML
    void Calculate(ActionEvent event) {

        if(cost.getText().trim().isEmpty() || credt.getText().trim().isEmpty() || waiver.getValue() == null){

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill all the fields");
            alert.show();

        }else{

            double c = Double.parseDouble(cost.getText());
            double cr = Double.parseDouble(credt.getText());
            String w = waiver.getValue();
            double wv = 1.0;
            if (w.equals("0%"))
                wv = 1.0;
             else if (w.equals("25%"))
                wv = 0.75;
             else if (w.equals("50%"))
                wv = 0.5;
             else if (w.equals("100%"))
                wv = 0.0;
       double Gym=0.0;
       double Transport=0.0;
      if(transport.isSelected())
           Transport=4000.0;
      if(gym.isSelected())
           Gym=1500.0;

            double total = c * cr * wv + 6500+Gym;
            double t = c * cr * wv + 6500+Gym+Transport;
            double first_installment = total * 0.4;
            double second_installment = total * 0.3;
            double third_installment = total * 0.3;
            result.setText(String.format("Total amount to be paid : %.2f", t));
            first.setText(String.format("First installment      :%.2f", first_installment+Transport));
            second.setText(String.format("Second installment :%.2f", second_installment));
            third.setText(String.format("Third installment     :%.2f", third_installment));

        }
    }
@FXML
void cgpa(ActionEvent event) throws Exception{
    org.example.uiu_calculator.Main.changeScene(event,"cgpa.fxml","CGPA calculator");

}
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        waiver.getItems().addAll(waivers);
    }
}
