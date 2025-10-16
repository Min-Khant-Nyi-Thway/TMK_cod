package array;

public class twoDimensionArr {
    public static void main(String[] args) {
        
        int num[][] = {{1,2,3,4,5}, {6,7,8,9}, {10,11,12}, {13,14} };

        System.out.println("number of rows:" + num.length); //4

        System.out.println("number of columns for row 0:" + num[0].length);
        System.out.println("number of columns for row 0:" + num[1].length);
        System.out.println("number of columns for row 0:" + num[2].length);
        System.out.println("number of columns for row 0:" + num[3].length);
    }
}
