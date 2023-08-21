package de.cofinpro.model;

import java.util.Collection;
import java.util.Set;

public record Artist(int id, String name, int born, int died) {

    public static Collection<Artist> artists = Set.of(
            new Artist(1, "Leonardo da Vinci", 1452, 1519),
            new Artist(2, "Albrecht Dürer", 1471, 1528)
    );

    public static Artist getById(Integer id) {
        return artists.stream().filter(artist -> artist.id() == id).findFirst().orElseThrow();
    }
}
