package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Speaker;

public class HibernateSpeakerRepoImpl implements SpeakerRepository {
	
	
	@Override
	public List<Speaker> findAll() {
		
		List<Speaker> speakers = new ArrayList<Speaker>();
		Speaker speaker = new Speaker();

		speaker.setFirstName("Ram ");
		speaker.setLastName("Yewale");

		speakers.add(speaker);
		
		return speakers;
	}
}
