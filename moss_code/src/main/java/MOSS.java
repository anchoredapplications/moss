import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;




public class MOSS
  extends Application
{
  public void start(Stage stage) throws Exception {
    FXMLLoader loader = new FXMLLoader(ControllerQuickMenu.class.getResource("QuickMenu.fxml"));
    AnchorPane page = (AnchorPane)loader.load();
    Scene scene = new Scene((Parent)page);
    stage.initStyle(StageStyle.UNDECORATED);
    stage.setScene(scene);
    stage.getIcons().add(new Image(ControllerQuickMenu.class.getResourceAsStream("moss.png")));
    page.setStyle("-fx-border-color: black; -fx-border-width: 3px 3px 3px 3px; ");

    File imageFile = new File("/usr/bin/moss_app/bin/OS_Ubuntu.png");
    Image image = new Image(imageFile.toURI().toString());
    Button btn = (Button) scene.lookup("#button1");
    ImageView imv = new ImageView(image);
    imv.setFitHeight(50);
    imv.setFitWidth(50);
    btn.setGraphic(imv);
    File imageFile2 = new File("/usr/bin/moss_app/bin/OS_Windows.png");
    Image image2 = new Image(imageFile2.toURI().toString());
    Button btn2 = (Button) scene.lookup("#button2");
    ImageView imv2 = new ImageView(image2);
    imv2.setFitHeight(50);
    imv2.setFitWidth(50);
    btn2.setGraphic(imv2);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
