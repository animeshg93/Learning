package com.animesh.spring.model;

public class Paddle {
  private String type;
  private String rubber;


  public Paddle(){
      this("pimple", "procarbon");
  }
  private Paddle(String rubber, String type) {
      this.rubber = rubber;
      this.type = type;
  }

  public String getRubber() {
    return rubber;
  }

  public void setRubber(String rubber) {
    this.rubber = rubber;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
