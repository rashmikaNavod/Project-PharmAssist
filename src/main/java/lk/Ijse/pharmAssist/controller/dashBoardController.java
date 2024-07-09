package lk.Ijse.pharmAssist.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class dashBoardController {

    @FXML
    private AnchorPane rootNode;
    @FXML
    private AnchorPane mainFormNode;


    public void initialize() throws IOException {
        AnchorPane newBillPane = FXMLLoader.load(this.getClass().getResource("/View/billForm.fxml"));
        mainFormNode.getChildren().clear();
        mainFormNode.getChildren().add(newBillPane);
    }

    public void btnNewBillOnAction(ActionEvent actionEvent) {
    }

    public void btnMedicineOnAction(ActionEvent actionEvent) {
    }

    public void btnEmployeeOnAction(ActionEvent actionEvent) {
    }

    public void btnEmployeeSalaryOnAction(ActionEvent actionEvent) {
    }

    public void btnEmployeeAttendanceOnAction(ActionEvent actionEvent) {
    }

    public void btnSuppliersOnAction(ActionEvent actionEvent) {
    }

    public void btnCustomerOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane newBillPane = FXMLLoader.load(this.getClass().getResource("/View/customerForm.fxml"));
        mainFormNode.getChildren().clear();
        mainFormNode.getChildren().add(newBillPane);
    }

    public void btnItemsOnAction(ActionEvent actionEvent) {
    }

    public void btnExitOnAction(ActionEvent actionEvent) {
    }
}
