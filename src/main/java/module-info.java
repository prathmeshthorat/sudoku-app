module com.sudoku.javadesktopappsudoku {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sudoku.app to javafx.fxml;
    exports com.sudoku.app;
}