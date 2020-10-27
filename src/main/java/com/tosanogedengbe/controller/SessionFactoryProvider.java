package com.tosanogedengbe.controller;

public class SessionFactoryProvider {

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

    /**
     * SessionFactoryProvider.java
     * This file provides a SessionFactory for use with DAOs using Hibernate
     * @author Tosan Ogedengbe
     *
     */

    public class SessionFactoryProvider {

        private static SessionFactory sessionFactoryOne;


        private SessionFactoryProvider() {

        }

        public static void createSessionFactory() {

            StandardServiceRegistry standardRegistryOne =
                    new StandardServiceRegistryBuilder().configure().build();

            Metadata metadataOne =
                    new MetadataSources(standardRegistry).getMetadataBuilder().build();

            sessionFactoryOne = metadataOne.getSessionFactoryBuilder().build();

        }

        public static SessionFactory getSessionFactory() {
            if (sessionFactory == null) {
                createSessionFactory();
            }

            return SessionFactory;

        }
    }
}
