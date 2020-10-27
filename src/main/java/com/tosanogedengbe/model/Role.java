package com.tosanogedengbe.model;

public class Role {

import.......

    /**
     * Role.java
     * This is a model class that represents a role for each user entity
     * @author Tosan Ogedengbe
     *
     */

    @Entity(name = "Role")
    @Table(name = "role")

    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO, generator = "native"
                @GenericGenerator(name = "native", strategy = "native")
        @Column(name = "role_id")
        private int roleId;

        @Column(name = "role")
        private String role;

        @Column(name = "user_name")
        private String userName;


// Constructor to initialize variables.

        public Role() {
            this.roleId = roleId;
            this.role = role;
            this.userName = userName;
        }


// Getters and Setters for instance variables.

        public int getRoleId() {
            return roleId;
        }

        public void setRoleId(int roleId) {
            this.roleId = roleId;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

    }
}
