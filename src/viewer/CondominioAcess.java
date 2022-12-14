package viewer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.entity.MoradorPrincipal;

public class CondominioAcess extends Application {

private static Stage stage;
	
	public static void main(String args[]) throws Exception {
			launch();
	}

	@Override
	public void start(Stage stg) throws Exception {
        setStage(stg);
        stg.setTitle("Cadastro");
        telaRegistroMoradorPrincipal();
    }
    
    public static void telaCadastroMoradorPrincipal() {
        try {
            Parent root = FXMLLoader.load(CondominioAcess.class.getResource("resources/cadastroMoradorPrincipal.fxml"));
            Scene scene = new Scene (root);
            stage.setScene(scene);
            stage.setTitle("Tela de Cadastro de Moradores Principais");
            stage.show();
        }
        catch(Exception e) {    // captura exception qnd qm chamar ele throws Excep.
            e.printStackTrace();
        }
    }
    
    public static void telaEdicaoMoradorPrincipal() {
        try {
            Parent root = FXMLLoader.load(CondominioAcess.class.getResource("resources/edicaoMoradorPrincipal.fxml"));
            Scene scene = new Scene (root);
            stage.setScene(scene);
            stage.setTitle("Tela de Edição de Moradores Principais");
            stage.show();
        }
        catch(Exception e) {    // captura exception qnd qm chamar ele throws Excep.
            e.printStackTrace();
        }
    }
    
    public static void telaRegistroMoradorPrincipal() {
        try {
            Parent root = FXMLLoader.load(CondominioAcess.class.getResource("resources/registroMoradorPrincipal.fxml"));
            Scene scene = new Scene (root);
            stage.setScene(scene);
            stage.setTitle("Tela de Registro de Moradores Principais");
            stage.show();
        }
        catch(Exception e) {    // captura exception qnd qm chamar ele throws Excep.
            e.printStackTrace();
        }
    }
    
    public static void telaCadastroMoradorSecundario() {
        try {
            Parent root = FXMLLoader.load(CondominioAcess.class.getResource("resources/cadastroMoradorSecundario.fxml"));
            Scene scene = new Scene (root);
            stage.setScene(scene);
            stage.setTitle("Tela de Cadastro de Moradores Secundários");
            stage.show();
        }
        catch(Exception e) {    // captura exception qnd qm chamar ele throws Excep.
            e.printStackTrace();
        }
    }
    
    public static void telaEdicaoMoradorSecundario() {
        try {
            Parent root = FXMLLoader.load(CondominioAcess.class.getResource("resources/edicaoMoradorSecundario.fxml"));
            Scene scene = new Scene (root);
            stage.setScene(scene);
            stage.setTitle("Tela de Edição de Moradores Secundarios");
            stage.show();
        }
        catch(Exception e) {    // captura exception qnd qm chamar ele throws Excep.
            e.printStackTrace();
        }
    }
    
    public static void telaRegistroMoradorSecundario() {
        try {
            Parent root = FXMLLoader.load(CondominioAcess.class.getResource("resources/registroMoradorSecundario.fxml"));
            Scene scene = new Scene (root);
            stage.setScene(scene);
            stage.setTitle("Tela de Cadastro de Moradores Secundários");
            stage.show();
        }
        catch(Exception e) {    // captura exception qnd qm chamar ele throws Excep.
            e.printStackTrace();
        }
    }
    
    public static void telaCadastroEmpregado() {
        try {
            Parent root = FXMLLoader.load(CondominioAcess.class.getResource("resources/cadastroEmpregado.fxml"));
            Scene scene = new Scene (root);
            stage.setScene(scene);
            stage.setTitle("Tela de Cadastro de Moradores Secundários");
            stage.show();
        }
        catch(Exception e) {    // captura exception qnd qm chamar ele throws Excep.
            e.printStackTrace();
        }
    }

    public static void telaRegistroEmpregado() {
        try {
            Parent root = FXMLLoader.load(CondominioAcess.class.getResource("resources/registroEmpregado.fxml"));
            Scene scene = new Scene (root);
            stage.setScene(scene);
            stage.setTitle("Tela de Cadastro de Moradores Secundários");
            stage.show();
        }
        catch(Exception e) {    // captura exception qnd qm chamar ele throws Excep.
            e.printStackTrace();
        }
    }
    
    public static void telaEdicaoEmpregado() {
        try {
            Parent root = FXMLLoader.load(CondominioAcess.class.getResource("resources/edicaoEmpregado.fxml"));
            Scene scene = new Scene (root);
            stage.setScene(scene);
            stage.setTitle("Tela de Cadastro de Moradores Secundários");
            stage.show();
        }
        catch(Exception e) {    // captura exception qnd qm chamar ele throws Excep.
            e.printStackTrace();
        }
    }
    
    public static void telaCadastroAnimal() {
		try {
            Parent root = FXMLLoader.load(CondominioAcess.class.getResource("resources/cadastroAnimal.fxml"));
            Scene scene = new Scene (root);
            stage.setScene(scene);
            stage.setTitle("Tela de Cadastro de Animais");
            stage.show();
        }
        catch(Exception e) {    // captura exception qnd qm chamar ele throws Excep.
            e.printStackTrace();
        }
	}

	public static void telaRegistroAnimal() {
		try {
            Parent root = FXMLLoader.load(CondominioAcess.class.getResource("resources/registroAnimal.fxml"));
            Scene scene = new Scene (root);
            stage.setScene(scene);
            stage.setTitle("Tela de Registro de Animais");
            stage.show();
        }
        catch(Exception e) {    // captura exception qnd qm chamar ele throws Excep.
            e.printStackTrace();
        }
	}

	public static void telaEdicaoAnimal() {
		 try {
	            Parent root = FXMLLoader.load(CondominioAcess.class.getResource("resources/edicaoAnimal.fxml"));
	            Scene scene = new Scene (root);
	            stage.setScene(scene);
	            stage.setTitle("Tela de Edição de Animais");
	            stage.show();
	        }
	        catch(Exception e) {    // captura exception qnd qm chamar ele throws Excep.
	            e.printStackTrace();
	        }
	}
	
	public static void telaCadastroVeiculo() {
        try {
            Parent root = FXMLLoader.load(CondominioAcess.class.getResource("resources/cadastroVeiculo.fxml"));
            Scene scene = new Scene (root);
            stage.setScene(scene);
            stage.setTitle("Tela de Cadastro de Veiculo");
            stage.show();
        }
        catch(Exception e) {    // captura exception qnd qm chamar ele throws Excep.
            e.printStackTrace();
        }
    }
    
    public static void telaEdicaoVeiculo() {
        try {
            Parent root = FXMLLoader.load(CondominioAcess.class.getResource("resources/edicaoVeiculo.fxml"));
            Scene scene = new Scene (root);
            stage.setScene(scene);
            stage.setTitle("Tela de Edição de Veiculo");
            stage.show();
        }
        catch(Exception e) {    // captura exception qnd qm chamar ele throws Excep.
            e.printStackTrace();
        }
    }
    
    public static void telaRegistroVeiculo() {
        try {
            Parent root = FXMLLoader.load(CondominioAcess.class.getResource("resources/registroVeiculo.fxml"));
            Scene scene = new Scene (root);
            stage.setScene(scene);
            stage.setTitle("Tela de Cadastro de Veiculo");
            stage.show();
        }
        catch(Exception e) {    // captura exception qnd qm chamar ele throws Excep.
            e.printStackTrace();
        }
    }


	public static Stage getStage() {
		return stage;
	}

	public static void setStage(Stage stage) {
		CondominioAcess.stage = stage;
	}
	
}
