package com.company;

import com.sun.deploy.association.utility.AppAssociationReaderFactory;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

import java.awt.*;

public class Main extends Application {

    // mainīgie
    //pārsaucu Stage par window uzskatāmībai
    Stage window;
    TextField letterField;
    String[] word = new String[]{"k", "a", "r", "ā", "t", "a","v", "a", "s"};
    String[] guess = new String[]{"_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ", "_ ","_ "};

    public static void main(String[] args) {
        //šo es saprotu tikai tik daudz, ka šitā ir jābūt :D
	    launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // mainīgais window ir primaryStage
        window = primaryStage;
        //loga nosaukums
        window.setTitle("Karātavas");

        //nodefinēju izvietojuma veidu
        GridPane grid = new GridPane();
        //vertikālās atstarpes
        grid.setVgap(8);
        //horizontālās atsarpes
        grid.setHgap(10);
        //izvietojuma pozīcija
        grid.setAlignment(Pos.CENTER);

        //doma ir katru vārda burtu ievietot kā jaunu label, tam piešķirt vērtību no masīva
        Label label2 = new Label(guess[0]);
        Label label3 = new Label(guess[1]);
        Label label4 = new Label(guess[2]);
        Label label5 = new Label(guess[3]);
        Label label6 = new Label(guess[4]);
        Label label7 = new Label(guess[5]);
        Label label8 = new Label(guess[6]);
        Label label9 = new Label(guess[7]);
        Label label10 = new Label(guess[8]);

        //label'u atrašānās pozīcijas
        grid.add(label2, 0,1, 1, 1);
        grid.add(label3, 1,1, 1, 1);
        grid.add(label4, 2,1, 1, 1);
        grid.add(label5, 3,1, 1, 1);
        grid.add(label6, 4,1, 1, 1);
        grid.add(label7, 5,1, 1, 1);
        grid.add(label8, 6,1, 1, 1);
        grid.add(label9, 7,1, 1, 1);
        grid.add(label10, 8,1, 1, 1);

        //ievades lauks, kur ieraksta burtu
        letterField = new TextField();
        grid.add(letterField, 0,2, 9, 1);

        //poga, kas apstiprina ievadi
        Button button = new Button("Pārbaudīt, vai ir šāds burts");
        grid.add(button, 0,3, 9, 1);
        //apstājos pie funkcionalitātes
        /*button.setOnAction(e -> );*/

        //nodefinēju scene, norādu, kas būs tur iekšā, arī parametrus
        Scene scene = new Scene(grid, 500, 400 );
        //norādu, ka loga scene būs iepriekš nodefinētā scene
        window.setScene(scene);
        //komanda, lai parādītu logu
        window.show();
    }

}
