package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrackTest {
	private Artist artist;
	@BeforeEach
	void setUp() {
		artist = new Artist("Anitta");
	}

	@Test
	void testZeroSeconds() {
		Track track = new Track(artist, "tentacion", 0);
		assertEquals(track.getDurationString(), "0:00");
	}

	@Test
	void testFiveSeconds() {
		Track track = new Track(artist, "tentacion", 5);
		assertEquals(track.getDurationString(), "0:05");
	}

	@Test
	void testTwentyFiveSeconds() {
		Track track = new Track(artist, "tentacion", 25);
		assertEquals(track.getDurationString(), "0:25");
	}

	@Test
	void testOneMinuteZeroSeconds() {
		Track track = new Track(artist, "tentacion", 60);
		assertEquals(track.getDurationString(), "1:00");
	}

	@Test
	void testOneMinuteFiveSeconds() {
		Track track = new Track(artist, "tentacion", 65);
		assertEquals(track.getDurationString(), "1:05");
	}

	@Test
	void testOneMinuteTwentyFiveSeconds() {
		Track track = new Track(artist, "tentacion", 85);
		assertEquals(track.getDurationString(), "1:25");
	}

	@Test
	void testTwoMinutesZeroSeconds() {
		Track track = new Track(artist, "tentacion", 120);
		assertEquals(track.getDurationString(), "2:00");
	}

	@Test
	void testTwoMinutesFiveSeconds() {
		Track track = new Track(artist, "tentacion", 125);
		assertEquals(track.getDurationString(), "2:05");
	}

	@Test
	void testTwoMinutesTwentyFiveSeconds() {
		Track track = new Track(artist, "tentacion", 145);
		assertEquals(track.getDurationString(), "2:25");
	}

	@Test
	void testOneCollaborator() {
		CollaborationTrack collabTrack = new CollaborationTrack(artist, Arrays.asList(new Artist("Becky G")), "Banana", 195);
		assertEquals("Anitta (feat. Becky G)", collabTrack.getFullArtistName());
	}

	@Test
	void testTwoCollaborators() {
		CollaborationTrack collabTrack = new CollaborationTrack(artist, Arrays.asList(new Artist("Ludmilla"), new Artist("Snoop Dog")), "Onda Diferente", 160);
		assertEquals("Anitta (feat. Ludmilla, Snoop Dog)", collabTrack.getFullArtistName());
	}
}
