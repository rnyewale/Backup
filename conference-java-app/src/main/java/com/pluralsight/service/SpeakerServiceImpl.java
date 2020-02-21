package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepoImpl;
import com.pluralsight.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {

	
	private SpeakerRepository repository = new HibernateSpeakerRepoImpl();
	
	@Override
	public List<Speaker> findList(){
		return repository.findAll();
	}
}
