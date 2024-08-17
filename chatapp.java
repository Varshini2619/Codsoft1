package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            TextField messageInput = new TextField(); 
            TextArea chatArea = new TextArea();

            Button sendButton = new Button("Send");
                sendButton.setOnAction(e -> {
                String message = messageInput.getText();
                chatArea.appendText("You: " + message + "\n");
                messageInput.clear();
            });

            VBox root = new VBox();
            root.getChildren().addAll(chatArea, messageInput, sendButton);
            Scene scene = new Scene(root, 300, 400);

            primaryStage.setScene(scene);
            primaryStage.setTitle("Chat Application");
            primaryStage.show();
   }

             catch (Exception e) {
            e.printStackTrace();
    }}

    public static void main(String[] args) {
        launch(args);
    }
}
