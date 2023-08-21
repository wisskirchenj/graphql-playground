package de.cofinpro.web;

import de.cofinpro.model.Artist;
import de.cofinpro.model.Painting;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.Collection;

@Controller
public class ArtController {

    @QueryMapping
    public Collection<Painting> paintings() {
        return Painting.paintings;
    }

    @QueryMapping
    public Collection<Artist> artists() {
        return Artist.artists;
    }

    @SchemaMapping
    public Artist artist(Painting painting) {
        return Artist.getById(painting.artistId());
    }
}
