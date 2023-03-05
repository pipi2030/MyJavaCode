package cn.kgc.entity;

public class Exam {
    private String cname;
    private String tname;
    private Integer sNo;
    private String sname;
    private String ssex;
    private String classNo;
    private String examPlace;
    private Integer seatNo;

    public Exam() {
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Integer getsNo() {
        return sNo;
    }

    public void setsNo(Integer sNo) {
        this.sNo = sNo;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public String getExamPlace() {
        return examPlace;
    }

    public void setExamPlace(String examPlace) {
        this.examPlace = examPlace;
    }

    public Integer getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(Integer seatNo) {
        this.seatNo = seatNo;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "cname='" + cname + '\'' +
                ", tname='" + tname + '\'' +
                ", sNo=" + sNo +
                ", sname='" + sname + '\'' +
                ", ssex='" + ssex + '\'' +
                ", classNo=" + classNo +
                ", examPlace='" + examPlace + '\'' +
                ", seatNo=" + seatNo +
                '}';
    }
}
