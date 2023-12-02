package api.service.impl;

import api.dao.StuDao;
import api.pojo.Stu;
import api.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//@Service
public class StuServiceImpl implements StuService {
//    @Autowired
    private StuDao stuDao;
    @Override
    public List<Stu> getAllStudent() {
        return stuDao.getAllStudent();
    }

    @Override
    public Stu getSingleStudent(int id) {
        return stuDao.getSingleStudent(id);
    }

    @Override
    public void insert(Stu stu) {
        stuDao.insert(stu);
    }

    @Override
    public void update(Stu stu) {
        stuDao.update(stu);

    }


    public void delete(int id) {
        stuDao.delete(id);
    }

    public StuDao getStuDao() {
        return stuDao;
    }

    public void setStuDao(StuDao stuDao) {
        this.stuDao = stuDao;
    }
}
