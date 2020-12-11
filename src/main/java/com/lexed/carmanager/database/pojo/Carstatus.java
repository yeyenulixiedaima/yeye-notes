package com.lexed.carmanager.database.pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Carstatus {
    private Integer id;

    private Integer statusnum;

    private String statusinfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatusnum() {
        return statusnum;
    }

    public void setStatusnum(Integer statusnum) {
        this.statusnum = statusnum;
    }

    public String getStatusinfo() {
        return statusinfo;
    }

    public void setStatusinfo(String statusinfo) {
        this.statusinfo = statusinfo == null ? null : statusinfo.trim();
    }
}