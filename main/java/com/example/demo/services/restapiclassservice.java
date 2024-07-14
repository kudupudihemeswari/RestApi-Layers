package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.models.restapiclass;
import com.example.demo.repository.restapiclassrepository;

    @Service   //step 1

    public class restapiclassservice {

	@Autowired  //step 2
	
	restapiclassrepository repo;   //step 3
	
	public restapiclass insertion(restapiclass rest) {  //step4 insertion   
		
		 return repo.save(rest);     //step5 return type
	}
	
	public Iterable<restapiclass> multiinsertion(List<restapiclass> reg) {     // step6 multiple user , here we used list
		
		
		return repo.saveAll(reg);                    // step7 return type
	}
	
	public List<restapiclass> multifetch(){              //step8 fetching data
		
		return (List<restapiclass>) repo.findAll();       //step9 return type and adding typecast(converting into list)
	}
	
	public Optional<restapiclass> idfetch(int id) {  //step 10 fetch by id
		
		return repo.findById(id);       //step11 covert to optional
	}

	public String delete(int id) {  //step12 delete
		
		repo.deleteById(id);
		
		return "successfully deleted "+id;
	}
	
	public restapiclass update(restapiclass reg) {  //step13 update
		
		return repo.save(reg);
	}
}
