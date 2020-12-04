package com.hemebiotech.analytics;

public class Symptom {
    private String nomSymptom;
    private int recurrence;

    public Symptom(String paramNom){   //constructeur
        this.nomSymptom = paramNom;
    }

    public Symptom(String paramNom, int paramRecurrence){   //constructeur
        this.nomSymptom = paramNom;
        this.recurrence = paramRecurrence;
    }


    public String getNomSymptom(){return nomSymptom;}       //Getter
    public int getRecurrence(){return recurrence;}


    public void setNomSymptom(String nomSymptom){this.nomSymptom = nomSymptom;}
    public void setRecurrence(int recurrence){this.recurrence = recurrence;}        //Setter

}
