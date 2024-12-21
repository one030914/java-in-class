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
 * 此程式目的為利用多態類別，列印出每種形狀的資訊，如果是二維列印出面積，如果是三維列印出表面積與體積。
 * **************************************************************/

public class ex1014 {
    public static void main(String[] args){
        Circle circle = new Circle("Circle", 1);
        Square square = new Square("Square", 1);
        Triangle triangle = new Triangle("Triangle", 1, 1);
        Sphere sphere = new Sphere("Sphere", 1);
        Cube cube = new Cube("Cube", 1);
        RegularTetrahedron tetrahedron = new RegularTetrahedron("Regular Tetrahedron", 1);
        Shape[] shapes = new Shape[6];

        shapes[0] = circle;
        shapes[1] = square;
        shapes[2] = triangle;
        shapes[3] = sphere;
        shapes[4] = cube;
        shapes[5] = tetrahedron;

        System.out.println("Shape processing...");

        for(Shape shape : shapes){
            if(shape instanceof TwoDimensionalShape){
                System.out.printf("%s, area: %.2f\n", shape.toString(), shape.getArea());
            }else if(shape instanceof ThreeDimensionalShape){
                System.out.printf("%s, area: %.2f, volume: %.2f\n", shape.toString(), shape.getArea(), shape.getVoloume());
            }
        }
    }
}
