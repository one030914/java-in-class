import java.util.Scanner;
import java.security.SecureRandom;

public class ex16{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        String[] candidates = genAll();
        int count = 0, countCand = candidates.length;
        String target = scanner.nextLine(), guess = "";
        while(count < 500){
            count++;
            guess = candidates[rand.nextInt(countCand)];

            int a = countA(target, guess), b = countB(target, guess);
            System.out.printf("%s\n", guess);

            if(a == 4 && b == 0){
                System.out.printf("Test round:%d\n", count);
                break;
            }else{
                countCand = think(candidates, countCand, guess, a, b);
            }
        }
    }
    public static String[] genAll(){
        String[] candidate = new String[10 * 9 * 8 * 7];
        int index = 0;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(i == j){
                    continue;
                }
                for(int k = 0; k < 10; k++){
                    if(i == k || j == k){
                        continue;
                    }
                    for(int l = 0; l < 10; l++){
                        if(i == l || j == l || k == l){
                            continue;
                        }
                        candidate[index++] = "" + i + j + k + l;
                    }
                }
            }
        }
        return candidate;
    }
    public static int think(String[] candidates, int countCand, String guess, int a, int b){
        int count = 0;
        for(int i = 0; i < countCand; i++){
            int a_ = countA(candidates[i], guess), b_ = countB(candidates[i], guess);
            if(a_ == a && b_ == b){
                candidates[count++] = candidates[i];
            }
        }
        return count;
    }
    public static int countA(String target, String guess){
        int count = 0;
        for(int i = 0; i < target.length(); i++){
            if(target.charAt(i) == guess.charAt(i)){
                count++;
            }
        }
        return count;
    }
    public static int countB(String target, String guess){
        int count = 0;
        for(int i = 0; i < target.length(); i++){
            if(target.contains(""+guess.charAt(i))){
                count++;
            }
        }
        return count - countA(target, guess);
    }
}