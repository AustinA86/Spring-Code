package com.example.student.controller;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;
	import com.example.student.entity.Student;
	import com.example.student.repository.StuRepo;
	import java.util.List;
	@RestController
	public class StudentController {
		@Autowired
		private StuRepo repo;
		
	@PostMapping("/add")
		public String saveStudent(@RequestBody Student student){
			repo.save(student);
			return "Added Successfully";
		}
	@GetMapping("/find")
		public List<Student> getStudent() {
			return repo.findAll();
		}
	@DeleteMapping("/delete/{id}")
		public String deleteStudent(@PathVariable int id){
			repo.deleteById(id);
			return "Deleted Successfully";
		}	
	@PutMapping("/update/{id}")
	public String updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
	    Student existingStudent = repo.findById(id).orElse(null);
	    if (existingStudent != null) {
	        // Update the existing student record with the values from the updatedStudent object
	        existingStudent.setName(updatedStudent.getName());
	        existingStudent.setRegNo(updatedStudent.getRegNo());
	        existingStudent.setBranch(updatedStudent.getBranch());

	        // Save the updated student record back to the repository
	        repo.save(existingStudent);
	        return "Updated Successfully";
	    } else {
	        return "Student not found with id: " + id;
	    }
	}

	}


