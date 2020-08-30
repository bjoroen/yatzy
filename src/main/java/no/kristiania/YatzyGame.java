package no.kristiania;

public class YatzyGame {
    public int score(YatzyCategory category, int[] dice) {
        int result = 0;
        int[] frequencies = new int[7];
        for (int die : dice) {
            frequencies[die]++;
        }
        //THE SCORE OF PAIR
        if (category == YatzyCategory.PAIR){
            for (int value = frequencies.length - 1; value >= 0; value--){
                if (frequencies[value] == 2){
                    return value*2;
                }
            }
        }
        //THE SCORE OF THREE OF A KIND
        if (category == YatzyCategory.THREE_OF_A_KIND){
            for (int value = frequencies.length - 1; value >= 0; value--){
                if (frequencies[value] == 3){
                    return value*3;
                }
            }
        }
        //THE SCORE OF FOUR OF A KIND
        if (category == YatzyCategory.FOUR_OF_A_KIND){
            for (int value = frequencies.length - 1; value >= 0; value--){
                if (frequencies[value] == 4){
                    return value*4;
                }
            }
        }
        //SMALL STRAIGHT
        if(category == YatzyCategory.SMALL_STRAIGHT){
            return 15;
        }
        //BIG STRAIGHT
        if(category == YatzyCategory.BIG_STRAIGHT){
            return 20;
        }
        //FULL HOUSE
        if(category == YatzyCategory.FULL_HOUSE){
            for(int die : dice){
                result += die;
            }
            return result;

        }
        //CHANCE
        if (category == YatzyCategory.CHANCE){
            for(int die : dice){
                result += die;
            }
            return result;
        }
        //YATZY
        if(category == YatzyCategory.YATZY){
            return 50;
        }

        //SCORE OF ONES
        if(category == YatzyCategory.ONES){
            return frequencies[1];
        }
        //SCORE OF TWOS
        if(category == YatzyCategory.TWOS){
            return frequencies[2] *2;
        }
        //SCORE OF Three
        if(category == YatzyCategory.THREES){
            return frequencies[3] *3;
        }
        //SCORE OF Four
        if(category == YatzyCategory.FOURS){
            return frequencies[4] *4;
        }
        //SCORE OF Fives
        if(category == YatzyCategory.FIVES){
            return frequencies[5] *5;
        }
        //SCORE OF SIX
        if(category == YatzyCategory.SIXES){
            return frequencies[6] *6;
        }
        return result;
    }
}
