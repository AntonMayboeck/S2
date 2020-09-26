/**********************************************************************
 *  Pattern Recognition readme.txt template
 **********************************************************************/

Name: Anton Mayböck Helgason          
Login: antonm19           
Hópur: S2 53

Partner name: Eva Naabye 
Partner login: evan19  
Partner hópur: S2 53

Partner name: Björgvin Elisson    
Partner login: bjorgvine19 
Partner hópur: S2 53

Username of the student submitting to Mooshak: bjorgvine19

Hours to complete assignment (optional):



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
   1423		180	     O(1)
  


Brute:    ~N^4

Sorting:  -




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



/**********************************************************************
 *  Describe whatever help (if any) that you received.
 *  Don't include readings, lectures, and precepts, but do
 *  include any help from people (including course staff, lab TAs,
 *  classmates, and friends) and attribute them by name.
 **********************************************************************/



/**********************************************************************
 *  Describe any serious problems you encountered.                    
 **********************************************************************/




/**********************************************************************
 *  If you worked with a partner, assert below that you followed
 *  the protocol as described on the assignment page. Give one
 *  sentence explaining what each of you contributed.
 **********************************************************************/



FAST.java



/**********************************************************************
 *  List any other comments here. Feel free to provide any feedback   
 *  on how much you learned from doing the assignment, and whether    
 *  you enjoyed doing it.                                             
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
    8		~0.4	     O(1)
    9		~0.1	     O(1)
    10		~0.4	     O(1)
    20		~0.1	     O(1)
    40		~0.1	     O(1)
    48		~0.1	     O(1)
    400		~6.5	     O(1)
   1423		180	     O(1)
  


Fast:    ~N^4

Sorting:  -




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



/**********************************************************************
 *  Describe any serious problems you encountered.                    
 **********************************************************************/




/**********************************************************************
 *  If you worked with a partner, assert below that you followed
 *  the protocol as described on the assignment page. Give one
 *  sentence explaining what each of you contributed.
 **********************************************************************/







/**********************************************************************
 *  List any other comments here. Feel free to provide any feedback   
 *  on how much you learned from doing the assignment, and whether    
 *  you enjoyed doing it.                                             
 **********************************************************************/
