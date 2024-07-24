package me.dio.dio_santander_bootcamp_api.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_characters")
public class Characters {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer slot;
    @Column(unique = true)
    private String charname;
    private String jobclass;
    @Column(scale = 4)
    private Integer baselvl;
    @Column(scale = 4)
    private Integer joblvl;
    @Column(scale = 10)
    private Integer zeny;
    private String guild;
    private String status;
    
    public String getCharname() {
        return charname;
    }
    public void setCharname(String charname) {
        this.charname = charname;
    }
    public String getJobclass() {
        return jobclass;
    }
    public void setJobclass(String jobclass) {
        this.jobclass = jobclass;
    }
    public Integer getBaselvl() {
        return baselvl;
    }
    public void setBaselvl(Integer baselvl) {
        this.baselvl = baselvl;
    }
    public Integer getJoblvl() {
        return joblvl;
    }
    public void setJoblvl(Integer joblvl) {
        this.joblvl = joblvl;
    }
    public Integer getZeny() {
        return zeny;
    }
    public void setZeny(Integer zeny) {
        this.zeny = zeny;
    }
    public String getGuild() {
        return guild;
    }
    public void setGuild(String guild) {
        this.guild = guild;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
}
