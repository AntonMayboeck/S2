package S2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Brute {

    public static void  printCollinear(Point p, Point s, Point r, Point q){
        p.drawTo(q);
        StdOut.printf("%s -> %s -> %s -> %s\n", p.toString(), s.toString(),
                r.toString(), q.toString());

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

    public static void checkCollinear(Point[] point, int N){
        Point[] hello = new Point[4];
        for(int i = 0; i < N - 3; i++){
            for(int j = i + 1; j < N - 2; j++){
                for(int k = j + 1; k < N - 1; k++){
                    for(int l = k + 1; l < N; l++){
                        if(Brute.isCollinear(point[i], point[j], point[k], point[l])){
                            /*if(points.compareTo(point[j]) == 1);{ //find a way to sort the points suing compareTo

                            }   */                                  //using maybe an array
                                Brute.printCollinear(point[i], point[j], point[k], point[l]);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        int x = 0;
        int y = 0;
        int oldX = 0;
        int oldY = 0;
        int N = 0;
        String filename;
        Point point;
        Point thatPoint;

        // rescale coordinates and turn on animation mode
        StdDraw.setXscale(0, 32768);
        StdDraw.setYscale(0, 32768);


        In file = new In();
        N = file.readInt();
        Point[] pointArray = new Point[N];
        int[] pointCheck = new int[N];

        for (int i = 0; i < N; i++) {
            x = file.readInt();
            y = file.readInt();
            point = new Point(x, y);
            point.draw();
            pointArray[i] = point;
        }
        Point points = new Point(x,y); //we always be the last read int
        if (N >= 4) {
            Arrays.sort(pointArray);
            Brute.checkCollinear(pointArray, N);
        }
        StdDraw.show(0);
    }


}
