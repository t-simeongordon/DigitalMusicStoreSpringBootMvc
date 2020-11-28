package com.tsg.DigitalMusicStoreSpringBootMvc.model;

public class Genre {
    private String Kpop;
    private String Pop;
    private String Rock;
    private String Rnb;

    public Genre() {
    }

    public String getKpop() {
        return Kpop;
    }

    public void setKpop(String kpop) {
        Kpop = kpop;
    }

    public String getPop() {
        return Pop;
    }

    public void setPop(String pop) {
        Pop = pop;
    }

    public String getRock() {
        return Rock;
    }

    public void setRock(String rock) {
        Rock = rock;
    }

    public String getRnb() {
        return Rnb;
    }

    public void setRnb(String rnb) {
        Rnb = rnb;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "Kpop='" + Kpop + '\'' +
                ", Pop='" + Pop + '\'' +
                ", Rock='" + Rock + '\'' +
                ", Rnb='" + Rnb + '\'' +
                '}';
    }
}
