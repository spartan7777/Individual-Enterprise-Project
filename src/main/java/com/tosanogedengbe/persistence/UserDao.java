package com.tosanogedengbe.persistence;

public class UserDao {

import org.apache.logging.lo4j.LogManager;
import org.apache.logging.lo4j.Logger;

import....

    /**
     * This DAO class provides CRUD database operations for the user table in the database.
     * @author Tosan Ogedengbe
     *
     */

    public class UserDao {

        private final Logger loggerOne = LogManager.getLogger(this.getClass());

        SessionFactory sessionFactoryOne = SessionFactoryProvider.getSessionFactory();

        public List<User> getAllUsers() {

            Session sessionOne = sessionFactoryOne.openSession();

            CriteriaBuilder builderOne = sessionOne.getCriteriaBuilder();
            CriteriaQuery<User> queryOne = builderOne.createQuery(User.class);
            Root<User> rootOne = query.from(User.class);
            List<User> users = sessionOne.createQuery(queryOne).getResultList();
            sessionOne.close();
            return users;
        }

        public List<User> getAllUsersByLastName(String lastName) {

            Session sessionOne = sessionFactoryOne.openSession();

            CriteriaBuilder builderOne = sessionOne.getCriteriaBuilder();
            CriteriaQuery<User> queryOne = builderOne.createQuery(User.class);
            Root<User> rootOne = query.from(User.class);
            Expression<String> propertyPath = rootOne.get("lastName");
            queryOne.where(builderOne.like(propertyPath, "%" + value + "%"));
            List<User> users = sessionOne.createQuery(queryOne).getResultList();
            sessionOne.close();
            return users;
        }

        public User getUsersById(int user_id) {

            Session sessionOne = sessionFactoryOne.openSession();

            User userOne = sessionOne.get(User.class, user_id);
            sessionOne.close();
            return userOne;
        }

    }

}
