

import java.io.File;
 import java.io.FileNotFoundException;
 import java.io.FileWriter;
 import java.io.IOException;
 import java.util.ArrayList;
 import java.util.Scanner;
 import javafx.event.ActionEvent;
 import javafx.fxml.FXML;
 import javafx.scene.control.Button;
 import javafx.scene.control.ComboBox;
 import javafx.scene.control.TableColumn;
 import javafx.scene.control.TableView;
 import javafx.scene.control.TextField;
 import javafx.scene.control.cell.PropertyValueFactory;
 import javafx.scene.input.MouseEvent;
 import javafx.stage.Stage;
 import javafx.util.Callback;


 public class ControllerEditMenu {
      private String pathToChecks = "/home/" + System.getProperty("user.name") + "/moss_app/bin/check.txt";
      private String pathToBootNums = "/home/" + System.getProperty("user.name") + "/moss_app/bin/bootNums.txt";
      private String pathToPaths = "/home/" + System.getProperty("user.name") + "/moss_app/bin/paths.txt";
    @FXML
     private TextField txtOS1;
    @FXML
     private Button btnSetOS1;
    @FXML
     private Button btnResetOS1;
    @FXML
     private TextField txtPath;
    @FXML
     private Button btnBoot;
    @FXML
     private TableView<OS> tableBoot;
    @FXML
     private Button btnLoad;
    @FXML
     private ComboBox<String> drpDown;

    @FXML
       void bootOS(ActionEvent event) {
                bootThis(((OS) this.tableBoot.getSelectionModel().getSelectedItem()).getOsNum());
                Stage stage = (Stage) this.btnBoot.getScene().getWindow();
                stage.close();
        }

    @FXML
       void setOS1(ActionEvent event) throws FileNotFoundException {
                ArrayList<OS> unOrderedOS = new ArrayList<>();
                ArrayList<String> file2 = new ArrayList<>();
                    int indexOfNum = 0;
                int indexOfBoot = 0;
                int count = 0;
                for (OS os : this.tableBoot.getItems()) {
                                unOrderedOS.add(os);
                        if (os.getOsNum().equals(this.txtOS1.getText())) {
                                indexOfNum = count;
                        }
                        if (os.getOrdering().equals(this.drpDown.getSelectionModel().getSelectedItem())) {
                                indexOfBoot = count;
                        }
                        count++;
                }
                OS tempOS = unOrderedOS.get(indexOfBoot);
                unOrderedOS.set(indexOfBoot, unOrderedOS.get(indexOfNum));
                unOrderedOS.set(indexOfNum, tempOS);
                    StringBuilder sb = new StringBuilder();
                for (OS os : unOrderedOS) {
                        sb.append(os.getOsNum() + ",");
                }

        ArrayList<String> file = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(pathToChecks));
            while (scanner.hasNextLine()) {
                file.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        file.set(6, "loadDrivesYes");
        file.set(7, "reorderYes");
        file.set(8, sb.toString().substring(0, sb.length() - 1));


        try {
            FileWriter writer = new FileWriter(pathToChecks);
                        for (String string : file) {
                                writer.append(string);
                                writer.append("\n");
                        }
                        writer.close();
                }
        catch (IOException e) {
                                e.printStackTrace();
                }

        //////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\
                if (!(this.txtPath.getText().equals(""))) {
                        Scanner scanner = new Scanner(new File(this.pathToPaths));
                        while (scanner.hasNextLine()) {
                                file2.add(scanner.nextLine());
                        }
                        scanner.close();
                        file2.set(0, "imageChanged");
                        if (this.drpDown.getSelectionModel().getSelectedIndex() == 0) {
                                file2.set(1, this.txtPath.getText());
                        } else {
                                file2.set(2, this.txtPath.getText());
                        }
                    try {
                                FileWriter writer = new FileWriter(this.pathToPaths);
                                for (String string : file2) {
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

    @FXML
       void selectOS(MouseEvent event) throws FileNotFoundException {
                OS os = (OS) this.tableBoot.getSelectionModel().getSelectedItem();
                this.txtOS1.setText(os.getOsNum());
                this.drpDown.getSelectionModel().select(os.getOrdering());
                this.txtPath.setDisable(true);
                this.txtPath.clear();
                if (os.getOrdering().contentEquals("1") || os.getOrdering().contentEquals("2")) {
                        this.txtPath.setDisable(false);
                }
                    Scanner scanner = new Scanner(new File(this.pathToPaths));
                ArrayList<String> pathsFile = new ArrayList<>();
                while (scanner.hasNext()) {
                        pathsFile.add(scanner.nextLine());
                }
                if (os.getOrdering().equals("1")) {
                        this.txtPath.setText(pathsFile.get(1));
                }
                if (os.getOrdering().equals("2")) {
                        this.txtPath.setText(pathsFile.get(2));
                }
                scanner.close();
        }

    @FXML
       void load(ActionEvent event) {
                this.drpDown.getItems().clear();
                this.tableBoot.getItems().clear();
                this.tableBoot.getColumns().clear();
                TableColumn boot = new TableColumn("Boot Order");
                boot.setCellValueFactory(new PropertyValueFactory("osLabel"));
                tableBoot.getColumns().addAll(boot);
                try {
                    loadAllDrives();
                        Scanner scanner = new Scanner(new File(this.pathToBootNums));
                        int count = 1;
                        ArrayList<String> bootOrder = loadBootOrder();
                        ArrayList<OS> allOS = new ArrayList<>();
                        ArrayList<String> file = new ArrayList<>();
                        while (scanner.hasNextLine()) {
                                count++;
                                String text = scanner.nextLine();
                                file.add(text);
                        }
                        scanner.close();
                                count = 1;
                        for (String s : file) {
                                count++;
                                if (count > 4) {
                                        int innerCount = 0;
                                        for (String string : bootOrder) {
                                                innerCount++;
                                                if (s.contains(string)) {
                                                        OS os = new OS(s.substring(4, 8) + " " + s.substring(9, s.length()), s.substring(4, 8), String.valueOf(innerCount));
                                                        allOS.add(os);
                                                }
                                        }
                                }
                        }
                        count = 1;
                        for (String num : bootOrder) {
                                for (OS os : allOS) {
                                        if (os.getOsNum().equals(num)) {
                                                this.drpDown.getItems().add(String.valueOf(count));
                                                this.tableBoot.getItems().add(os);
                                                count++;
                                        }
                                }
                        }
                        scanner.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                }
        }

    @FXML
       void setOS2(ActionEvent event) {
    }

    private void bootThis(String bootNum) {
                writeThis(this.pathToChecks, 2, "yes1");
                writeThis(this.pathToChecks, 3, bootNum);
                writeThis(this.pathToChecks, 4, "rebootYes");
        }

    private void loadAllDrives() {
                writeThis(this.pathToChecks, 6, "loadDrivesYes");
        }

    private ArrayList<String> loadBootOrder() {
            try {
                Scanner scanner = new Scanner(new File(pathToBootNums));
                int count = 1;
                ArrayList<String> bootOrder = new ArrayList<>();
                ArrayList<String> file = new ArrayList<>();
                ArrayList<String> bootOptions = new ArrayList<>();
                while (scanner.hasNextLine()) {
                                count++;
                                String text = scanner.nextLine();
                if (text.contains("BootNext")) {
                    count--;
                }

                                file.add(text);
                                if (count == 4) {
                                        String order = text.substring(11);
                                        for (int i = 0; i < order.length() - 5; i += 5) {
                                                bootOrder.add(order.substring(i, i + 4));
                                        }
                                        bootOrder.add(order.substring(order.length() - 4));
                                } else if (count > 4) {
                    bootOptions.add(text.substring(4, 8));
                }
                        }
                        scanner.close();
            if (bootOptions.size() != bootOrder.size()) {
                for (String s : bootOptions) {
                    if (!(bootOrder.contains(s))) {
                        bootOrder.add(s);
                    }
                }
                writeThis(pathToChecks, 8, bootOrder.toString().replaceAll("\\s+|\\]|\\[", ""));
                writeThis(pathToChecks, 7, "reorderYes");
            }

                        return bootOrder;
                }
        catch (FileNotFoundException e) {
                        e.printStackTrace();
                        return null;
                }
        }

    private void writeThis(String filePath, int line, String message) {
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
