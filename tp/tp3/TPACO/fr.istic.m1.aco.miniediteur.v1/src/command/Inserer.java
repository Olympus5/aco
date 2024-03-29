package command;

import java.io.IOException;

import invoker.Editeur;
import receiver.Moteur;

/**
 * Inserer class
 * @author Erwan IQUEL, Mathieu LECLEC'H
 * @version 1.0
 */
public class Inserer implements Command
{
	private final Editeur ihm;
	private final  Moteur moteur;
	private String texte;
	/**
	 * Create an instance of Inserer object
	 * @param ihm 
	 * @param moteur 
	 */
	public Inserer(Moteur moteur, Editeur ihm){
		this.moteur = moteur;
		this.ihm=ihm;
		
	}

	@Override
	public void execute() throws IOException {
		this.texte= this.ihm.getText();
		this.moteur.inserer(this.texte);
	}

}

