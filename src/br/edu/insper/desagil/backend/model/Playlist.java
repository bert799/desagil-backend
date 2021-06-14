package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Playlist {
	private int id;
	private List<Track> tracks;
	private Map<String, Integer> ratings;
	public Playlist(int id) {
		this.id = id;
		this.tracks = new ArrayList<>();
		this.ratings = new HashMap<>();
	}
	public int getId() {
		return id;
	}
	public List<Track> getTracks() {
		return tracks;
	}
	public Map<String, Integer> getRatings() {
		return ratings;
	}
	
	public void addTrack(Track track) {
		this.tracks.add(track);
	}
	
	public void putRating(String name ,int rating) {
		ratings.put(name, rating);
	}
	public double averageRatings() {
		double average = 0;
		int counter = 0;
		for (String key: this.ratings.keySet()) {
			average += this.ratings.get(key);
			counter ++;
		}
		average = (double)average / counter;
		int integer = (int) average;
		double fraction = average - integer;
		if(fraction<0.26) {
			fraction = 0.0;
		}
		else if(fraction>0.26 && (fraction<0.74)) {
			fraction = 0.5;
		}
		else {
			fraction = 1.0;
		}
		average = integer + fraction;
		return average;
		
	}
}
