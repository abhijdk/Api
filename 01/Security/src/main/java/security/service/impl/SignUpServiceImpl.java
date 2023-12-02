package security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;
import security.dao.SignUpDao;
import security.pojo.UserRegistation;
import security.service.SignUpService;

@Service
public class SignUpServiceImpl implements SignUpService {
    @Autowired
    private SignUpDao signUpDao;
    @Override
    public void signUp(UserRegistation userRegistation) {

        int size=12;
        String salt= BCrypt.gensalt(size);
        String bcrypt=BCrypt.hashpw(userRegistation.getPassword(),salt);
        userRegistation.setPassword(bcrypt);

        signUpDao.signUp(userRegistation);
    }
}
