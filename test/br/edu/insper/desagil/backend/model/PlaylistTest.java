package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlaylistTest {
	private static double DELTA = 0.000001;
	private Playlist playlist;
	@BeforeEach
	void setUp() {
		playlist = new Playlist(1);
	}

	@Test
	void testRoundDownToZero() {
		playlist.putRating("Bernie", 1);
		playlist.putRating("Berunarudo", 2);
		playlist.putRating("Bernard", 2);
		playlist.putRating("Bernardo", 3);
		assertEquals(2.0, playlist.averageRatings());
	}

	@Test
	void testRoundUpToHalf() {
		playlist.putRating("Bernie", 1);
		playlist.putRating("Berunarudo", 2);
		playlist.putRating("Bernard", 1);
		assertEquals(1.5, playlist.averageRatings());
	}

	@Test
	void testRoundDownToHalf() {
		playlist.putRating("Bernie", 1);
		playlist.putRating("Berunarudo", 2);
		playlist.putRating("Bernard", 2);
		assertEquals(1.5, playlist.averageRatings());
	}

	@Test
	void testRoundUpToOne() {
		playlist.putRating("Bernie", 1);
		playlist.putRating("Berunarudo", 1);
		playlist.putRating("Bernard", 2);
		playlist.putRating("Bernardo", 3);
		assertEquals(2.0, playlist.averageRatings());
	}
}
