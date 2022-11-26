package com.hb.spring.pojo;

import java.util.List;

public class Classes {
    private Integer cid;
    private String cname;

    private List<Student> students;
    public Classes() {
    }

    public Classes(Integer cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public Integer getCid() { return cid; }

    public void setCid(Integer cid) { this.cid = cid; }

    public String getCname() { return cname; }

    public void setCname(String cname) { this.cname = cname; }

    public List<Student> getStudents() { return students; }

    public void setStudents(List<Student> students) { this.students = students; }

    @Override
    public String toString() {
        return "Classes{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", students=" + students +
                '}';
    }
}
