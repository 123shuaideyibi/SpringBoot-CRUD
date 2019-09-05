package com.ev.loudishi.dao;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTests {

    /**
     * @Autowired （这个注解属于spring），默认按类型装配，默认情况下要求依赖对象必须存在，如果要允许null值，
     * 可以设置它的require属性为false，如:@Autowired(require=false)，如果我们想使用命名成装配结合@Qualifiter
     * 注解进行使用
     * @Resource （这个注解属于J2EE），默认按名称装配，名称可以通过name属性进行指定，如果没有指定name属性，
     * 当注解写在字段上时，默认取字段名进行安装名称查找，如果注解写在setter方法上默认属性名进行装配。
     * 当找不到与名称匹配的bean时才按照类型进行装配。但是需要注意的是，如果name属性一旦指定，就只会按照名称进行装配
     */
//    @Autowired(required = false)
    @Resource
    private UserMapper userMapper;

    /*==============================增====================================*/

    /**
     * 插入数据username和password
     */
    @Test
    public void insert() {
        String username = "zhaoyun";
        String password = "888";
        System.out.println(userMapper.insert(username, password));
    }

    /*===============================删===================================*/

    /**
     * 通过id删除
     */
    @Test
    public void delete() {
        int id = 10;
        System.out.println(userMapper.delete(id));
    }

    /**
     * 通过username删除
     */
    @Test
    public void delete2() {
        String username = "赵云";
        System.out.println(userMapper.delete2(username));
    }

    /*=================================改================================*/

    /**
     * 通过username修改password
     */
    @Test
    public void update() {
        String username = "zhaoyun";
        String password = "987";
        System.out.println(userMapper.update(username, password));
    }

    /**
     * 通过id修改User
     */
    @Test
    public void updata2() {
        int id = 2;
        String username = "zhaosi";
        String password = "111";
        System.out.println(userMapper.update2(id, username, password));
    }

    /*=================================查================================*/

    /**
     * 通过id查询
     */
    @Test
    public void select() {
        int id = 1;
        System.out.println(userMapper.select((id)));//[User{id=1, username='zhangsan', password='123'}]
    }

    /**
     * 通过username查询password
     */
    @Test
    public void select2() {
        System.out.println("通过username获取到的password为：" + userMapper.select2("zhangsan"));
    }

}
