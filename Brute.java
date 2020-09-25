package S2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Brute {

    public static void  printCollinear(Point p, Point s, Point r, Point q){
        p.drawTo(q);
        StdOut.printf("%s -> %s -> %s -> %s\n", p.toString(), s.toString(), r.toString(), q.toString());
    }

    public static boolean isCollinear(Point p, Point s, Point r, Point q){
        return p.slopeTo(s) == s.slopeTo(r) && r.slopeTo(q) == p.slopeTo(q)
                && p.slopeTo(r) == s.slopeTo(q);
    }

    public static void checkCollinear(Point[] point, int N){
        for(int i = 0; i < N - 3; i++){
            for(int j = i + 1; j < N - 2; j++){
                for(int k = j + 1; k < N - 1; k++){
                    for(int l = k + 1; l < N; l++){
                        if(Brute.isCollinear(point[i], point[j], point[k], point[l])){
                            Brute.printCollinear(point[i], point[j], point[k], point[l]);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        int x, y, N;
        String filename;
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
        StdDraw.show(0);
    }


}
