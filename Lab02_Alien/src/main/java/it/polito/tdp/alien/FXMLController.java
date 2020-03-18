package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	AlienDictionary a=new AlienDictionary();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtAlien;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    void doReset(ActionEvent event) {
    	
    	this.txtResult.clear();
    	this.txtAlien.clear();
    	this.txtResult.appendText("BENVENUTO NEL DIZIONARIO ALIENO NOCCIO");

    }

    @FXML
    void doTranslate(ActionEvent event) {
    	
    	String array[]=this.txtAlien.getText().toLowerCase().split(" ");
    	boolean r=true;
    	
    	if(array.length==2)
    	{
    		//Aggiunta al diz.
    	for(int p=0; p<array[0].length(); p++) {
    		if(r==true) {
    		Character ch=array[0].charAt(p);
    		if(!Character.isLetter(ch)) {
    			r=false;
    			txtResult.appendText("SCRVI UNA PAROLA ALIENA CORRETTA NOCCIO"+"\n"); 
    			this.txtAlien.clear();
    			return;
    		}
    		}
    		
    //		else txtResult.appendText("SCRVI UNA PAROLA ALIENA CORRETTA NOCCIO"+"\n"); 
    		
    		
    	}
    		
    		for(int p=0; p<array[1].length(); p++) {
        		Character ch=array[1].charAt(p);
        		if(!Character.isLetter(ch)) {
        			txtResult.appendText("SCRVI UNA TRADUZIONE CORRETTA NOCCIO"+"\n"); 
        			this.txtAlien.clear();
        			return;
        		}
        		}
    		
    		a.addWord(array[0], array[1]);
    		this.txtResult.appendText("La parola aliena "+ array[0]+ "  viene tradotta come "+array[1]+"\n");
    		this.txtAlien.clear();
    	}

    	if(array.length==1)
    	{
    		
    		for(int p=0; p<array[0].length(); p++) {
        		Character ch=array[0].charAt(p);
        		if(!Character.isLetter(ch)) {
        			txtResult.appendText("SCRVI UNA PAROLA ALIENA CORRETTA NOCCIO"+"\n"); 
        			this.txtAlien.clear();
        			return;
        		}
        		}
    		
    		
    		//Dare la traduzione
    	if(a.translateWord(array[0])!=null) {
    		this.txtResult.appendText("La traduzione di "+array[0]+ " e' "+a.translateWord(array[0])+ "\n");
    		this.txtAlien.clear();
    		}
    	
    	else { 
    		this.txtResult.appendText("La parola cercata non e' tradotta"+ "\n");
    		this.txtAlien.clear();
    	}
    	}
    	
    		
    	}

    @FXML
    void initialize() {
        assert txtAlien != null : "fx:id=\"txtAlien\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
