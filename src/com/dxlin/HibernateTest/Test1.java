package com.dxlin.HibernateTest;

import com.dxlin.Beans.User;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class Test1 {
    public static HibernateTemplate hibernateTemplate;

    public static HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public static void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        Test1.hibernateTemplate = hibernateTemplate;
    }

    public static void main(String args[]){
        if(getHibernateTemplate()!=null){
            System.out.println("OK");
        }
        User user = (User)hibernateTemplate.get(User.class,1);
        System.out.println(user.toString());
    }
}
