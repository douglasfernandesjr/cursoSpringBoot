package com.example.demo.config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.modelmapper.convention.MatchingStrategies;

@RunWith(MockitoJUnitRunner.class)
public class MapperConfigTest {
    @Test
    public void shouldGetMapper() {
        MapperConfig mapper = new MapperConfig();
        assertNotNull("Docket cannot be null!", mapper.getModelMapper());
    }

    @Test
    public void shouldGetMapperWithSTRICT_MatchingStrategies() {
        MapperConfig mapper = new MapperConfig();
        assertEquals("Unexpected Matching Strategy found!",
                mapper.getModelMapper().getConfiguration().getMatchingStrategy(), MatchingStrategies.STRICT);
    }
}