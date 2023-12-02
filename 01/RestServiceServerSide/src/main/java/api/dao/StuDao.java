package api.dao;

import api.pojo.Stu;

import java.util.List;

public interface StuDao {
    public List<Stu> getAllStudent();
    public Stu getSingleStudent(int id);
    public void insert(Stu stu);

    public void update(Stu stu);

    public void delete(int id);
}
