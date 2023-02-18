package de.laviereha.MoodleAPI.auszubildender;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "mdl_user")
public class Auszubildender {

     @Id
     @Column(name = "id")
     private Integer id;

     @Column(name = "firstname")
     private String vorname;

     @Column(name = "lastname")
     private String nachname;

     private Integer Jahrgang;

     @Column(name = "lastlogin")
     @Convert(converter = LongToLocalDateTimeConverter.class)
     private LocalDateTime letzterLogin;

    public Auszubildender () {
    }

    public Auszubildender(String vorname, String nachname, LocalDateTime letzterLogin) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.letzterLogin = letzterLogin;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public LocalDateTime getLetzterLogin() {
        return letzterLogin;
    }
    public void setLetzterLogin(LocalDateTime letzterLogin) {
        this.letzterLogin = letzterLogin;
    }

    public String getVorname() {
        return vorname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
}