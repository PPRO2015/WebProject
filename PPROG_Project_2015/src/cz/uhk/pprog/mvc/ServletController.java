package cz.uhk.pprog.mvc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletController")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public List<ProjectModel> smena = new ArrayList();
    
    public ServletController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adresa = request.getServletPath();
		
		ProjectModel smena = new ProjectModel();
		String name = request.getParameter("name");
		String team = request.getParameter("team");
		String workHour = request.getParameter("workHour");
		String workHourUntil = request.getParameter("workHourUntil");
		smena.setName(name);
		smena.setTeam(team);
		smena.setWorkHour(workHour);
		smena.setWorkHourUntil(workHourUntil);
		
			if(adresa.equals("/smena")) { //z tutoriálu èasem dopracovat
				request.setAttribute("smena", smena);
			    request.getRequestDispatcher("/WEB-INF/ProjectView.jsp").forward(request, response);//jiný tutoriál http://www.tutorialspoint.com/spring/spring_quick_guide.htm
			}
			else if(adresa.equals("/upravit")){
				
			}
			else{
				response.sendError(HttpServletResponse.SC_NOT_FOUND);
			}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	        					throws ServletException, IOException {
	    String adresa = request.getServletPath();
	    request.setCharacterEncoding("UTF-8");
	    if(adresa.equals("/pridat")) {
	        // TODO: kód pro zapsání nového zápisku do seznamu
	    }
	    else if(adresa.equals("/ulozitupravy")){
	        // TODO: kód pro uložení úprav provedených na zápisku
	    }
	    else {
	        response.sendError(HttpServletResponse.SC_NOT_FOUND);
	    }
	}}

