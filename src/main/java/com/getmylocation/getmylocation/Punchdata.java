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

    private BigDecimal userlatitude;
    private BigDecimal userlongitude;
    private LocalDateTime punchtime;
    private String useremail;
    
  public Long getPunchdataid() {
      return punchdataid;
  }
  public void setPunchdataid(final Long punchdataid) {
      this.punchdataid = punchdataid;
  }

  public BigDecimal getUserlatitude() {
      return userlatitude;
  }

  public void setUserlatitude(final BigDecimal userlatitude) {
      this.userlatitude = userlatitude;
  }

  public BigDecimal getUserlongitude() {
      return userlongitude;
  }

  public void setUserlongitude(final BigDecimal userlongitude) {
      this.userlongitude = userlongitude;
  }

  public LocalDateTime getPunchtime() {
      return punchtime;
  }

  public void setPunchtime(final LocalDateTime punchtime) {
      this.punchtime = punchtime;
  }

  public String getUseremail() {
      return useremail;
  }

  public void setUseremail(final String useremail) {
      this.useremail = useremail;
  }

    
}