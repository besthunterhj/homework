/*
Author: 王俊朗
Class: 软件工程1803
ID: 20181003043
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.geometry.Insets;
import javafx.stage.*;
import javafx.scene.image.*;

public class Exercise14_2  extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(5, 15, 5, 15));
        pane.setHgap(10);
        pane.setVgap(10);

        Image O = new Image("file:image/o.gif");
        Image X = new Image("file:image/x.gif");

        ImageView imageView1 = new ImageView(O);
        ImageView imageView2 = new ImageView(X);


        for (int i = 0; i < 3; i++)     //这里的循环理论上没有问题，但找不到什么问题导致IDE一直报错
        {
            for (int j = 0; j < 3; j++)
            {
                int temp = (int)(Math.random() * 3);
                if (temp == 0)
                {
                    pane.add(new ImageView(X), j, i);
                }
                else if (temp == 1)
                {
                    pane.add(new ImageView(O), j, i);
                }
                else
                {
                    continue;
                }
            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise14_2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
