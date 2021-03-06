/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author reesh
 */
public class Superuser_profileController implements Initializable {

    @FXML
    private Pane createWarehouseLabel;
    @FXML
    private Pane createStoreLabel;
    @FXML
    private Pane linkWarehouseStoreLabel;
    @FXML
    private Pane createAdministratorsLabel;
    @FXML
    private Pane browseWarehouseLabel;
    @FXML
    private Pane browseStoreLabel;
    @FXML
    private Pane myProfileLabel;
    @FXML
    private Pane logoutPane;
    @FXML
    private TextField newUsernameTextField;
    @FXML
    private PasswordField currentPasswordField;
    @FXML
    private PasswordField newPasswordField;
    @FXML
    private Button submitButton;
    @FXML
    private TextField nameTextField;
    @FXML
    private Label nameField;
    @FXML
    private Label usernameField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
