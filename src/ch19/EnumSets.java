package ch19;

import static ch19.AlarmPoints.*;
import static net.mindview.util.Print.*;
import java.util.*;
public class EnumSets {
	public static void main(String[] args) {
		EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class);
		points.add(BATHROMM);
		print(points);
		points.addAll(EnumSet.of(STAIR1,STAIR2,KITCHEN));
		print(points);
	}
}
