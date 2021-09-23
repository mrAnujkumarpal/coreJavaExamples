package ProbPratics;

import java.util.Arrays;

public class CheckStraightLineSlop {

    public static void main(String[] args) {
        int[][] coordinates1 = {{0, 0}, {1, 1}, {2, 2}};
        System.out.println(isStraightSlop(coordinates1));

        int[][] coordinates2 = {{1,2}, {2,3}, {3,4},{4,5}, {5,6}, {6,7}};
        System.out.println(isStraightSlop(coordinates2));

        int[][] coordinates3 ={{1,1}, {2,2}, {3,4},{4,5}, {5,6}, {6,7}};
        System.out.println(isStraightSlop(coordinates3));
    }

    private static boolean isStraightSlop(int[][] coordinates) {
        boolean bool = true;
        int[] coordinate1 = coordinates[0];
        int[] coordinate2 = coordinates[1];
        float slop = slopOfLine(coordinate1, coordinate2);
        for (int i=2; i<coordinates.length;i++ ) {
            int[] coordinate3 = coordinates[i];
            float nextSlop = slopOfLine(coordinate1, coordinate3);
            if(nextSlop!=slop){
                bool=false;
            }
        }
        return bool;
    }

    private static float slopOfLine(int[] coordinate1, int[] coordinate2) {
        //(y2-Y1)/(x2-x1);
        return coordinate2[1] - coordinate1[1] / coordinate2[0] - coordinate2[0];
    }
}
