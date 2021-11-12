package chapter06;

public class CheakExmple04Board {
	public static void main(String[] args) {
		CheakExmple03Board board1 = new CheakExmple03Board(
				"어벤져스","액션");
		CheakExmple03Board board2 = new CheakExmple03Board(
				"어벤져스2","액션","스타크");
		CheakExmple03Board board3 = new CheakExmple03Board(
				"닥터스트레인지","액션","베네딕트","2020-10-25");
		CheakExmple03Board board4 = new CheakExmple03Board(
				"샹치","액션","텐링즈","2021-10-25",10000000);
		System.out.print(board1.title + " ");
		System.out.print(board1.content);
		System.out.println();
		System.out.print(board2.title + " ");
		System.out.print(board2.content + " ");
		System.out.print(board2.writer);
		System.out.println();		
		System.out.print(board3.title + " ");
		System.out.print(board3.content + " ");
		System.out.print(board3.writer + " ");
		System.out.print(board3.date);
		System.out.println();
		System.out.print(board4.title + " ");
		System.out.print(board4.content + " ");
		System.out.print(board4.writer + " ");
		System.out.print(board4.date + " ");
		System.out.print(board4.hitcount);		
	}
}
