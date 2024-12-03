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
 * 此程式目的為測試一個陣列是否有在0-100裡面。
 * **************************************************************/

import java.security.SecureRandom;

public class IntegerSet{
    private final int SIZE = 101;
    private boolean[] set;

    public IntegerSet(){
        set = new boolean[SIZE];
    }
    public boolean Contains(int n){
        if(n >= 0 && n <= 100){
            set[n] = true;
            return set[n];
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        IntegerSet set = new IntegerSet();
        SecureRandom random = new SecureRandom();
        final int SIZE = 10;
        int[] data = new int[SIZE];

        for(int i = 0; i < SIZE; i++){
            data[i] = random.nextInt(200);
            System.out.println(data[i] + " is" + (set.Contains(data[i]) ? " " : " not ") + "in the set.");
        }
    }
}