import java.util.Scanner;
import java.util.Random;

public class ex14{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int start = 0, stop = 0, step = 0, seed = 0, iter = 0;
        while(scanner.hasNext()){
            start = scanner.nextInt();
            stop = scanner.nextInt();
            step = scanner.nextInt();
            seed = scanner.nextInt();
            iter = scanner.nextInt();
            RandomIntegerGenerator Rand = new RandomIntegerGenerator(start, stop, step, seed);
            for(int i = 0; i < iter; i++){
                System.out.printf("%d ", Rand.generate());
            }
            System.out.println();
        }
    }
}

class RandomIntegerGenerator{
    int start = 0, stop = 0, step = 0, seed = 0;
    Random rand;

    public RandomIntegerGenerator(int start, int stop, int step, int seed){
        this.start = start;
        this.stop = stop;
        this.step = step;
        this.seed = seed;
        this.rand = new Random(seed);
    }
    public int generate(){
        int n = (stop - start) / step + 1;
        return (start + rand.nextInt(n) * step);
    }
}