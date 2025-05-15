import java.util.Scanner;
public class UserInputMulArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row,col,i ,j;
        System.out.println("Enter the number of rows:");
        row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        col = sc.nextInt();
        int arr[][]= new int[row][col];
        int arr1[][] = new int[row][col];
        System.out.println("Enter the elements of the first array:");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second array:");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("The first array is:");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The second array is:");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        // Performing addition of two arrays
        int sum[][] = new int[row][col];
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                sum[i][j] = arr[i][j] + arr1[i][j];
            }
        }
        System.out.println("The sum of the two arrays is:");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        // Performing subtraction of two arrays
        int sub[][] = new int[row][col];
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                sub[i][j] = arr[i][j] - arr1[i][j];
            }
        }
        System.out.println("The subtraction of the two arrar is :");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }
        // Performing multiplication of two arrays
        int mul[][] = new int[row][col];
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                mul[i][j] = arr[i][j] * arr1[i][j];
            }
        }
        System.out.println("The multiplication of the two arrays is:");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }


        //transpose of the matrix
        int transpose[][] = new int[col][row];
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                transpose[j][i] = arr[i][j];
            }
        }
        System.out.println("The transpose of the first array is:");
        for(i=0;i<col;i++){
            for(j=0;j<row;j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        //transpose of the second matrix

        int transpose1[][] = new int[col][row];
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                transpose1[j][i] = arr1[i][j];
            }
        }
        System.out.println("The transpose of the second array is:");
        for(i=0;i<col;i++){
            for(j=0;j<row;j++){
                System.out.print(transpose1[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    }
