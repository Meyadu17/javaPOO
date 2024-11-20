package fr.apside.exercice.javaPoo;

import fr.apside.exercice.javaPoo.entity.Point;

public class Main {
	public static void main(String[] args) {

		var point1 = new Point(4, 2);

		var point2 = new Point(4, 2);

		System.out.println(point1.equals(point2));
	}

}