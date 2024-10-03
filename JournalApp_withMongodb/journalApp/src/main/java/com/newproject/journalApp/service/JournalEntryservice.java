package com.newproject.journalApp.service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newproject.journalApp.Entity.JournalEntry;
import com.newproject.journalApp.repository.JournalEntryRepo;

@Service
public class JournalEntryservice {
	
	@Autowired
	private JournalEntryRepo journalEntryRepo;
	
	public void saveEntry(JournalEntry journalEntry) {
		journalEntryRepo.save(journalEntry);
		
	}
	public List<JournalEntry> getAll(){
		return journalEntryRepo.findAll();
	}
	
	public Optional<JournalEntry> findById(ObjectId myid){
		return journalEntryRepo.findById(myid);		
		
	}
    public void deleteById(ObjectId myid) {
    	journalEntryRepo.deleteById(myid);
		
	}
}
