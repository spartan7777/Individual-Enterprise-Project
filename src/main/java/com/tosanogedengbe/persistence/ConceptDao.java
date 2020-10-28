package com.tosanogedengbe.persistence;

import com.tosanogedengbe.model.Concept;
import org.apache.logging.lo4j.LogManager;
import org.apache.logging.lo4j.Logger;

import java.util.List;


/**
     * This DAO class provides CRUD database operations for the concept table in the database.
     * @author Tosan Ogedengbe
     *
     */

    public class ConceptDao {

        private final Logger loggerOne = LogManager.getLogger(this.getClass());

        SessionFactory sessionFactoryOne = SessionFactoryProvider.getSessionFactory();


        public List<Concept> getAllConcepts() {

            Session sessionOne = sessionFactoryOne.openSession();

            CriteriaBuilder builderOne = sessionOne.getCriteriaBuilder();
            CriteriaQuery<Concept> queryOne = builderOne.createQuery(Concept.class);
            Root<Concept> rootOne = query.from(Concept.class);
            List<Concept> concepts = sessionOne.createQuery(queryOne).getResultList();
            sessionOne.close();
            return concepts;
        }

        public List<Concept> getAllConceptsByCategory(String category) {

            Session sessionOne = sessionFactoryOne.openSession();

            CriteriaBuilder builderOne = sessionOne.getCriteriaBuilder();
            CriteriaQuery<Concept> queryOne = builderOne.createQuery(Concept.class);
            Root<Concept> rootOne = query.from(Concept.class);
            Expression<String> propertyPath = rootOne.get("category");
            queryOne.where(builderOne.like(propertyPath, "%" + value + "%"));
            List<Concept> concepts = sessionOne.createQuery(queryOne).getResultList();
            sessionOne.close();
            return concepts;
        }

        public Concept getConceptsById(int concept_id) {

            Session sessionOne = sessionFactoryOne.openSession();

            Concept concept = sessionOne.get(Concept.class, id);
            sessionOne.close();
            return concept;
        }

}


