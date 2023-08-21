package de.cofinpro.web;

import de.cofinpro.model.Artist;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.graphql.test.tester.GraphQlTester;

import static org.junit.jupiter.api.Assertions.*;

@GraphQlTest
class ArtControllerTest {

    @Autowired
    GraphQlTester graphQlTester;

    @Test
    void artistsEndpoint_matchesExpectations() {
        var response = graphQlTester.documentName("artists")
                .execute()
                .path("artists")
                .entity(Artist[].class)
                .get();
        assertArrayEquals(Artist.artists.toArray(), response);
    }
}