package tp1;

import java.util.Collection;

public class EtudiantImpl implements Etudiant {

	private Collection<Cours> cours;
	
	public EtudiantImpl(Collection<Cours> cours) {
		this.cours = cours;
	}
}