module com.mycompany.module_b_assignment {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.module_b_assignment to javafx.fxml;
    exports com.mycompany.module_b_assignment;
    requires javafx.graphicsEmpty;
}
