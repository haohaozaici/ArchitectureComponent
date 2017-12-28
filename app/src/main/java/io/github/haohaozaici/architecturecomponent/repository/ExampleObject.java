package io.github.haohaozaici.architecturecomponent.repository;

import android.app.Notification;

/**
 * Created by haohao on 2017/12/19.
 */

public class ExampleObject {

  private String name;
  private String age;

  private int math;
  private int la;
  private int en;
  private int ph;

  public static class Builder {

    private String name;
    private String age;

    private int math = 0;
    private int la = 0;
    private int en = 0;
    private int ph = 0;

    public Builder(String name, String age) {
      this.name = name;
      this.age = age;
    }

    public Builder math(int grade) {
      math = grade;
      return this;
    }

    public Builder la(int grade) {
      la = grade;
      return this;
    }

    public Builder en(int grade) {
      en = grade;
      return this;
    }

    public Builder ph(int grade) {
      ph = grade;
      return this;
    }
  }

  private ExampleObject(Builder builder){
    name = builder.name;
    name = builder.name;
    name = builder.name;
    name = builder.name;
    name = builder.name;
    name = builder.name;


  }


}
