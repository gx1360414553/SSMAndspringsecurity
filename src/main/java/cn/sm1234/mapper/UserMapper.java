package cn.sm1234.mapper;

import cn.sm1234.domain.Permission;
import cn.sm1234.domain.User;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

/**
 * @author http://www.sm1234.cn
 * @version 1.0
 * @description cn.sm1234.mapper
 * @date 18/4/14
 */
public interface UserMapper {
    /**
     * 查询当前用户对象
     */
    public User findByUsername(String username);

    /**
     * 查询当前用户拥有的权限
     */
    public List<Permission> findPermissionByUsername(String username);

    /**
     * 修改密码
     */
    public void updatePassword(User user);
}
