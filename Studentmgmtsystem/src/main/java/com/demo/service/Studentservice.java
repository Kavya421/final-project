package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.model.Studentdata;
import com.demo.repository.Studentrepository;

@Service
public class Studentservice 
{
	@Autowired
    private Studentrepository repo;
public List<Studentdata> listAll() 
{
        return repo.findAll();
    }
    
    public void save(Studentdata std)
    {
        repo.save(std);
    }
    
    public Studentdata get(long id) 
    {
        return repo.findById(id).get();
    }
    
    public void delete(long id) 
    {
        repo.deleteById(id);
    }
 
	

}
