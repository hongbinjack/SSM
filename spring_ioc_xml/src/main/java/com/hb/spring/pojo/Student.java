package com.hb.spring.pojo;

import java.util.Map;

public class Student implements Person {
    private Integer sid;
    private String name;
    private Integer age;
    private String gender;
private double score;
private Hobby hobby;
private Classes classes;
private Map<String,Teacher> teacherMap;
    public Student() {
    }

    public Student(Integer sid, String name, String gender, Integer age) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public Student(Integer sid, String name, String gender, double score) {
        this.sid = sid;
        this.name = name;
        this.gender = gender;
        this.score = score ;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getScore() { return score; }

    public void setScore(double score) { this.score = score; }

    public Classes getClasses() { return classes; }

    public void setClasses(Classes classes) { this.classes = classes; }

    public Hobby getHobby() { return hobby; }

    public void setHobby(Hobby hobby) { this.hobby = hobby; }

    public Map<String, Teacher> getTeacherMap() { return teacherMap; }

    public void setTeacherMap(Map<String, Teacher> teacherMap) { this.teacherMap = teacherMap; }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                ", hobby=" + hobby +
                ", classes=" + classes +
                ", teacherMap=" + teacherMap +
                '}';
    }
}
