package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {


    private YatzyGame yatzyGame = new YatzyGame();

    @Test
    void shouldScoreOnes(){
        assertEquals(4, yatzyGame.score(YatzyCategory.ONES, new int[]{1, 1, 2, 1, 1}));
        assertEquals(2, yatzyGame.score(YatzyCategory.ONES, new int[]{6, 5, 2, 1, 1}));
    }
    @Test
    void shouldScoreTwo(){
        assertEquals(2, yatzyGame.score(YatzyCategory.TWOS, new int[]{1, 1, 2, 1, 1}));
        assertEquals(4, yatzyGame.score(YatzyCategory.TWOS, new int[]{6, 5, 2, 2, 1}));
    }
    @Test
    void shouldScoreThree(){
        assertEquals(9, yatzyGame.score(YatzyCategory.THREES, new int[]{1, 3, 3, 3, 1}));
        assertEquals(0, yatzyGame.score(YatzyCategory.THREES, new int[]{6, 5, 2, 2, 1}));
    }
    @Test
    void shouldScoreFours(){
        assertEquals(8, yatzyGame.score(YatzyCategory.FOURS, new int[]{4, 3, 4, 2, 1}));
        assertEquals(0, yatzyGame.score(YatzyCategory.FOURS, new int[]{6, 5, 2, 2, 1}));
    }
    @Test
    void shouldScoreFives(){
        assertEquals(0, yatzyGame.score(YatzyCategory.FIVES, new int[]{4, 3, 4, 2, 1}));
        assertEquals(5, yatzyGame.score(YatzyCategory.FIVES, new int[]{6, 5, 2, 2, 1}));
    }
    @Test
    void shouldScoreSix(){
        assertEquals(0, yatzyGame.score(YatzyCategory.SIXES, new int[]{4, 3, 4, 2, 1}));
        assertEquals(5, yatzyGame.score(YatzyCategory.SIXES, new int[]{6, 5, 2, 2, 1}));
    }
    @Test
    void shouldScorePair(){
        assertEquals(10, yatzyGame.score(YatzyCategory.PAIR, new int[]{1, 3, 5, 5, 2}));
        assertEquals(12, yatzyGame.score(YatzyCategory.PAIR, new int[]{1, 6, 6, 5, 2}));
        assertEquals(12, yatzyGame.score(YatzyCategory.PAIR, new int[]{5, 5, 6, 6, 2}));
    }
    @Test
    void shouldScoreThreeOfAKind(){
        assertEquals(12, yatzyGame.score(YatzyCategory.THREE_OF_A_KIND, new int[]{4, 4, 6, 4, 2}));
        assertEquals(18, yatzyGame.score(YatzyCategory.THREE_OF_A_KIND, new int[]{4, 6, 6, 4, 6}));
    }
    @Test
    void shouldScoreFourOfAKind(){
        assertEquals(16, yatzyGame.score(YatzyCategory.FOUR_OF_A_KIND, new int[]{4, 4, 4, 4, 2}));
        assertEquals(24, yatzyGame.score(YatzyCategory.FOUR_OF_A_KIND, new int[]{4, 6, 6, 6, 6}));
    }
    @Test
    void shouldScoreSmallStraight(){
        assertEquals(15, yatzyGame.score(YatzyCategory.SMALL_STRAIGHT, new int[]{1, 2, 3, 4, 5}));
    }
    @Test
    void shouldScoreBigStraight(){
        assertEquals(20, yatzyGame.score(YatzyCategory.BIG_STRAIGHT, new int[]{2, 3, 4, 5, 6}));
    }
    @Test
    void shouldScoreFullHouse(){
        assertEquals(9, yatzyGame.score(YatzyCategory.FULL_HOUSE, new int[]{1, 1, 1, 3, 3}));
        assertEquals(22, yatzyGame.score(YatzyCategory.FULL_HOUSE, new int[]{4, 4, 4, 5, 5}));
    }
    @Test
    void shouldScoreChance(){
        assertEquals(15, yatzyGame.score(YatzyCategory.CHANCE, new int[]{2, 6, 1, 3, 3}));
        assertEquals(19, yatzyGame.score(YatzyCategory.CHANCE, new int[]{1, 4, 4, 5, 5}));
    }
    @Test
    void shouldScoreYatzy(){
        assertEquals(50, yatzyGame.score(YatzyCategory.YATZY, new int[]{2, 6, 1, 3, 3}));
    }


}
