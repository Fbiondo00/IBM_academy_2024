package com.sistemi.informativi.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sistemi.informativi.dto.StudentDTO;

import com.sistemi.informativi.dao.StudentDAO;
import com.sistemi.informativi.dao.StudentDAOImpl;


/*
 * L'annotation @WebServlet serve a mappare l'url
 * pattern della richiesta http proveniente dalla
 * form (url pattern inserito nell'attributo action della
 * form e quindi registration)
 */
@WebServlet("/registration")
public class StudentRegistrationServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 * recupero delle informazioni contenute all'interno
		 * del body della richiesta proveniente dal client
		 * occorre matcharei nomi dei campi della form dalla
		 * quale proviene la richiesta 
		 */
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String age =request.getParameter("age");
		
		/*
		 * ormazione di un Oggetto DTO contenente i dati 
		 * inizialmente provenienti dal client e recuperati
		 * dalla Servlet all'interno del body della richiesta
		 */
		StudentDTO studentDTO = new StudentDTO
				(firstname,lastname,Integer.parseInt(age));
		
		
		StudentDAO studentDAO = new StudentDAOImpl();
		
		try {
			studentDAO.addStudent(studentDTO);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
