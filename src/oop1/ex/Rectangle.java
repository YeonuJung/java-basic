package oop1.ex;

public class Rectangle {
    int width;
    int height;

    int calculateArea(){
        return width * height;
    }

    int calculatePerimeter(){
        return (width + height) * 2;
    }

    String checkIsSquare(){
        if(width == height){
            return "yes";
        }else{
            return "no";
        }
    }
}
