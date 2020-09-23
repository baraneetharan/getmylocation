package com.getmylocation.getmylocation;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Punchdata
 */
@Entity

public class Punchdata {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long punchdataid;

    private String userlatitude;
    private String userlongitude;
    private String punchtime;
    private String useremail;
    
  public Long getPunchdataid() {
      return punchdataid;
  }
  public void setPunchdataid(final Long punchdataid) {
      this.punchdataid = punchdataid;
  }

  public String getUserlatitude() {
      return userlatitude;
  }

  public void setUserlatitude(final String userlatitude) {
      this.userlatitude = userlatitude;
  }

  public String getUserlongitude() {
      return userlongitude;
  }

  public void setUserlongitude(final String userlongitude) {
      this.userlongitude = userlongitude;
  }

  public String getPunchtime() {
      return punchtime;
  }

  public void setPunchtime(final String punchtime) {
      this.punchtime = punchtime;
  }

  public String getUseremail() {
      return useremail;
  }

  public void setUseremail(final String useremail) {
      this.useremail = useremail;
  }

    
}