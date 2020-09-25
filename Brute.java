package S2;

import edu.princeton.cs.algs4.StdOut;

public class Brute {

    public static void  printCollinear(Point p, Point s, Point r, Point q){
        p.drawTo(q);
        StdOut.printf("%s -> %s -> %s -> %s\n", p.toString(), s.toString(), r.toString(), q.toString());
    }

    public static boolean isCollinear(Point p, Point s, Point r, Point q){
        if(p.slopeTo(s) == s.slopeTo(r) && r.slopeTo(q) == p.slopeTo(q)){
            return true;
        }
        else{
            return false;
        }
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

}
