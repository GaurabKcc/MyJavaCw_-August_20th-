package models;
public class Measurement {
    public float num;

    public Measurement(float num) {
        this.num = num;
    }

    public String getCm(){
        return num*100 + " cm";
    }

    public String getKm(){
        return num/1000 + " km";
    }

    public String getMm(){
        return num*1000 + " mm";
    }

    public String getDm(){
        return num*10 + " dm";
    }





}