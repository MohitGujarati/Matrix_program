package com.company;

/*
class Simple_Arrays{
    void hello(int[] a ){
        for (int i=0;i<=a.length-1;i++){
            System.out.print(a[i]);
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        Arrays arr=new Arrays();
        arr.hello(a);
    }
}

 */         //1D array display

/*
public class Fundamental_of_matrix {
    //Matrix Display
    public static void main(String[] args) {
        int[][] a={{1,2,3},{2,3,4},{4,5,5}};

        for (int i=0 ; i<a.length;i++){
            for (int j=0;j<a[i].length;j++){

                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}

 */        //display All elements of 2D array

/*
class Fundamental_of_3D_Array{
    public static void main(String[] args) {
     int [][][] a= {{{10,20,30},{20,49,54},{23,45,465}}};

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                for (int k=0;k<a[i][j].length;k++)
                {
                    System.out.print(a[i][j][k]+" ");
                }
                System.out.println(" ");
            }
        }
    }
}

 */       //display All elements of 3D array

/*
class Matrix_Addition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m,n;
        System.out.println("Enter size of row and col ");
        m=sc.nextInt();
        n=sc.nextInt();

        int a[][]=new int[m][n];
        int b[][]=new int[m][n];
        int c[][]=new int[m][n];

        System.out.println("Enter value of First matrix ");
        for (int i=0; i<m;i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();


        System.out.println("Enter value of Second matrix ");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                b[i][j] = sc.nextInt();

// this code will add matrix

                  for (int i = 0; i < m; i++)
                  for (int j = 0; j < n; j++)
                c[i][j] = a[i][j]+  b[i][j];


                //now
     //printing matrix A
                System.out.print("Matrix A");
                System.out.println();
                for (int i=0;i<m;i++){
                    for (int j=0;j<n;j++){
                        System.out.print(a[i][j]+" ");
                    }
                    System.out.println();

                }

    //printing matrix B
                   System.out.print("Matrix B");
                   System.out.println();
                   for (int i=0;i<m;i++) {
                   for (int j = 0; j < n; j++) {
                        System.out.print(b[i][j] + " ");
                     }
                          System.out.println();
                    }

        System.out.print("Matrix Addition ");
        System.out.println();

            for (int i=0;i<m;i++) {
              for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}

========================================
        Enter size of row and col
        2
        2
        Enter value of First matrix
        2
        2
        2
        2
        Enter value of Second matrix
        2
        2
        2
        2
        Matrix A
        2 2
        2 2
        Matrix B
        2 2
        2 2
        Matrix Addition
        4 4
        4 4

 */      //addition of two Matrix

/*
class Row_sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[][]=new int[5][5];
        int row,col;

        System.out.println("Enter number of rows ");
        row= sc.nextInt();
        System.out.println("Enter number of col ");
        col= sc.nextInt();

        System.out.println("Enter elements of Matrix ");
        for (int i=0;i<row;i++)
            for (int j=0;j<col;j++)
                arr[i][j]=sc.nextInt();

        System.out.println(" Elements of Matrix ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(" "+arr[i][j]+" ");
            }
            System.out.println("");
        }

//main code
        for (int i=0;i<row;i++) {
            int sum_row = 0;
            for (int j = 0; j < col; j++) {

                sum_row=sum_row+arr[i][j];

            }
            System.out.println("Sum of  row :>"+sum_row);
        }

        for (int i=0;i<col;i++) {
            int sum_col = 0;
            for (int j = 0; j < row; j++) {

                sum_col=sum_col+arr[i][j];

            }
            System.out.println("Sum of  col :>"+sum_col);
        }
    }
}
---------------------------------------------------------
        Enter number of rows
        2
        Enter number of col
        2
        Enter elements of Matrix
        2
        2
        2
        2
        Elements of Matrix
        2  2
        2  2
        Sum of  row :>4
        Sum of  row :>4
        Sum of  col :>4
        Sum of  col :>4

 */     //RoW_COL Addition in matrix                                  (IMP)

