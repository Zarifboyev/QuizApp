package com.example.quizzapp;

// savol javoblar uchun class


public class SavollarClass {

    String sav;
    String javob_a, javob_b, javob_c, javon_d;
    String togriJavob;


    //getter va setter

    public String getSav() {
        return sav;
    }

    public void setSav(String sav) {
        this.sav = sav;
    }

    public String getJavob_a() {
        return javob_a;
    }

    public void setJavob_a(String javob_a) {
        this.javob_a = javob_a;
    }

    public String getJavob_b() {
        return javob_b;
    }

    public void setJavob_b(String javob_b) {
        this.javob_b = javob_b;
    }

    public String getJavob_c() {
        return javob_c;
    }

    public void setJavob_c(String javob_c) {
        this.javob_c = javob_c;
    }

    public String getJavon_d() {
        return javon_d;
    }

    public void setJavon_d(String javon_d) {
        this.javon_d = javon_d;
    }

    public String getTogriJavob() {
        return togriJavob;
    }

    public void setTogriJavob(String togriJavob) {
        this.togriJavob = togriJavob;
    }


    // constructor elon atamiz
    public SavollarClass(String sav, String javob_a, String javob_b, String javob_c, String javon_d, String togriJavob) {
        this.sav = sav;
        this.javob_a = javob_a;
        this.javob_b = javob_b;
        this.javob_c = javob_c;
        this.javon_d = javon_d;
        this.togriJavob = togriJavob;




    }
}
