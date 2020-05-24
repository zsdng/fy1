package cn.fy.domain;

import java.io.Serializable;

public class Ars implements Serializable {
    private int id;

    private String aip;

    private String action;

    public Ars() {
    }

    public Ars(String aip, String action) {
        this.aip = aip;
        this.action = action;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAip() {
        return aip;
    }

    public void setAip(String aip) {
        this.aip = aip;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Ars{" +
                "id=" + id +
                ", aip='" + aip + '\'' +
                ", action='" + action + '\'' +
                '}';
    }
}
