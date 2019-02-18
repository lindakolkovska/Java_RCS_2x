package com.company;

import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Alert {
    public static void display(String title, String message){
        //2.logs, kas parādītos ar paziņojumu, ja 1) izbeidzies minējumu skaits, 2) atminēts vārds;

        Stage window = new Stage();

        //pie 2.loga atvēršanās, neļauj neko darīt citos logos, kamēr nav aizvērts
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label();
        label.setText(message);
        Button closeButton = new Button("Aizvērt");
        //f-ja, kas dod komandu aizvērt logu pie nospiešanas
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }

}

