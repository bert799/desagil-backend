package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.List;

public class CollaborationTrack extends Track {
	private List<Artist> collaborators;
	public CollaborationTrack(Artist artist, List<Artist>collaborators, String name, int duration) {
		super(artist, name, duration);
		this.collaborators = collaborators;
	}
	@Override
	public String getFullArtistName() {
		String mainArtist = this.getArtist().getName();
		List<String> collaboratorsNames = new ArrayList<>();
		for(int i = 0; i < collaborators.size(); i++) {
			collaboratorsNames.add(this.collaborators.get(i).getName());
		}
		String fullCast = mainArtist + " (feat. "+String.join(", ", collaboratorsNames)+")";
		
		return fullCast;		
	}
}
