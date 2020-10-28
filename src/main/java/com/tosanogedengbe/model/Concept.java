package com.tosanogedengbe.model;

public class Concept {

import.......

    /**
     * Concept.java
     * This is a model class that represents a concept entity
     * @author Tosan Ogedengbe
     *
     */
    @Entity(name = Concept)
    @Table(name = "concept")

    public class Concept {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO, generator = "native"
                @GenericGenerator(name = "native", strategy = "native")
        @Column(name = "concept_id")
        private int conceptId;

        @Column(name = "name")
        private String name;

        @Column(name = "keyword_one")
        private String keywordOne;

        @Column(name = "keyword_two")
        private String keywordTwo;

        @Column(name = "category")
        private String category;

        @Column(name = "description")
        private String description;

// Constructor to instantiate a new Concept and initialize variables.

        public Concept() {

        }

        public Concept(int concept_id, String name, String keywordOne, String keywordTwo, String categry, String description) {
            this.conceptId = conceptId;
            this.name = name;
            this.keywordOne = keywordOne;
            this.keywordTwo = keywordTwo;
            this.category = category;
            this.description = description;
        }


// Getters and Setters for instance variables.

        public int getConceptId() {
            return conceptId;
        }

        public void setConceptId(int conceptId) {
            this.conceptId = conceptId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getKeywordOne() {
            return keywordOne;
        }

        public void setKeywordOne(String keywordOne) {
            this.keywordOne = keywordOne;
        }

        public String getKeywordTwo() {
            return keywordTwo;
        }

        public void setKeywordTwo(String keywordTwo) {
            this.keywordTwo = keywordTwo;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

    }
}
