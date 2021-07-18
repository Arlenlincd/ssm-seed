package com.arlin.dao;

import com.arlin.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: UserDao
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/7/18
 */
@Repository
public interface UserDao {

    List<User> selectAllUser();
}
