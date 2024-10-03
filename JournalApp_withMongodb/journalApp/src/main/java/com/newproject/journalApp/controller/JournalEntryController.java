package com.newproject.journalApp.controller;

import java.time.LocalDateTime;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newproject.journalApp.Entity.JournalEntry;
import com.newproject.journalApp.service.JournalEntryservice;


@RestController
@RequestMapping("/journal")
public class JournalEntryController {
	
	@Autowired
	private JournalEntryservice journalEntryservice;
	
	@GetMapping
	public List<JournalEntry> getAll(){
		return journalEntryservice.getAll();		
	}
	@GetMapping("id/{myid}")
	public JournalEntry getJournalEntryById(@PathVariable ObjectId myid){
		return journalEntryservice.findById(myid).orElse(null);
	}

	@PostMapping
	public JournalEntry createEntry(@RequestBody JournalEntry myEntry) {
		myEntry.setDate(LocalDateTime.now());
		journalEntryservice.saveEntry(myEntry);
		return myEntry;
		
	}
	@DeleteMapping("id/{myid}")
	public boolean deleteJournalEntryById(@PathVariable ObjectId myid){
		journalEntryservice.deleteById(myid);
		return true;		
	}
	
	@PutMapping("id/{myid}")
	public JournalEntry updateEntry(@PathVariable ObjectId myid,@RequestBody JournalEntry newEntry){	
		JournalEntry old= journalEntryservice.findById(myid).orElse(null);
		if(old != null) {
			old.setTitle(newEntry.getTitle().equals("")? newEntry.getTitle():old.getTitle());
			old.setContent(newEntry.getContent().equals("")? newEntry.getContent():old.getContent());
		}
		journalEntryservice.saveEntry(old);
		return newEntry;
		
	}

}
