/**********************************************************************
 *  Pattern Recognition readme.txt template
 **********************************************************************/

Name: Anton Mayb�ck Helgason          
Login: antonm19           
H�pur: S2 53

Partner name: Eva Naabye 
Partner login: evan19  
Partner h�pur: S2 53

Partner name: Bj�rgvin Elisson    
Partner login: bjorgvine19 
Partner h�pur: S2 53

Username of the student submitting to Mooshak: bjorgvine19
Submission on Mooshak
Brute.java: 1228
Point.java: 1269

Hours to complete assignment (optional):
20 hours


/**********************************************************************
 *  Step 1.  Explain *briefly* how you implemented brute force.
 *           Describe how you implemented compareTo() and the
 *           slopeTo() methods in the Point data type.
 **********************************************************************/
isCollinear: checks if a line from one point has the same slope from three different points. If so returns true else returns false
checkCollinear: Initializes x,y and N from the input file and inserts it into the pointArray. The array is then sorted and using the integer 
for a quadruple for loop that checks every instance for isCollinear
and if it returns true it prints it out.


/**********************************************************************
 *  Step 2.  Explain *briefly* how you implemented the sorting solution.
 *           What steps did you do to avoid printing permutations
 *           and subsegments?
 **********************************************************************/
We used array sort for the brute force solution



/**********************************************************************
 *  Empirical    Fill in the table below with actual running times in
 *  Analysis     seconds when reasonable (say 180 seconds or less).
 *               You can round to the nearest tenth of a second.
 *
 *  Estimate (using tilde notation) the running time (in seconds) of
 *  your two main functions as a function of the number of points N.
 *
 *  Explain how you derive any exponents.
 **********************************************************************/

    
      N       brute(s)      sorting
 ---------------------------------
    8		~0.4	     O(1)
    9		~0.1	     O(1)
    10		~0.4	     O(1)
    20		~0.1	     O(1)
    40		~0.1	     O(1)
    48		~0.1	     O(1)
    400		~6.5	     O(1)
   1423		~180	     O(1)
  


Brute:    ~N^4

Sorting:  -O(1)




/**********************************************************************
 *  Theoretical   Give the order of growth of the worst-case running
 *                time of your programs as a function of N. Justify
 *                your answer briefly.
 **********************************************************************/

Brute:

Sorting:



/**********************************************************************
 *  Known bugs / limitations. For example, if your program prints
 *  out different representations of the same line segment when there
 *  are 5 or more points on a line segment, indicate that here.
 **********************************************************************/

When N is a large number the time it will take too much for a normal person.
Prints out the same line segment

/**********************************************************************
 *  Describe whatever help (if any) that you received.
 *  Don't include readings, lectures, and precepts, but do
 *  include any help from people (including course staff, lab TAs,
 *  classmates, and friends) and attribute them by name.
 **********************************************************************/

Group S2 11 helped us with some implementaion of Brute.java

/**********************************************************************
 *  Describe any serious problems you encountered.                    
 **********************************************************************/

When trying to submit the Brute.java to Mooshak it gave us an error that we had a deprecated API because in the code we still used StdDraw.draw.
When checking if the points are collinear we had that if the point where able to go over the first if function and then it would always return true. 

/**********************************************************************
 *  If you worked with a partner, assert below that you followed
 *  the protocol as described on the assignment page. Give one
 *  sentence explaining what each of you contributed.
 *
*********************************************************************/
Anton - Point.java, Brute.java
Bj�rgvin - Point.java, Brute.java and Fast.java
Eva - Fast.java, Point.java


/**********************************************************************
				FAST.java
**********************************************************************/


/**********************************************************************
 *  Step 1.  Explain *briefly* how you implemented brute force.
 *           Describe how you implemented compareTo() and the
 *           slopeTo() methods in the Point data type.
 **********************************************************************/



/**********************************************************************
 *  Step 2.  Explain *briefly* how you implemented the sorting solution.
 *           What steps did you do to avoid printing permutations
 *           and subsegments?
 **********************************************************************/


/**********************************************************************
 *  Empirical    Fill in the table below with actual running times in
 *  Analysis     seconds when reasonable (say 180 seconds or less).
 *               You can round to the nearest tenth of a second.
 *
 *  Estimate (using tilde notation) the running time (in seconds) of
 *  your two main functions as a function of the number of points N.
 *
 *  Explain how you derive any exponents.
 **********************************************************************/

    
      N       Fast(s)      sorting
 ---------------------------------
    8		~0.5	     N(log(N))
    9		~0.1	     N(log(N))
    10		~0.1	     N(log(N))
    20		~0.1	     N(log(N))
    40		~0.1	     N(log(N))
    48		~0.1	     N(log(N))
    400		~0.3	     N(log(N))
   1423		~1.4	     N(log(N))
  


Fast:    ~O(N^2(log(N))

Sorting:  -N(log(N))




/**********************************************************************
 *  Theoretical   Give the order of growth of the worst-case running
 *                time of your programs as a function of N. Justify
 *                your answer briefly.
 **********************************************************************/

Fast:

Sorting: -



/**********************************************************************
 *  Known bugs / limitations. For example, if your program prints
 *  out different representations of the same line segment when there
 *  are 5 or more points on a line segment, indicate that here.
 **********************************************************************/

/**********************************************************************
 *  Describe whatever help (if any) that you received.
 *  Don't include readings, lectures, and precepts, but do
 *  include any help from people (including course staff, lab TAs,
 *  classmates, and friends) and attribute them by name.
 **********************************************************************/
One of our brothers helped greatly in the implementation of the algorithm.


/**********************************************************************
 *  Describe any serious problems you encountered.                    
 **********************************************************************/
At first we couldn't get the program to read from the test input folder

/**********************************************************************
 *  If you worked with a partner, assert below that you followed
 *  the protocol as described on the assignment page. Give one
 *  sentence explaining what each of you contributed.
 **********************************************************************/
See in brute force part of the report



/**********************************************************************
 *  List any other comments here. Feel free to provide any feedback   
 *  on how much you learned from doing the assignment, and whether    
 *  you enjoyed doing it.                                             
 **********************************************************************/
This third part of the project was especially challenging however all in all
this project deepened our understanding on the subject quite a lot.