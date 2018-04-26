package com.study.rocky.study20180426.bean;


public class AlibabaBean {

    private String name;
    private String sex;

    public AlibabaBean(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "AlibabaBean{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
