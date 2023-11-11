import java.util.Arrays;

public class line {

    public static boolean checkStraightLine(int[][] coordinates) {
        int x2=coordinates[0][0];
        int y2=coordinates[0][1];
        for( int i=1;i<coordinates.length;i++){
            int x1= coordinates[i][0], y1=coordinates[i][1];
            if(((y2-y1)==0 && (x2-x1)==1) || ((y2-y1)==1 && (x2-x1)==0)) continue;
            else {
                double m = (y2 - y1) / (double) (x2 - x1);
                System.out.println(x1 + "--" + x2 + "--" + y1 + "---" + y2 + "--" + m);
                if (m > 0 && m != 1) return false;
                if (m < 0 && m != -1) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println(checkStraightLine(new int [][]{{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}}));
        System.out.println(checkStraightLine(new int
                [][]{{0,0},{0,1},{0,-1}}));

        String.valueOf("89").length()
    }
}
