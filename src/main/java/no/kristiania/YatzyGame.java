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
            int sum = 0;
            for(int die : dice){
                sum += die;
            }
            return sum;

        }

        //SCORE OF ONES
        if(category == YatzyCategory.ONES){
            return frequencies[1];
        }
        //SCORE OF TWOS
        if(category == YatzyCategory.TWOS){
            return frequencies[2] *2;
        }
        return result;
    }
}
