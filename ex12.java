import java.util.Scanner;

public class ex12{
    public static void main(String[] args){
        int intTarget = 0, intValue = 0;
        float floatTarget = 0.0f, floatValue = 0.0f;
        String  strTarget = "", mode = "";
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            mode = scanner.next();
            if(mode.equals("integer")){
                intTarget = scanner.nextInt();
                intValue = scanner.nextInt();
                System.out.printf("%d\n", intMuti(intTarget, intValue));
            }else if(mode.equals("float")){
                floatTarget = scanner.nextFloat();
                floatValue = scanner.nextFloat();
                System.out.printf("%f\n", floatMuti(floatTarget, floatValue));
            }else if(mode.equals("string")){
                strTarget = scanner.next();
                intValue = scanner.nextInt();
                System.out.printf("%s\n", strMuti(strTarget, intValue));
            }
        }
    }
    public static int intMuti(int target, int value){
        return (target * value);
    }
    public static float floatMuti(float target, float value){
        return (target * value);
    }
    public static String strMuti(String target, int value){
        String result = "";
        for(int i = 0; i < value; i++){
            result += target;
        }
        return result;
    }
}