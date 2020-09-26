package S2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.Arrays;

public class Brute {

    public static void  printCollinear(Point p, Point s, Point r, Point q){
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

    public static void checkCollinear(){
        int x;
        int y;
        int N;
        Point point;

/*
        StdDraw.setXscale(0, 32768);
        StdDraw.setYscale(0, 32768);
*/

        In file = new In();
        N = file.readInt();
        Point[] pointArray = new Point[N];

        for (int i = 0; i < N; i++) {
            x = file.readInt();
            y = file.readInt();
            point = new Point(x, y);
/*
            point.draw();
*/
            pointArray[i] = point;
        }
        Arrays.sort(pointArray);
        for(int i = 0; i < N - 3; i++){
            for(int j = i + 1; j < N - 2; j++){
                for(int k = j + 1; k < N - 1; k++){
                    for(int l = k + 1; l < N; l++){
                        if(Brute.isCollinear(pointArray[i], pointArray[j], pointArray[k], pointArray[l])){
                            /*if(points.compareTo(point[j]) == 1);{ //find a way to sort the points suing compareTo

                            }   */                                  //using maybe an array
                                Brute.printCollinear(pointArray[i], pointArray[j], pointArray[k], pointArray[l]);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        Stopwatch stopwatch = new Stopwatch();
        checkCollinear();
        StdOut.println(stopwatch.elapsedTime());
    }


}
