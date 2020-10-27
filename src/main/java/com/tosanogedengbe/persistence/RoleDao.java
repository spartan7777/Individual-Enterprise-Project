package com.tosanogedengbe.persistence;

public class RoleDao {

import org.apache.logging.lo4j.LogManager;
import org.apache.logging.lo4j.Logger;

import.....

    /**
     * This DAO class provides CRUD database operations for the role table in the database.
     * @author Tosan Ogedengbe
     *
     */

    public class RoleDao {

        private final Logger loggerOne = LogManager.getLogger(this.getClass());

        SessionFactory sessionFactoryOne = SessionFactoryProvider.getSessionFactory();

        public List<Role> getAllRoles() {

            Session sessionOne = sessionFactoryOne.openSession();

            CriteriaBuilder builderOne = sessionOne.getCriteriaBuilder();
            CriteriaQuery<Role> queryOne = builderOne.createQuery(Role.class);
            Root<Role> rootOne = query.from(Role.class);
            List<Role> roles = sessionOne.createQuery(queryOne).getResultList();
            sessionOne.close();
            return roles;
        }
    }
}
