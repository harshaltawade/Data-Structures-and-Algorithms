import java.util.Scanner;

public class Patterns {

    public static void pattern1(int n){
        int i=0;
        int j=0;
        while(i<n){
            while (j<n) {
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            j=0;
            i++;
        }
    }

    public static void pattern2(int n){
        int i=0;
        int j=0;
        while(i<n){
            while(j<n){
                System.out.print((i+1)+" ");
                j++;
            }
            i++;
            j=0;
            
            System.out.println();
        }
    }

    public static void pattern3(int n){
        int i=1;
        int j=1;
        while(i<=n){
            while(j<=n){
                System.out.print(j+" ");
                j++;
            }
            i++;
            j=1;
            System.out.println();
        }
    }

    // 3 2 1
    // 3 2 1
    // 3 2 1
    public static void pattern4(int n){
        int i=1;
        int j=1;
        while(i<=n){
            while(j<=n){
                System.out.print(n-j+1 + " ");
                j++;
            }
            i++;
            j=1;
            System.out.println();
        }
    }

    public static void pattern5(int n){
        int i=0;
        int j=0;
        int count = 1;
        while(i<n){
            while(j<n){
                System.out.print(count+" ");
                count++;
                j++;
            }
            i++;
            j=0;
            System.out.println();
        }
    }

    public static void pattern6(int n){
        int i=1;
        int j=1;

        while(i<=n){
            while(j<=i){
                System.out.print(" * ");
                j++;
            }
            i++;
            j=1;
            System.out.println();
        }
    }

    public static void pattern7(int n){
        int i=1;
        int j=1;
        while(i<=n){
            while(j<=i){
                System.out.print(i+" ");
                j++;
            }
            i++;
            j=1;
            System.out.println();
        }
    }

    public static void pattern8(int n){
        int i=1;
        int j=1;
        int count=1;
        while(i<=n){
            while(j<=i){
                System.out.print(count+" ");
                count++;
                j++;
            }
            i++;
            j=1;
            System.out.println();
        }
    }

    public static void pattern9(int n){
        int i=1;
        int j=1;
        while(i<=n){
            while(j<=i){
                System.out.print(i-j+1+" ");
                j++;
            }
            i++;
            j=1;
            System.out.println();
        }
    }

    public static void pattern10(int n){
        int i=1;
        int j=1;
        while(i<=n){
            while(j<=n){
                System.out.print((char)('A'+i-1));
                j++;
            }
            i++;
            j=1;
            System.out.println();
        }
    }

    public static void pattern11(int n){
        int i=1;
        int j=1;
        while(i<=n){
            while(j<=n){
                System.out.print((char)('A'+j-1));
                j++;
            }
            i++;
            j=1;
            System.out.println();
        }
    }

    public static void pattern12(int n){
        int i=1;
        int j=1;
        while(i<=n){
            while(j<=n){
                System.out.print((char)('A'+i+j-2));
                j++;
            }
            i++;
            j=1;
            System.out.println();
        }
    }

    public static void pattern13(int n){
        int i=1;
        int j=1;
        while(i<=n){
            while(j<=i){
                System.out.print((char)('A'+i-1));
                j++;
            }
            i++;
            j=1;
            System.out.println();
        }
    }

    public static void pattern14(int n){
        int i=1;
        int j=1;
        while(i<=n){
            while(j<=i){
                System.out.print((char)('A'+i+j-2));
                j++;
            }
            i++;
            j=1;
            System.out.println();
        }
    }

    public static void pattern15(int n){
        int i=1;
        int j=1;
        while(i<=n){
            while(j<=i){
                System.out.print((char)('A'+n-i+j-1));
                j++;
            }
            i++;
            j=1;
            System.out.println();
        }
    }

    public static void pattern16(int n){
        int i=1;
        int j=1;
        while(i<=n){
            while(n-j>=i){
                System.out.print(" ");
                j++;
            }
            while(j<=n){
                System.out.print("*");
                j++;
            }
            i++;
            j=1;
            System.out.println();
        }
    }

    public static void pattern17(int n){
        int i=1;
        int j=1;
        while(i<=n){
            while(j<=(n-i+1)){
                System.out.print(" * ");
                j++;
            }
            i++;
            j=1;
            System.out.println();
        }
    }

    public static void pattern18(int n){
        int i=1;
        int j=1;
        while(i<=n){
            while(j<=(i-1)){
                System.out.print(" ");
                j++;
            }
            while(j<=n){
                System.out.print("*");
                j++;
            }
            i++;
            j=1;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :  ");
        int n = sc.nextInt();

        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        // pattern4(n);
        // pattern5(n);
        // pattern6(n);
        // pattern7(n);
        // pattern8(n);
        // pattern9(n);
        // pattern10(n);
        // pattern11(n);
        // pattern12(n);
        // pattern13(n);
        // pattern14(n);
        // pattern15(n);
        // pattern16(n);
        // pattern17(n);
        pattern18(n);
    }
}
