package no.kristiania;

public class YatzyGame {
    public int score(YatzyCategory category, int[] dice) {
        int result = 0;
        int[] frequencies = new int[7];
        for (int die : dice) {
            frequencies[die]++;
        }
        if (category == YatzyCategory.PAIR){
            for (int value = frequencies.length - 1; value >= 0; value--){
                if (frequencies[value] == 2){
                    return value*2;
                }
            }
        }
        if (category == YatzyCategory.THREE_OF_A_KIND){
            for (int value = frequencies.length - 1; value >= 0; value--){
                if (frequencies[value] == 3){
                    return value*3;
                }
            }
        }
        if(category == YatzyCategory.ONES){
            return frequencies[1];
        }
        if(category == YatzyCategory.TWOS){
            return frequencies[2] *2;
        }
        return result;
    }
}
