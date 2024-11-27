import java.util.Scanner;

public class ex11{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0, c = 0, x = 0, y = 0, z = 0;
        while(scanner.hasNext()){
            String name = "";
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();

            if(a >= b && a >= c){
                x = a;
                if(b >= c){
                    y = b;
                    z = c;
                }else if(b <= c){
                    y = c;
                    z = b;
                }
            }else if(b >= a && b >= c){
                x = b;
                if(a >= c){
                    y = a;
                    z = c;
                }else if(a <= c){
                    y = c;
                    z = a;
                }
            }else if(c >= a && c >= b){
                x = c;
                if(a >= b){
                    y = a;
                    z = b;
                }else if(a <= b){
                    y = b;
                    z = a;
                }
            }
            if(x == y && y == z){
                System.out.printf("equilateral triangle\n");
                continue;
            }else if(y + z <= x){
                System.out.printf("invalid triangle\n");
                continue;
            }
            if(x == y || x == z || y == z){
                name += "isosceles ";
            }
            if(z * z + y * y < x * x){
                System.out.printf("%s%s\n", name, "obtuse triangle");
                continue;
            }else if(z * z + y * y == x * x){
                System.out.printf("%s%s\n", name, "right triangle");
                continue;
            }else if(z * z + y * y > x * x){
                System.out.printf("%s%s\n", name, "acute triangle");
                continue;
            }
        }
    }
}