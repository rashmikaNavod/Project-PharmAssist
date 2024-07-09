package lk.Ijse.pharmAssist;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
    Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/View/dashBoard.fxml")));
    stage.setScene(scene);
    stage.setResizable(false);
   // Image applicationIcon = new Image(getClass().getResourceAsStream("/Img/PharmAssist.png"));
   // stage.getIcons().add(applicationIcon);
    stage.centerOnScreen();
    stage.show();
    }
}
