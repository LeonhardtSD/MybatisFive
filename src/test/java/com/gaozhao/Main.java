package com.gaozhao;

import com.gaozhaoxi.db.DBUtil;
import com.gaozhaoxi.entity.Province;
import com.gaozhaoxi.entity.User;
import com.gaozhaoxi.mapper.ProvinceMapper;
import com.gaozhaoxi.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author Leon
 */
public class Main {
    @Test
    public void test(){
        SqlSession sqlSession=null;
        try {
            sqlSession= DBUtil.openSession();
            UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
            User user=userMapper.getUserById(1L);
            System.out.println(user.toString());
            sqlSession.commit();

        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
    }
    @Test
    public void test2(){
        SqlSession sqlSession=null;
        try {
            sqlSession= DBUtil.openSession();
            ProvinceMapper provinceMapper=sqlSession.getMapper(ProvinceMapper.class);
            List<Province> list=provinceMapper.getProvince();
            System.out.println(list.toString());
            sqlSession.commit();

        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }

    }
    @Test
    public void test3(){
        SqlSession sqlSession=null;
        try {
            sqlSession= DBUtil.openSession();
            ProvinceMapper provinceMapper=sqlSession.getMapper(ProvinceMapper.class);
            List<Province> list=provinceMapper.getProvince();
            System.out.println(list.toString());
            sqlSession.commit();

        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }

    }
}
