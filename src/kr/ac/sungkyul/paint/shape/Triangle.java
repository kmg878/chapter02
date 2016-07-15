package kr.ac.sungkyul.paint.shape;

import kr.ac.sungkyul.paint.i.Drawable;

public class Triangle extends Shape implements Drawable {
	public void draw(){
		System.out.println("삼각형을 그렸습니다");
	}

}
