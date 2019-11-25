package bsu.comp152;

import com.sun.org.apache.xpath.internal.operations.Mod;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javax.swing.text.html.ListView;

public class search implements Initializable {
    @FXML
    private ListView<armoury.peopleDataType> ListControl;
    private armoury Model;

    public void loadData(){
        var site = "http https://swapi.co/api/";
        var params = getQueryParameters();
        var query = site+params;

        Model = new armoury(query);
        var people = Model.getData();
        ObservableList<armoury.peopleDataType> dataToShow =
                FXCollections.observableArrayList(people);
        ListControl.setItems
    }
}
