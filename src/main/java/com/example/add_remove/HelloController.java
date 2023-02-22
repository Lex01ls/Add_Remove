package com.example.add_remove;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label lblCounter;

    @FXML
    private Button btnIncrease;

    @FXML
    private Button btnDecrease;

    @FXML
    private Button btnReset;

    @FXML
    void handleClicks(ActionEvent event) {

        int number = Integer.parseInt(lblCounter.getText());
        //when the Button increase is clicked
        if(event.getSource()==btnIncrease){
            number++;
            lblCounter.setText(String.valueOf(number));
        }
        //when the Button decrease is clicked
        if(event.getSource()==btnDecrease){
            number--;
            lblCounter.setText(String.valueOf(number));
        }
        //when the button reset is clicked
        if(event.getSource()==btnReset){
            lblCounter.setText("0");
        }

    }
}