import cn.sm1234.domain.Permission;
import cn.sm1234.domain.User;
import cn.sm1234.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author http://www.sm1234.cn
 * @version 1.0
 * @description PACKAGE_NAME
 * @date 18/4/14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindByUsername(){
        User user = userMapper.findByUsername("eric");
        System.out.println(user);
    }

    @Test
    public void testFindPermissionByUsername(){
        List<Permission> list= userMapper.findPermissionByUsername("jack");
        for (Permission perm:list) {
            System.out.println(perm.getPermName()+"-"+perm.getPermTag());
        }
    }

    @Test
    public void testUpdatePassword(){
        User user = new User();
        user.setUsername("jack");
        //哈希算法+加盐
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        user.setPassword(passwordEncoder.encode("123456"));
        userMapper.updatePassword(user);
    }
}
