package com.tosanogedengbe.model;

import.......

    /**
     * Role.java
     * This is a model class that represents a role for each user entity
     * @author Tosan Ogedengbe
     *
     */

    @Entity(name = "Role")
    @Table(name = "role")
    public class Role {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO, generator = "native"
                @GenericGenerator(name = "native", strategy = "native")
        private int roleId;

        @ManyToOne
        @JoinColumn(name = "user_id",
            foreignKey = @ForeignKey(name = "role_user_user_id")

        private User user;

        @Column(name = "role")
        private String role;

        @Column(name = "user_name")
        private String userName;


// Constructor to initialize variables.
        public Role() {

        }

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
