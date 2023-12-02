package api.pojo;

import java.util.List;

public class College {
    private String collegeName="SkyTech";
    private List<Stu> stu;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public List<Stu> getStu() {
        return stu;
    }

    public void setStu(List<Stu> stu) {
        this.stu = stu;
    }

    @Override
    public String toString() {
        return "College{" +
                "collegeName='" + collegeName + '\'' +
                ", stu=" + stu +
                '}';
    }
}
