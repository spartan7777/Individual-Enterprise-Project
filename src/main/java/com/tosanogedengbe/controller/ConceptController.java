package com.tosanogedengbe.controller;

public class ConceptController {

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

    /**
     * ConceptController.java
     * This servlet acts as a page controller for the application, handling all requests from the user.
     * @author Tosan Ogedengbe
     */

    @WebServlet(url patterns = {"/ConceptCompendium"})
    @WebServlet("/ConceptCompendium")

    public class ConceptController extends HttpServlet {

        private ConceptDao conceptDaoOne;

        public void init() {
            conceptDaoOne; = new ConceptDao();

        }

        protected void doPost(HttpServletRequest requestOne, HttpServletResponse responseOne)
                throws ServletException, IOException {
            register(requestOne, responseOne);
        }

        protected void doGet(HttpServletRequest requestOne, HttpServletResponse responseOne)
                throws ServletException, IOException {
            responseOne.sendRedirect("");
        }

            protected void register (HttpServletRequest requestOne, HttpServletResponse responseOne)
        throws ServletException, IOException {
                int conceptId = requestOne.getParameter("concept_id");
                String name = requestOne.getParameter("name");
                String keywordOne = requestOne.getParameter("keywordOne");
                String keywordTwo = requestOne.getParameter("keywordTwo");
                String category = requestOne.getParameter("category");
                String description = requestOne.getParamter("description");
        }
}