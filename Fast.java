package S2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;
import java.util.Arrays;

public class Fast {

    public static void  printCollinear(Point[] pointArray, int limitLow, int limitHigh){
        // Invariant: min will always be at points[0]
        // Invariant: max will always be at points[hi-1]
        
        StdOut.printf("%s -> ", pointArray[0].toString());
        Arrays.sort(pointArray, limitLow, limitHigh);
        for (int k = 0; k < limitHigh-limitLow; k++) {
            StdOut.printf("%s", pointArray[limitLow+k].toString());
            if (k != limitHigh-limitLow-1)
                StdOut.printf(" -> ");
            else
                StdOut.printf("\n");
        }
        pointArray[0].drawTo(pointArray[limitHigh-1]);
    }

    public static boolean isCollinear(Point p, Point s, Point r, Point q){
        if(p.slopeTo(s) == p.slopeTo(r)){
            if(p.slopeTo(s) == p.slopeTo(q)){
                return true;
            }
        }
        else{
            return false;
        }
        return false;
    }

    public static void checkCollinear(){
        int x;
        int y;
        int N;
        Point point;

        // rescale coordinates and turn on animation mode
        StdDraw.setXscale(0, 32768);
        StdDraw.setYscale(0, 32768);

        In file = new In();
        N = file.readInt();
        Point[] pointArray = new Point[N];

        for (int i = 0; i < N; i++) {
            x = file.readInt();
            y = file.readInt();
            point = new Point(x, y);
            point.draw();
            pointArray[i] = point;
        }
        Point[] pointArrayCopy = pointArray.clone();

        for (int i = 0; i < N; i++)
        {
            Point originPoint = pointArrayCopy[i];
            Arrays.sort(pointArray, originPoint.SLOPE_ORDER);

            int limitLow = 1;
            int limitHigh = 2;

            while (limitHigh < N)
            {
                if (pointArray[limitLow].slopeTo(originPoint) == pointArray[limitHigh].slopeTo(originPoint)) {
                    limitHigh ++;
                    continue;
                }
                else {
                    if (limitHigh - limitLow >= 3){
                        if (originPoint.slopeTo(pointArray[limitLow]) == - 1){
                            printCollinear(pointArray, limitLow, limitHigh);
                            limitLow = limitHigh;
                        }
                    }
                }
                limitHigh ++;
            }
        }
    }




    public static void main(String[] args){
        Stopwatch stopwatch = new Stopwatch();
        checkCollinear();
        StdOut.println(stopwatch.elapsedTime());
    }
}
