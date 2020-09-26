package S2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

import edu.princeton.cs.algs4.Merge;



import java.util.Arrays;

import static edu.princeton.cs.algs4.Merge.*;

public class Fast {
    int lo = 0;
    int hi = 0;
    public static void  printCollinear(Point p, Point s, Point r, Point q){
        StdOut.printf("%s -> %s -> %s -> %s\n", p.toString(), s.toString(),
                r.toString(), q.toString());

    }

    public double[] sortSlope(Point[] points){
        double[] ble;
        ble = Mergesort(points);
        return ble;
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
/*
    }

        public static void main(String[] args){
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
        if (N >= 4) {
            Arrays.sort(pointArray);
            Brute.checkCollinear(pointArray, N);
        }
        StdDraw.show(0);*/
    }
    public static void main(String[] args){
        Stopwatch stopwatch = new Stopwatch();
        checkCollinear();
        StdOut.println(stopwatch.elapsedTime());
    }
}
