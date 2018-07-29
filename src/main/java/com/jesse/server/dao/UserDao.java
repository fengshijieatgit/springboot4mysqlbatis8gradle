/**
 * Company
 * Copyright (C) 2004-2018 All Rights Reserved.
 */
package com.jesse.server.dao;

import com.jesse.server.domain.User;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Auser
 * @version $Id UserDao.java, v 0.1 2018-07-24 23:32 Auser Exp $$
 */
@Repository
public class UserDao {
//public class UserDao implements UserMapper {
    private final SqlSession sqlSession;

    public UserDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public User selectByPrimaryKey(Integer userId) {
        return this.sqlSession.selectOne("com.jesse.server.dao.UserMapper".concat(".selectByPrimaryKey"), userId);
    }

//    @Override
//    public int deleteByPrimaryKey(Integer userId) {
//        return 0;
//    }
//
//    @Override
//    public int insert(User record) {
//        return 0;
//    }
//
//    @Override
//    public int insertSelective(User record) {
//        return 0;
//    }
//
//    @Override
//    public int updateByPrimaryKeySelective(User record) {
//        return 0;
//    }
//
//    @Override
//    public int updateByPrimaryKey(User record) {
//        return 0;
//    }
}