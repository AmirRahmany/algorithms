public class MaxSubcequence {
    public int maxSumON3(int[] array) {
        int maxSum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int thisSum = 0;
                for (int k = i; k <= j; k++) {
                    thisSum += array[k];
                    if (thisSum > maxSum)
                        maxSum = thisSum;
                }
            }
        }

        return maxSum;
    }

    public int maxSumON2(int[] array) {
        int maxSum = 0;
        for (int i = 0; i < array.length; i++) {
            int thisSum = 0;
            for (int j = i; j < array.length; j++) {
                thisSum += array[j];

                if (thisSum > maxSum)
                    maxSum = thisSum;
            }
        }
        return maxSum;
    }


    public int maxSumON(int[] array) {
        int maxSum = 0;
        int thisSum = 0;

        for (int i = 0; i < array.length; i++) {
            thisSum += array[i];
            if (thisSum > maxSum) maxSum = thisSum;
            else if (thisSum < 0) {
                thisSum = 0;
            }
        }
        return maxSum;
    }
}
