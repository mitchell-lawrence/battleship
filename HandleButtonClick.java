import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class HandleButtonClick implements EventHandler<ActionEvent>{
	private Button tf;
	
	public HandleButtonClick(Button button) {
		tf = button;
	}
	
	public void handle(ActionEvent event) {
		System.out.println("Row: " + GridPane.getRowIndex(tf));
		System.out.println("Column: " + GridPane.getColumnIndex(tf));
		tf.setStyle("-fx-background-color: blue; -fx-border-color: black; -fx-border-width: 2px;");
	}

}
