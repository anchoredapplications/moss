import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class ControllerQuickMenu
{
  private String pathToChecks = "/home/" + System.getProperty("user.name") + "/moss_app/bin/check.txt";
  private String pathToBootNums = "/home/" + System.getProperty("user.name") + "/moss_app/bin/bootNums.txt";
  private String pathToPaths = "/home/" + System.getProperty("user.name") + "/moss_app/bin/paths.txt";

  @FXML
  private Button btnOS1;

  @FXML
  private Button btnOS2;

  @FXML
  private Button btnPower;

  @FXML
  private Button btnSettings;
  @FXML
  private Button btnExit;

  @FXML
  void bootOS1(ActionEvent event) {
    loadAllDrives();
    bootThis(loadBootOrder().get(0));

    Stage stage = (Stage)this.btnExit.getScene().getWindow();
    stage.close();
  }

  @FXML
  void bootOS2(ActionEvent event) {
    loadAllDrives();
    bootThis(loadBootOrder().get(1));

    Stage stage = (Stage)this.btnExit.getScene().getWindow();
    stage.close();
  }

  @FXML
  void doExit(ActionEvent event) {
    Stage stage = (Stage)this.btnExit.getScene().getWindow();
    stage.close();
  }

  @FXML
  void doSettings(ActionEvent event) {
    try {
      Stage primaryStage = new Stage();
      FXMLLoader loader = new FXMLLoader(ControllerEditMenu.class.getResource("EditMenu.fxml"));
      AnchorPane page = (AnchorPane)loader.load();
      Scene scene = new Scene((Parent)page);
      primaryStage.setScene(scene);
      primaryStage.getIcons().add(new Image(ControllerEditMenu.class.getResourceAsStream("moss.png")));
      primaryStage.show();
    } catch (IOException e) {
e.printStackTrace();
    }
  }

  @FXML
  void shutDown(ActionEvent event) {
    writeThis(this.pathToChecks, 5, "powerOff");

    Stage stage = (Stage)this.btnExit.getScene().getWindow();
    stage.close();
  }

  void bootThis(String bootNum) {
    writeThis(this.pathToChecks, 2, "yes1");
    writeThis(this.pathToChecks, 3, bootNum);
    writeThis(this.pathToChecks, 4, "rebootYes");
  }


  void loadAllDrives() {
    writeThis(this.pathToChecks, 6, "loadDrivesYes");
  }


  private ArrayList<String> loadBootOrder() {
    try {
      Scanner scanner = new Scanner(new File(this.pathToBootNums));
      int count = 1;
      ArrayList<String> bootOrder = new ArrayList<>();
      ArrayList<String> file = new ArrayList<>();
while (scanner.hasNextLine()) {
        count++;
        String text = scanner.nextLine();
        file.add(text);
        if (count == 4) {
          String order = text.substring(11);
          for (int i = 0; i < order.length() - 5; i += 5) {
            bootOrder.add(order.substring(i, i + 4));
          }
          bootOrder.add(order.substring(order.length() - 4));
        }
      }
      System.out.println(bootOrder.toString());
      scanner.close();
      return bootOrder;
    }
    catch (FileNotFoundException e) {
e.printStackTrace();
return null;
    }
  }
  void writeThis(String filePath, int line, String message) {
    ArrayList<String> file = new ArrayList<>();

    try {
      Scanner scanner = new Scanner(new File(filePath));
      while (scanner.hasNextLine()) {
        file.add(scanner.nextLine());
      }
      scanner.close();
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    file.set(line, message);

    try {
      FileWriter writer = new FileWriter(filePath);
      for (String string : file) {
        writer.append(string);
        writer.append("\n");
      }
      writer.close();
    }
    catch (IOException e) {
e.printStackTrace();
    }
  }
}
