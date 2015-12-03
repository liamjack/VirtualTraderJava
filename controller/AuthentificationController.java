/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author cuonic
 */
public class AuthentificationController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private ChoiceBox<String> sexChoiceBox;
    
    @FXML
    private ChoiceBox<String> countryChoiceBox;
    
    @FXML
    private void handleLoginButtonAction(ActionEvent event) throws IOException {
        // Parent root = FXMLLoader.load(getClass().getResource("/view/MainWindow.fxml"));
        
        System.err.println("Login button click");
        
        //Scene scene = new Scene(root);
        
        //stage.setScene(scene);
        //stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        sexChoiceBox.getItems().add("Masculin");
        sexChoiceBox.getItems().add("Feminin");
        sexChoiceBox.getItems().add("Neutre");
        
        countryChoiceBox.getItems().add("France");
        countryChoiceBox.getItems().add("Pakistan");
        countryChoiceBox.getItems().add("Syrie");
        countryChoiceBox.getItems().add("Russie");
        countryChoiceBox.getItems().add("U.S.A");
        countryChoiceBox.getItems().add("Grande Bretagne");
        countryChoiceBox.getItems().add("Afrique du Sud");
        countryChoiceBox.getItems().add("Chine");
        countryChoiceBox.getItems().add("Philippines");
        countryChoiceBox.getItems().add("Thailande");
        countryChoiceBox.getItems().add("Zimbabwe");
        countryChoiceBox.getItems().add("Nigeria");
        countryChoiceBox.getItems().add("Corée du Sud");
        countryChoiceBox.getItems().add("Canada");
        countryChoiceBox.getItems().add("Brésil");
        countryChoiceBox.getItems().add("Venezuela");
        countryChoiceBox.getItems().add("Espagne");
        countryChoiceBox.getItems().add("Suisse");
        countryChoiceBox.getItems().add("Allemagne");
        countryChoiceBox.getItems().add("Belgique");
        countryChoiceBox.getItems().add("Italie");
        countryChoiceBox.getItems().add("Suède");
        countryChoiceBox.getItems().add("Norvège");
        countryChoiceBox.getItems().add("Finlande");
        countryChoiceBox.getItems().add("Egypte");
        countryChoiceBox.getItems().add("Danemark");
        countryChoiceBox.getItems().add("Algérie");
        countryChoiceBox.getItems().add("Maroc");
        countryChoiceBox.getItems().add("Tunisie");
        countryChoiceBox.getItems().add("Turquie");
        countryChoiceBox.getItems().add("Ukraine");
        countryChoiceBox.getItems().add("Lithuanie");
        countryChoiceBox.getItems().add("Estonie");
        countryChoiceBox.getItems().add("Republique Tcheque");
        countryChoiceBox.getItems().add("Pays Bas");
        countryChoiceBox.getItems().add("Vietnam");
        countryChoiceBox.getItems().add("Birmanie");
        countryChoiceBox.getItems().add("Australie");
        countryChoiceBox.getItems().add("Nouvelle Zélande");
        countryChoiceBox.getItems().add("Luxembourg");
        countryChoiceBox.getItems().add("Mexique");
        countryChoiceBox.getItems().add("Argentine");
        countryChoiceBox.getItems().add("Cuba");
        countryChoiceBox.getItems().add("Corée du Nord");
        countryChoiceBox.getItems().add("Inde");
        countryChoiceBox.getItems().add("Lettonie");
        countryChoiceBox.getItems().add("Republique Democratique du Congo");
        countryChoiceBox.getItems().add("Côte d'Ivoire");
        countryChoiceBox.getItems().add("Mali");
        countryChoiceBox.getItems().add("Péru");
        countryChoiceBox.getItems().add("Colombie");
        countryChoiceBox.getItems().add("Paraguay");
        countryChoiceBox.getItems().add("Japon");
        Collections.sort(countryChoiceBox.getItems());
    }    
    
}
