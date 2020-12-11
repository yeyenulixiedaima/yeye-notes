package com.lexed.carmanager.database.pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Driverstatus {
    private Integer id;

    private Integer dstatusnum;

    private String driverinfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDstatusnum() {
        return dstatusnum;
    }

    public void setDstatusnum(Integer dstatusnum) {
        this.dstatusnum = dstatusnum;
    }

    public String getDriverinfo() {
        return driverinfo;
    }

    public void setDriverinfo(String driverinfo) {
        this.driverinfo = driverinfo == null ? null : driverinfo.trim();
    }
}