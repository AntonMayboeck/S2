package S2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;
import java.util.Arrays;

public class Fast {
    int lo = 0;
    int hi = 0;
    public static void  printCollinear(Point[] pointArray, int limitLow, int limitHigh){
        //StdOut.printf("%s -> %s -> %s -> %s\n", p.toString(), s.toString(),
              //  r.toString(), q.toString());

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
        StdDraw.show(0);
    }




    public static void main(String[] args){
        Stopwatch stopwatch = new Stopwatch();
        checkCollinear();
        StdOut.println(stopwatch.elapsedTime());
    }
}
