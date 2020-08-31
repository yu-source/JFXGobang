package com.test.jfx;

import com.test.jfx.controller.PlayAction;
import com.test.jfx.entity.FiveChess;
import com.test.jfx.view.ChessPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author arjun
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FiveChess fiveChess = new FiveChess(20, 20, 28.0);
        ChessPane chesspane = new ChessPane(fiveChess);
        //事件源绑定处理器
        chesspane.setOnMouseClicked(new PlayAction(fiveChess, chesspane));

        Scene scene = new Scene(chesspane, 800, 700);
        primaryStage.setScene(scene);
        primaryStage.setTitle("五子棋游戏");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
