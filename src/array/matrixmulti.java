package array;

public class matrixmulti {
    public static void main(String[] args) {
        
        int num1[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int num2[][] = {{9,8,7}, {6,5,4}, {3,2,1}};
        
        int result[][] = new int[3][3];

        //number of rows
        for (int i = 0; i < num1.length; i++) {
            
            //number of columns
            for (int j = 0; j < num1.length; j++) {

                //number of products
                for (int k = 0; k < num1.length; k++) {
                    result[i][j] += num1[i][k] * num2[k][j]; //exam
                }
            }
        }

        //output for result array
        for (int i = 0; i < num1.length; i++) {
            
            //number of columns
            for (int j = 0; j < num1.length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}




//  [ 1, 2, 3 ] * [ 7, 8, 9 ]   [ 30, 24, 18  ]
//  [ 4, 5, 6 ]   [ 6, 5, 4 ] = [ 84, 69, 54  ]
//  [ 7, 8, 9 ]   [ 3, 2, 1 ]   [ 138, 114, 90]
//


// num1[0][0] * num2[0][0] = 9  
// num1[0][1] * num2[1][0] = 12  
// num1[0][2] * num2[2][0] = 21 
// 
//

// num1[0][0] * num2[0][1] = 8
// num1[0][1] * num2[1][1] = 10  
// num1[0][2] * num2[2][1] = 16 
// 
//

// num1[0][0] * num2[0][2] = 9  
// num1[0][1] * num2[1][2] = 12  
// num1[0][2] * num2[2][2] = 21 
// 
//