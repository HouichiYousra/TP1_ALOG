package Models.GestionRdv;

import Models.GestionPatient.Patient;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Rdv {
    private LocalDate date;
    private LocalTime heure;
    private String objet;
    private Patient patient;
    private static ArrayList<Rdv> rdvs;

    public Rdv(LocalDate date, LocalTime heure, String objet, Patient patient) {
        this.date = date;
        this.heure = heure;
        this.objet = objet;
        this.patient = patient;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHeure() {
        return heure;
    }

    public void setHeure(LocalTime heure) {
        this.heure = heure;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public static ArrayList<Rdv> listRdvs(LocalDate jour) {
        ArrayList<Rdv> result = new ArrayList<Rdv>();
        for (Rdv r:rdvs) {
            if (r.date==jour){
                result.add(r);
            }
        }
        return result;
    }
}