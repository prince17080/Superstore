package controller;

import client.Client;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class StoreAdminController extends Controller{
        @FXML
        private TextField productNameTextField;

        @FXML
        private TextField priceTextField;

        @FXML
        private TextField fixedCostTextField;

        @FXML
        private TextField carryingCostTextField;

        @FXML
        private TextField demandedUnitsTextField;

        @FXML
        private ComboBox loginComboBox;

        @Override
        public void initialize(URL location, ResourceBundle resources) {

        }


//    public void display(MouseEvent event){
//        label.setText("Browse store!");
//    }

}
