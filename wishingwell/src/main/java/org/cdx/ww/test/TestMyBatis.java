package org.cdx.ww.test;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.cdx.ww.dao.AccountMapper;
import org.cdx.ww.entity.Account;

public class TestMyBatis {

    public static void main(String[] args) throws IOException {
        //mybatis的配置文件
        String resource = "conf.xml";
        //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        //InputStream is = TestMyBatis.class.getClassLoader().getResourceAsStream(resource);
        //构建sqlSession的工厂
        //SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        //使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader(resource); 
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中sql的sqlSession
        SqlSession session = sessionFactory.openSession();
        /**
         * 映射sql的标识字符串，
         * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
         * getUser是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
        String statement = "org.cdx.ww.dao.AccountMapper.getAccount";//映射sql的标识字符串
        //执行查询返回一个唯一user对象的sql
        Account user = session.selectOne(statement, 1);
        List<Account> list = session.selectList(statement, 1);
        System.out.println(user);
        System.out.println(list);
        
        AccountMapper am = session.getMapper(AccountMapper.class);
        Account a = am.getAccount(1);
        System.out.println("Another way to get account =" + a);
    }

}
