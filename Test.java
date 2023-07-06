import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        int n;
                Scanner bob = new Scanner(System.in);
                    System.out.println("Number : ");
                    n = bob.nextInt();
                    int total=1;
                    for (int k=1;k<=n;k++) {
                        total=total*k;
                        }
        int r;
                    System.out.println("numero2:");
                    r = bob.nextInt();
                    int total1=1;
                    for (int o=1;o<=r;o++){
                        total1=total1*o;
                    }

        int b;
                    int total2=2;
                    for (int s=1;s<=(n-r);s++){
                        total2=total2*s;
                    }

            int karbon=total/(total1*total2);
                    System.out.println("Combination:");
    }


            }
