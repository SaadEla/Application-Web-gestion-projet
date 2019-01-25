package bean;

public class administrateurbean {
    private String Nom;
    private String Prenom;
    private String Email;
    private String MotDePasse;
    private String Telephone;
    
    public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMotDePasse() {
		return MotDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		MotDePasse = motDePasse;
	}
	public String getTelephone() {
		return Telephone;
	}
	public void setTelephone(String telephone) {
		Telephone = telephone;
	}
	public String getDateNaissance() {
		return DateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		DateNaissance = dateNaissance;
	}
	public String getDiplome() {
		return Diplome;
	}
	public void setDiplome(String diplome) {
		Diplome = diplome;
	}
	public String getAnneeObtention() {
		return AnneeObtention;
	}
	public void setAnneeObtention(String anneeObtention) {
		AnneeObtention = anneeObtention;
	}
	public String getEtablissement() {
		return Etablissement;
	}
	public void setEtablissement(String etablissement) {
		Etablissement = etablissement;
	}
	public String getCompetence() {
		return Competence;
	}
	public void setCompetence(String competence) {
		Competence = competence;
	}
	private String DateNaissance;
    private String Diplome;
    private String AnneeObtention;
    private String Etablissement;
    private String Competence;

}
