package cn.yangjrun.bookkeeping.service.impl;

import cn.yangjrun.bookkeeping.dao.UserDao;
import cn.yangjrun.bookkeeping.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IUserServiceImplTest {

    @Autowired
    private UserDao userDao;

    @Test
    void testList(){

        List<User> userList = userDao.selectList(null);
        userList.forEach(System.out::println);

    }


}
