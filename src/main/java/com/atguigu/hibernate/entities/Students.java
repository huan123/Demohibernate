package com.atguigu.hibernate.entities;

import java.util.Date;

/**
 * Created by huan on 2015/5/19.
 */
public class Students {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String name;
    private  Date date;

    public  Date getDate()
    {
        return date;
    }

    public  void setDate(Date date)
    {
        this.date = date;
    }
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    private String pwd;

    public Students()
    {

    }

    public Students(String name, String pwd)
    {
        this.pwd = pwd;
        this.name = name;
    }

    public  void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public  String toString()
    {
        return "Students{"+"id="+id+",name"+name+",pwd"+pwd+",时间"+date+"}";
    }
}
