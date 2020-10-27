package com.tosanogedengbe.model;

public class User {

import.......

    /**
     * User.java
     * This is a model class that represents a user entity
     * @author Tosan Ogedengbe
     *
     */

    @Entity(name = "User")
    @Table(name = "user")

    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO, generator = "native"
                @GenericGenerator(name = "native", strategy = "native")
        @Column(name = "user_id")
        private int userId;

        @Column(name = "first_name")
        private String firstName;

        @Column(name = "last_name")
        private String lastName;

        @Column(name = "user_name")
        private String userName;

        @Column(name = "password")
        private String password;


// Constructor to initialize variables.

        public User(int user_id, String firstName, String lastName, String userName, String password) {
            this.userId = userId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.userName = userName;
            this.password = password;
        }


// Getters and Setters for instance variables.

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

    }

}
