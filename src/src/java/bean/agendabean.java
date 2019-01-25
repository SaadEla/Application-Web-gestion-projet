/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

public class agendabean {
    private int id_Agenda;
    private String IdentProjet;
    private String ChefDeProjet;
    private int EtatAvancement;
    private String DateDebutProjet;
    private String DateFinProjet;

    public int getId_Agenda() {
        return id_Agenda;
    }

    public void setId_Agenda(int id_Agenda) {
        this.id_Agenda = id_Agenda;
    }

    public String getIdentProjet() {
        return IdentProjet;
    }

    public void setIdentProjet(String IdentProjet) {
        this.IdentProjet = IdentProjet;
    }

    public String getChefDeProjet() {
        return ChefDeProjet;
    }

    public void setChefDeProjet(String ChefDeProjet) {
        this.ChefDeProjet = ChefDeProjet;
    }

    public int getEtatAvancement() {
        return EtatAvancement;
    }

    public void setEtatAvancement(int EtatAvancement) {
        this.EtatAvancement = EtatAvancement;
    }

    public String getDateDebutProjet() {
        return DateDebutProjet;
    }

    public void setDateDebutProjet(String DateDebutProjet) {
        this.DateDebutProjet = DateDebutProjet;
    }

    public String getDateFinProjet() {
        return DateFinProjet;
    }

    public void setDateFinProjet(String DateFinProjet) {
        this.DateFinProjet = DateFinProjet;
    }
    
    
}
