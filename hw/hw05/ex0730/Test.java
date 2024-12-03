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
 * 此程式目的為測試一組手排是否有：一對、兩對、三條、四條、同花、順子、葫蘆。
 * **************************************************************/

public class Test{
    public static void main(String[] args){
        DeckOfCard card = new DeckOfCard();

        card.shuffle();
        Card[] hand = card.dealHand();
        System.out.println("Dealt hand:");
        for(int i=0; i<hand.length; i++){
            System.out.println(hand[i]);
        }
        System.out.println();
        System.out.println("Is it has a pair? " + card.isPair(hand));
        System.out.println("Is it has two pairs? " + card.twoPair(hand));
        System.out.println("Is it has three of kind? " + card.threeKind(hand));
        System.out.println("Is it has four of kind? " + card.fourKind(hand));
        System.out.println("Is it a flush? " + card.flush(hand));
        System.out.println("Is it a straight? " + card.straight(hand));
        System.out.println("Is it a full house? " + card.fullHouse(hand));
    }
}