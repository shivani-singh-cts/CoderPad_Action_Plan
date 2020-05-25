package com.coderpad.preparation;

class Position {
	int x;
	int y;
	Position(){
		x =0;
		y =0;
	}
}
public class RobotMovementProblem {

	static Position moveRobot(String move) {
		Position pos = new Position();
		for(int i =0;i< move.length(); i++) {
			if(move.charAt(i) == 'U')
				pos.y += 1;
			else if(move.charAt(i) == 'D')
				pos.y -= 1;
			else if(move.charAt(i) == 'L')
				pos.x -= 1;
			else if(move.charAt(i)== 'R')
				pos.x += 1;
		}
		return pos;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String move = "UDDLLRUUUDUURUDDUULLDRRRR"; 
		Position p = new Position();
		p = moveRobot(move);
		System.out.println("Position of Robot is: ("+ p.x +", "+ p.y +")");
	}

}
