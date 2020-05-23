package cn.fy;

import cn.fy.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = IdeaspringbootApplication.class)
 public  class IdeaspringbootApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void name() {
    }
}
