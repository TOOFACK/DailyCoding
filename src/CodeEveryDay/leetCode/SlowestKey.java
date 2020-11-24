package CodeEveryDay.leetCode;

public class SlowestKey {
    public static void main(String[] args) {
        System.out.println(slowestKey(new int[]{12,23,36,46,62}, "spuda"));
    }

    public static char slowestKey(int[] releaseTimes, String keysPressed) {

        int[] keysVal = new int[keysPressed.length()];
        keysVal[0] = releaseTimes[0];
        int max = keysVal[0];
        int indexofMax = 0;
        for(int i = 1; i < keysPressed.length(); i++){
            keysVal[i] = releaseTimes[i] - releaseTimes[i-1];
            if(max < keysVal[i]){
                max = keysVal[i];
                indexofMax = i;
            } else if(max == keysVal[i]){
                if(keysPressed.charAt(indexofMax) < keysPressed.charAt(i)){
                    max = keysVal[i];
                    indexofMax = i;
                }
            }

        }

        return keysPressed.charAt(indexofMax);
    }

}
