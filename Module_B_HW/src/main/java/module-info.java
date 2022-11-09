module com.mycompany.module_b_hw {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.module_b_hw to javafx.fxml;
    exports com.mycompany.module_b_hw;
    
}
