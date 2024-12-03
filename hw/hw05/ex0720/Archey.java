/****************************************************************
 * Copyright (c) 2024 劉祐伸
 * 
 * 此程式及其文件的版權歸 劉祐伸 所有。
 * 
 * 本程式碼僅用於學術或個人學習用途，不得用於商業目的或未經授權的分發。
 * 如果需要使用本程式碼，請事先聯繫版權持有者以獲得授權。
 * 
 * 本程式基於以下開源資源/工具：Visual Studio Code & Java
 * 
 * 本程式在「現狀」基礎上提供，沒有任何明示或暗示的擔保，包括但不限於針對特定用途的適用性和無侵權性。
 * 在任何情況下，版權擁有人均不對由於使用本程式而引起的任何索賠、損害或其他責任負責。
 *  
 * 此程式目的為隨機四位玩家的射箭分數，各有三次機會，分別列印出這三次的結果並統計分數，最後列印出誰為贏家。
 * **************************************************************/

import java.security.SecureRandom;

public class Archey{
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        final int PLAYERS = 4, SCORES = 4, CHANCE = 3;
        int[] max = new int[2];
        int[][] scores = new int[PLAYERS][SCORES];

        for(int i = 0; i < PLAYERS; i++) {
            for(int j = 0; j < CHANCE; j++) {
                scores[i][j] = random.nextInt(10);
                scores[i][CHANCE] += scores[i][j];
            }
        }

        System.out.printf("%-8s %6s %6s %6s %6s\n", "PLAYERS", "First", "Second", "Third", "Total");
        for(int i = 0; i < PLAYERS; i++){
            System.out.printf("Player %d", (i + 1));
            for(int j = 0; j < SCORES; j++){
                if(scores[i][j] > max[1]){
                    max[1] = scores[i][j];
                    max[0] = i + 1;
                }
                System.out.printf("%7d", scores[i][j]);
            }
            System.out.println();
        }
        System.out.printf("The winner is Player %d, has total score %d\n", max[0], max[1]);
    }
}