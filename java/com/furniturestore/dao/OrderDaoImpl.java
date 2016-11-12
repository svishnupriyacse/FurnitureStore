package com.furniturestore.dao;

import com.furniturestore.dao.OrderDao;
import com.furniturestore.model.UserOrder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository
@Transactional
public class OrderDaoImpl implements OrderDao{

        @Autowired
        private SessionFactory sessionFactory;

        public void addOrder(UserOrder userOrder) {
            Session session = sessionFactory.getCurrentSession();
            session.saveOrUpdate(userOrder);
            session.flush();
        }
}
