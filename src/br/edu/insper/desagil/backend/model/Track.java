package br.edu.insper.desagil.backend.model;

public class Track {
	private Artist artist;
	private String name;
	private int duration;
	
	public Track(Artist artist, String name, int duration) {
		this.artist = artist;
		this.name = name;
		this.duration = duration;
	}

	public Artist getArtist() {
		return artist;
	}

	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}
	
	public String getDurationString() {
		int seconds = this.duration;
		int minutes = 0;
		String total;
		while(seconds>=60) {
			minutes += 1;
			seconds -= 60;
		}
		if (seconds<10) {
			total = minutes +":0"+seconds;
		}
		else {
			total = minutes+":"+seconds;
		}
		return total; 
	}
	public String getFullArtistName() {
		return name;
	}
}
