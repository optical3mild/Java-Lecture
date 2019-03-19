package sec08.exam12_method_overloading;

public class Calculator {
	//정사각형의 넓이
	double areaRectangle(double width) {
		return width*width;
	}
	
	//직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width*height;
	}
}
