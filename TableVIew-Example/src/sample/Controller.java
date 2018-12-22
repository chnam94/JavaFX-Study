package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    // 1. DataModel 정의 : PeopleDataModel 객체 만들기
    // 2. 멤버 변수 생성
    // 3. Column 초기화
    // 4. 값 삽입
    @FXML
    private TableView<PeopleDataModel> myTableView;
    @FXML
    private TableColumn<PeopleDataModel, Integer> idColumn; //id 값은 int형
    @FXML
    private TableColumn<PeopleDataModel, String> nameColumn;
    @FXML
    private TableColumn<PeopleDataModel, String> schoolColumn;

    ObservableList<PeopleDataModel> myList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        idColumn.setCellValueFactory(cellData -> cellData.getValue().getId().asObject());
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().getName());
        schoolColumn.setCellValueFactory(cellData -> cellData.getValue().getSchool());

        init_table_data();
    }

    private void init_table_data()
    {
        SimpleIntegerProperty idProperty = new SimpleIntegerProperty(0);
        SimpleStringProperty nameProperty = new SimpleStringProperty("NCH");
        SimpleStringProperty schoolProperty = new SimpleStringProperty("Koreatech");

        PeopleDataModel people = new PeopleDataModel(idProperty, nameProperty, schoolProperty);


        myList.add(people);
        myTableView.setItems(myList);
    }
}
