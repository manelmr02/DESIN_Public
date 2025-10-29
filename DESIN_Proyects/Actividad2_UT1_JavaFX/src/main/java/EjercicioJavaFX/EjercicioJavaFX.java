package EjercicioJavaFX;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josemmr
 */
public class EjercicioJavaFX extends Application{
     @Override
    public void start(Stage stage) {
        Label nombreLabel = new Label("Nombre:");
        TextField nombreField = new TextField("José Manuel");

        Label apellidosLabel = new Label("Apellidos:");
        TextField apellidosField = new TextField("Morales Rivera");

        VBox root = new VBox(10, nombreLabel, nombreField, apellidosLabel, apellidosField);
        root.setPadding(new Insets(20));
        root.setStyle("-fx-background-color: lightblue;");

        Scene scene = new Scene(root, 300, 200);
        stage.setTitle("Actividad 1.2 JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
