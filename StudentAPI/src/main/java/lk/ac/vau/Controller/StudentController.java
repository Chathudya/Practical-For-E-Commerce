package lk.ac.vau.Controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.Student;

@RestController
@RequestMapping("/student")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public class StudentController extends BaseController<Student>{

	public StudentController() {
		 Student james = new Student("2018-ICT-01","James Paul",25,"IT",3.0);
		 Student ravi = new Student("2018-ICT-02","Raviram",26,"IT",3.3);
		 Student mala = new Student("2018-ICT-03","Malathi",25,"IT",3.7);
		 data.put(james.getId(),james);
		 data.put(ravi.getId(),ravi);
		 data.put(mala.getId(),mala);
	 }

}


















