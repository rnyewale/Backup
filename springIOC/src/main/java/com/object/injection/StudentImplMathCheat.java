package com.object.injection;

public class StudentImplMathCheat {

	private MathCheat mathCheat;

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}
	
	public void displayMathCheatDataFromStudent() {
		mathCheat.cheating();
	}
}
