package spring.hero.bank;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RegisterStage extends Stage {

    private GridPane gridPane;

    private Button btnLogin;
    private Button btnReset;

    private Label labelId;
    private TextField id ;
    private Label labelSenderId;
    private TextField senderId;
    private Label labelRecipientsId;
    private  TextField recipientsId;
    private Label labelMesage;
    private TextField message;
    private Label labelAddress;
    private TextField address;

    public RegisterStage() {
        initComponent();
    }

    private void initComponent() {
        this.gridPane = new GridPane();
        this.senderId = new TextField ();
        this.labelSenderId = new Label ("SENDER ID" );
        this.recipientsId =new TextField();
        this.labelRecipientsId = new Label ("RecipientsId");
        this.message =new TextField();
        this.labelMesage = new Label ("Mess");
this.labelAddress = new Label ("Address");
this.address = new TextField ();
        this.btnLogin = new Button("Thực hiện");
        this.btnReset = new Button("Hủy");
        btnLogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(senderId, 1, 0);
        TextField senderId = new TextField();

        senderId.setMaxWidth(200);
        Label gui = new Label("người gửi : ");
        Label secondLabel = new Label();
        HBox bottomText = new HBox(senderId,secondLabel);
        bottomText.setAlignment(Pos.CENTER);
        VBox vBox = new VBox(10,senderId,bottomText);
        vBox.setAlignment(Pos.BASELINE_LEFT);
        secondLabel.textProperty().bind(senderId.textProperty());


        TextField RecipientsId = new TextField();

        RecipientsId.setMaxWidth(200);
        Label nhan = new Label("người nhận : ");
        Label secondLabel1 = new Label();
        HBox bottomText1 = new HBox(RecipientsId,secondLabel1);

        bottomText1.setAlignment(Pos.CENTER);

        VBox vBox1 = new VBox(10,RecipientsId,bottomText1);

        vBox1.setAlignment(Pos.BASELINE_LEFT);



        secondLabel1.textProperty().bind(RecipientsId.textProperty());
        gridPane.add(labelSenderId, 0, 0);
        gridPane.add (senderId,1,0);
        gridPane.add(labelRecipientsId, 0, 2);
        gridPane.add(RecipientsId, 1, 2);
        gridPane.add (labelMesage,0,4);
        gridPane.add (message,1,4);
        gridPane.add (labelAddress,0,5);
        gridPane.add (address,1,5);
      gridPane.add (gui,0,1);
        gridPane.add (vBox,1,1);
        gridPane.add (nhan,0,3);
        gridPane.add (vBox1,1,3);

        HBox hBox = new HBox();
        hBox.getChildren().addAll(btnLogin, btnReset);
        hBox.setSpacing(10);
       gridPane.add(hBox, 1, 6);
        Scene scene = new Scene(gridPane, 600, 300);
        this.setScene(scene);
    btnLogin.setOnAction (new EventHandler<ActionEvent> ( ) {
        @Override
        public void handle(ActionEvent event) {
            close ();

        }
    });

    }

}