/*

class Transpose_matrix{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[][]=new int[5][5];
        int row,col;

        System.out.println("Enter number of rows ");
        row= sc.nextInt();
        System.out.println("Enter number of col ");
        col= sc.nextInt();

        int [][] matA =new int[row][col];
        System.out.println("Enter "+row*col+" Value");

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++)
                matA[i][j] = sc.nextInt();
            }
        System.out.println("Original Matrix is ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(matA[i][j]+"\t");
            }
            System.out.println();

            }
//main code
        System.out.println("Transpose Matrix is ");
        for (int i=0;i<col;i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(matA[j][i] + "\t");
            }

            System.out.println();
        }
    }
}
-----------------------------------------------------------------------
        Enter number of rows
        3
        Enter number of col
        2
        Enter 6 Value
        1
        2
        3
        4
        5
        6
        Original Matrix is
        1	2
        3	4
        5	6
        Transpose Matrix is
        1	3	5
        2	4	6

*/    //Transpose of matrix

/*
class spare_matrix{

    // if more than half number in an matrix is zero then it is Sparse matrix


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.println("Enter size of row and col ");
        m = sc.nextInt();
        n = sc.nextInt();

        double[][] mat = new double[m][n];
        int zero = 0;
        System.out.println("Enter "+(m*n)+" elements ");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
            {
                mat[i][j] = sc.nextDouble();
                if (mat[i][j]==0){
                    zero++;
                }

            }
        if (zero>(m*n)/2){
            System.out.println(" its a Sparse matrix");

        }else
            System.out.println("Not Sparse matrix");
    }
}
--------------------------------------------
        Enter size of row and col
        2
        2
        Enter 4 elements
        1
        0
        0
        0
        its a Sparse matrix

 */   //spare matrix

/*
class Diagonal_matrix{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size and then values");
        int n=sc.nextInt();

        System.out.println("enter no of values " +(n*n)+" in a matrix"+" ");
        int[][] arr=new int[n][n];
        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {

                arr[i][j]= sc.nextInt();
            }


        }

        System.out.println("Diagonal are");

        for (int gap=0;gap<arr.length;gap++){
            for (int i=0,j=gap;j<arr.length;i++,j++){
                System.out.println(Math.abs(arr[i][j]));
            }



        }
    }
}

---------------------------------
    Enter size and then values
        2
        enter matrix
        12 0
        11 0
        Diagonal are
        12
        0
        0
  */  //print diagonal of matrix                                       (IMP)

/*


class Rotate_matrix_90Degree{
    public static void main(String[] args) {

        int[][] a={{1,2,3},{4,5,6},{7,8,9}};

        // transpose of matrix
        System.out.println("transpose  is ");
        for (int i=0 ; i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[j][i]+" ");
            }
           System.out.println();

        }
        System.out.println("Transpose is done");

        for (int i=0;i<a.length;i++){
            int li=0;
            int ri=a[i].length-1;
            while (li<ri){
                int temp=a[i][li];
                a[i][li]=a[i][ri];
                a[i][ri]=temp;
                li++;
                ri--;


            }

        }
            for (int k=0;k<a.length;k++){
                for (int j=0;j<a[0].length;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
        }

    }
}
-------------------------------------
        transpose  is
        1 4 7
        2 5 8
        3 6 9
        Transpose is done
        3 2 1
        6 5 4
        9 8 7
 */ //Transpose and reverse of matrix+ use this for transpose         (IMP)

/*


class practice {
    int[][] a={{1,2,3},{4,5,6},{7,8,9}};

    void transpose(){
        // transpose of matrix
        System.out.println("transpose  is ");
        for (int i=0 ; i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();


        }
        System.out.println("Transpose is done and now rotation");
    }


    void rotation(){
        for (int i=0;i<a.length;i++){
            int li=0;
            int ri=a[i].length-1;
            while (li<ri){
                int temp=a[i][li];
                a[i][li]=a[i][ri];
                a[i][ri]=temp;
                li++;
                ri--;
            }
            }
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}

class main{
    public static void main(String[] args) {
        practice new_method= new practice();
        new_method.transpose();
        new_method.rotation();

    }

}



-----------------------------------------
        transpose  is
        1 4 7
        2 5 8
        3 6 9
        Transpose is done and now rotation
        3 2 1
        6 5 4
        9 8 7

 *///Transpose and reverse of matrix using method +use this for transpose
