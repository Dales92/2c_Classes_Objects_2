package com.cc.java;

public class Cat {
    
    private String name;
    private String furColor;
    private int age;

    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    private boolean isFemale;{
    }

    // Schnittstelle
    public String getStringAttributes(String flag) {
     switch (flag) {
         case "#name":
             return name;
         case "#color":   
             return furColor;
         default:
            return "ERROR: ";
           
     }
    }

    
    
    public String getAge() {
        return checkCompliance();
    }

    private String checkCompliance() {
        if (isFemale) {
            // nicht OK !
            return CheckEscalationLevel() ; 
        } else {
            // OK!
            return Integer.toString(age);  
        }
       
    }

    private String CheckEscalationLevel() {
        return "This is an inappropriate question";
    }

}
