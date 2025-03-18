package com.rest.api.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.entity.JournalEntry;
import java.util.*;

@RestController
@RequestMapping("/journalapplication")
public class JournalController 
{
	
	private Map<Long, JournalEntry> journalDetail = new HashMap<>();
	//add data on journalDetail
	
	
	//getting all details
	@GetMapping("/detail")
	public List<JournalEntry> getJournalDetail()
	{
		return new ArrayList<>(journalDetail.values());
	}
	
	//getting specific details by id
	@GetMapping("/id/{myId}")
	public JournalEntry getJournalDetails(@PathVariable long myId)
	{
		return journalDetail.get(myId);
	}
	
	//Posting data into JournalEntry
	@PostMapping("/detail")
	public void postJournalDetail(@RequestBody JournalEntry entry)
	{
		journalDetail.put(entry.getId(), entry);
	}
	
	//Delete specific data from JournalEntry
	@DeleteMapping("/id/{myId}")
	public boolean deleteJournalDetail(@PathVariable long id)
	{
		journalDetail.remove(id);
		return true;
	}
	
	//Update some data 
	@PutMapping("/id/{myId}")
	public JournalEntry putJournalDetail(@PathVariable long id, @RequestBody JournalEntry entry)
	{
		return journalDetail.put(id, entry);
	}

}
