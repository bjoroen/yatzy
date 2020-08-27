package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {
    @Test
    void shouldScoreOnes(){
        assertEquals(4, new YatzyGame().score(YatzyCategory.ONES, new int[]{1, 1, 2, 1, 1}));
    }
}
