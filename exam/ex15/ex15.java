import java.util.Scanner;
import java.security.SecureRandom;
import java.util.ArrayList;

public class ex15{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        ArrayList<Candidate> list = new ArrayList<Candidate>();
        String name = "";
        System.out.printf("Please input Number of Candidate:");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            System.out.printf("Candidate %d:", i+1);
            name = scanner.next();
            list.add(new Candidate(name));
        }
        System.out.printf("Voters:");
        int votes = scanner.nextInt();
        for(int i = 0; i < votes; i++){
            list.get(rand.nextInt(3)).addVotes();
        }
        System.out.println("Candidates and their votes:");
        Candidate top = list.get(0);
        for(Candidate i : list){
            System.out.printf("%s: %d\n", i.getNames(), i.getVotes());
            if(top.getVotes() < i.getVotes()){
                top = i;
            }
        }
        System.out.printf("Most votes is:%s, votes:%d\n", top.getNames(), top.getVotes());
    }
}

class Candidate{
    String name = "";
    int votes = 0;
    public Candidate(String name){
        this.name = name;
    }
    public int addVotes(){
        return this.votes++;
    }
    public int getVotes(){
        return this.votes;
    }
    public String getNames(){
        return this.name;
    }
}