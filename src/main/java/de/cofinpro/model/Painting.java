package de.cofinpro.model;

import java.util.Collection;
import java.util.Set;

public record Painting(int id, String name, int year, int artistId) {

    public static Collection<Painting> paintings = Set.of(
            new Painting(1, "Mona Lisa", 1503, 1),
            new Painting(2, "Young Hare", 1502, 2)
    );
}
