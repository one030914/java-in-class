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
 * 此程式目的為定義一副牌的類別，其中有判斷是否有：一對、兩對、三條、四條、同花、順子、葫蘆。
 * **************************************************************/

import java.security.SecureRandom;
import java.util.Arrays;

public class DeckOfCard{
    private static final SecureRandom RAND = new SecureRandom();
    private static final int CARDS = 52;


    private Card[] deck = new Card[CARDS];
    private int current = 0;

    public DeckOfCard(){
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        
        for(int count = 0; count < deck.length; count++){
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }
    public void shuffle(){
        current = 0;

        for(int first = 0; first < deck.length; first++){
            int second = RAND.nextInt(CARDS);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }
    public Card dealCard(){
        if(current < deck.length){
            return deck[current++];
        }else{
            return null;
        }
    }
    public Card[] dealHand(){
        Card[] hand = new Card[5];
        for(int i = 0; i < 5; i++){
            hand[i] = dealCard();
        }
        return hand;
    }
    public boolean isPair(Card[] hand){
        for(int i = 0; i < hand.length; i++){
            int count = 0;
            for(int j = 0; j < 5; j++){
                if(hand[j].getFace().equals(hand[i].getFace())){
                    count++;
                }
            }
            if(count == 2){
                return true;
            }
        }
        return false;
    }
    public boolean twoPair(Card[] hand){
        String face = "";
        for(int i = 0; i < hand.length; i++){
            int count = 0;
            for(int j = 0; j < 5; j++){
                if(hand[j].getFace().equals(hand[i].getFace())){
                    count++;
                }
            }
            if(count == 2){
                if(face == ""){
                    face = hand[i].getFace();
                }else if(!hand[i].getFace().equals(face)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean threeKind(Card[] hand){
        for(int i = 0; i < hand.length; i++){
            int count = 0;
            for(int j = 0; j < 5; j++){
                if(hand[j].getFace().equals(hand[i].getFace())){
                    count++;
                }
            }
            if(count == 3){
                return true;
            }
        }
        return false;
    }
    public boolean fourKind(Card[] hand){
        for(int i = 0; i < hand.length; i++){
            int count = 0;
            for(int j = 0; j < 5; j++){
                if(hand[j].getFace().equals(hand[i].getFace())){
                    count++;
                }
            }
            if(count == 4){
                return true;
            }
        }
        return false;
    }
    public boolean flush(Card[] hand){
        String suit = "";
        for(int i = 0; i < hand.length; i++){
            if(suit == ""){
                suit = hand[i].getSuit();
            }else if(!hand[i].getSuit().equals(suit)){
                return false;
            }
        }
        return true;
    }
    public boolean straight(Card[] hand){
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        int[] values = new int[hand.length];
        for (int i = 0; i < hand.length; i++) {
            for (int j = 0; j < faces.length; j++) {
                if (hand[i].getFace().equals(faces[j])) {
                    values[i] = j + 1;
                    break;
                }
            }
        }
        Arrays.sort(values);
        boolean isSequential = true;
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i + 1] - values[i] != 1) {
                isSequential = false;
                break;
            }
        }
        if (!isSequential && values[0] == 1) {
            values[0] = 14;
            Arrays.sort(values);
            isSequential = true;
            for (int i = 0; i < values.length - 1; i++) {
                if (values[i + 1] - values[i] != 1) {
                    isSequential = false;
                    break;
                }
            }
        }
        return isSequential;
    }
    public boolean fullHouse(Card[] hand){
        if(threeKind(hand) && isPair(hand)){
            return true;
        }
        return false;
    }
}