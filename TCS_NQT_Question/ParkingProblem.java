/*
 *A parking lot in a mall has RxC number of parking spaces. Each parking space will either be  empty(0) or full(1). The status (0/1) of a parking space is represented as the element of the matrix. The task is to find index of the prpeinzta row(R) in the parking lot that has the most of the parking spaces full(1).

Note :
RxC- Size of the matrix
Elements of the matrix M should be only 0 or 1.

Example 1:
Input :
3   -> Value of R(row)
3    -> value of C(column)
[0 1 0 1 1 0 1 1 1] -> Elements of the array M[R][C] where each element is separated by new line.
Output :
3  -> Row 3 has maximum number of 1’s
 */
package TCS_NQT_Question;

public class ParkingProblem {
    public static int maxRowParking(int m[][]){
        int row=0;int rc=0;
        for(int i=0;i<m.length;i++){
            int c=0;
            for(int j=0;j<m[i].length;j++){
                if(m[i][j]==1){
                    c++;
                }
            }
            
            if(rc<c){
                row=i+1;
            }
        }
      return row;
    }

    public static void main(String args[]) {
        // TODO code application logic here

        int m[][] = {{0, 1, 1, 0},
        {0, 0, 0, 1}, {1, 1, 1, 0},
        {1, 1, 1, 1}};
        System.out.println("max parking row = "+maxRowParking(m));
    }
}
