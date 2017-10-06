package tp1;

public class CoursImpl1 implements Cours {
	/**
	 * 
	 */
	private Etudiant etudiant;
	
	private boolean verrou;
	
	public CoursImpl1() {
		this.verrou = false;
	}
	
	public CoursImpl1(Etudiant etudiant) {
		this.etudiant = etudiant;
		this.verrou = false;
	}
	
	public Etudiant getEtudiant() {
		return this.etudiant;
	}
	
	public void setEtudiant(Etudiant etudiant) {
		if(this.verrou) {
			this.verrou = true;
			
			if(this.etudiant != null) {
				this.etudiant.setCours(null);
			}
			
			
			if(etudiant != null) {
				etudiant.setCours(this);
			}
			
			this.etudiant = etudiant;
			
			this.verrou = false;
		}
	}
	
}

