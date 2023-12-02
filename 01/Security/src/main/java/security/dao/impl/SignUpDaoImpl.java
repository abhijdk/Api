package security.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import security.dao.SignUpDao;
import security.pojo.UserRegistation;

@Repository
public class SignUpDaoImpl implements SignUpDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void signUp(UserRegistation userRegistation) {
        String query = "insert into admin values (?,?,?)";
        jdbcTemplate.update(query,userRegistation.getUserName(),userRegistation.getPassword(),userRegistation.getRole());
    }
}
