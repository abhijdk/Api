package api.dao.impl;

import api.dao.StuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import api.pojo.Stu;
import org.springframework.stereotype.Repository;

import java.util.List;
//@Repository
public class StuDaoImpl implements StuDao {
//@Autowired
private JdbcTemplate jdbcTemplate;
    @Override
    public List<Stu> getAllStudent() {
        String query = "select * from stu";
        return jdbcTemplate.query(query,new BeanPropertyRowMapper<Stu>(Stu.class));
    }

    @Override
    public Stu getSingleStudent(int id) {
        String query = "select * from stu where id=?";
        return jdbcTemplate.queryForObject(query,new BeanPropertyRowMapper<>(Stu.class),id);
    }

    @Override
    public void insert(Stu stu) {
        String query = "insert into stu values(?,?)";
        jdbcTemplate.update(query,stu.getId(),stu.getName());
    }

    @Override
    public void update(Stu stu) {
        String query = "UPDATE stu SET  name=? WHERE id=?";
        jdbcTemplate.update(query,stu.getName(),stu.getId());
    }

    @Override
    public void delete(int id) {
        String query = "delete from stu where id=?";
        jdbcTemplate.update(query,id);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
