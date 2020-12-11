package com.lexed.carmanager.database.pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Repair {
    private Integer id;

    private String cnumber;

    private String carinfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnumber() {
        return cnumber;
    }

    public void setCnumber(String cnumber) {
        this.cnumber = cnumber == null ? null : cnumber.trim();
    }

    public String getCarinfo() {
        return carinfo;
    }

    public void setCarinfo(String carinfo) {
        this.carinfo = carinfo == null ? null : carinfo.trim();
    }
}