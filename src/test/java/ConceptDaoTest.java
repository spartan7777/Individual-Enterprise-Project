public class ConceptDaoTest {

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

    /**
     * This DAO class provides CRUD database operations for the concept table in the database.
     * @author Tosan Ogedengbe
     *
     */

    public class ConceptDaoTest {

        ConceptDao dao;

        /**
         * Verify successful creation of new dao
         */
        @BeforeEach
        void setUp() {

            dao = new ConceptDao();

            Database database = Database.getInstance();
            database.runSQL("cleandb.sql");

        }

        /**
         * Verify successful retrieval of all concepts
         */
        @Test
        void getAllConceptsSuccess() {
            List<Concept> concepts = dao.getAllConcepts();
            assertEquals(6, concepts.size());
        }

        /**
         * Verify successful retrieval of concepts by category
         */
        @Test
        void getConceptsByCategorySuccess() {
            List<Concept> concepts = dao.getAllConceptsByCategory("");
            assertEquals(6, concepts.size());
        }

        /**
         * Verify successful retrival of concept by Id
         */
        @Test
        void getConceptsByIdSuccess() {
            Concept collectedConcept = dao.getById();
            assetNotNull(collectedConcept);
            assertEquals("somethng expecteds", collectedConcept.getConceptName());
        }

        /**
         * Verify successful insertion of concept
         */
        @Test
        void insertSuccess() {
            Concept newConcept = new Concept();
            int concept_id = dao.insert(newConcept);
            assertNotEquals(0, concept_id);
            Concept insertedConcept = dao.getById(concept_id);
            assertEquals("somethng expecteds", insertedConcept.getName());
        }

        /**
         * Verify successful deletion of concept
         */
        @Test
        void deleteSuccess() {
            dao.delete(dao.getById(3));
            assertNull(dao.getById(3));
        }

        /**
         * Verify successful update of concept
         */
        @Test
        void updateSuccess() {
            String newName = "Wookie";
            Concept conceptToUpdate = dao.getById(3);
            conceptToUpdate.setName(newName);
            dao.saveOrUpdate(conceptToUpdate);
            Concept collectedConcept = dao.getById(3);
            assertEquals(newName, collectedConcept.getName());
        }

        /**
         * Verify successful get by property (equal match)
         */
        @Test
        void getByPropertyEqualSuccess() {
            List<Concept> concepts = dao.getPropertyLike("name", "Wookie");
            assertEquals(1, concepts.size());
            assertEquals(3, concepts.get(0).getId()):
        }

        /**
         * Verify successful get by property (like match)
         */
        @Test
        void getByPropertyLikeSuccess() {
            List<Concept> concepts = dao.getPropertyLike("name", "W");
            assertEquals(3, concepts.size());
        }

    }
}
