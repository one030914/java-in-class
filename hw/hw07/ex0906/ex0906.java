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
 * 此程式目的為練習基本的類別繼承，父類別為Book，其子類別有PrintBook及AudioBook。
 * **************************************************************/

public class ex0906{
    public static void main(String[] args){
        PrintBook print = new PrintBook("A", "B", "C", "D", "E");
        AudioBook audio = new AudioBook("F", "G", "H", 40, 5, "I");
        
        System.out.printf("The print book is: [%s]\n", print.toString());
        System.out.printf("The audio book is: [%s]\n", audio.toString());
    }   
}

class Book{
    private String title = "", publication = "", author = "";

    public Book(String title, String publication, String author){
        this.title = title;
        this.publication = publication;
        this.author = author;
    }
    public String getTitle(){
        return this.title;
    }
    public String getPublication(){
        return this.publication;
    }
    public String getAuthor(){
        return this.author;
    }
    public String toString(){
        return String.format("title: %s, publication: %s, author: %s, ", getTitle(), getPublication(), getAuthor());
    }
}

class PrintBook extends Book{
    private String publisher = "", ISBN = "";

    public PrintBook(String title, String publication, String author, String publisher, String ISBN){
        super(title, publication, author);
        this.publisher = publisher;
        this.ISBN = ISBN;
    }
    public String getPublisher(){
        return this.publisher;
    }
    public String getISBN(){
        return this.ISBN;
    }
    @Override
    public String toString(){
        return String.format("%spublisher: %s, ISBN: %s", super.toString(), getPublisher(), getISBN());
    }
}

class AudioBook extends Book{
    private double siez = 0.0, length = 0.0;
    private String artist = "";

    public AudioBook(String title, String publication, String author, double siez, double length, String artist){
        super(title, publication, author);
        this.siez = siez;
        this.length = length;
        this.artist = artist;
    }
    public double getSiez(){
        return this.siez;
    }
    public double getLength(){
        return this.length;
    }
    public String getArtist(){
        return this.artist;
    }
    @Override
    public String toString(){
        return String.format("%ssiez: %.1f MB, length: %.1f minutes, artist: %s", super.toString(), getSiez(), getLength(), getArtist());
    }
}