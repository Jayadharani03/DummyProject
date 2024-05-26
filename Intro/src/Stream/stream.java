package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class stream {

	@Test
	public void arrayFilter() {
		int count = 0;
		List<String> name = new ArrayList<String>();
		name.add("Jaya");
		name.add("Janani");
		name.add("Luna");
		name.add("Suji");
		name.add("JayaDharani");

		for (int i = 0; i < name.size(); i++) {
			String names = name.get(i);
			if (names.endsWith("i")) {
				count++;

			}

		}
		System.out.println(count);

		// There is no life for intermediate output if there is no terminal output
		// Terminal operation will execute only if inter op returns (true)
		// We can create stream
		// How to filter in Stream API
		long oneline = name.stream().filter(j -> j.startsWith("J")).count();
		System.out.println(oneline);

		// Store the values using the stream
		Long print = Stream.of("Jaya", "Mythili", "Priya", "Multhu", "Muruga", "Mental").filter(m -> {
			m.startsWith("");

			return true;
		}).count();

		System.out.println(print);

		// Display all the value
		name.stream().filter(d -> d.startsWith("S")).forEach(d -> System.out.println(d));

		// Print name which have last letter as "J" with uppercase
		Stream.of("Lake", "Love", "Level", "Ladder").filter(s -> s.endsWith("e")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		Stream.of("Jaya", "Priya", "Anusha", "Anu", "Muthu").map(s -> s.toLowerCase())
				.forEach(s -> System.out.println(s));

		// Using sort
		Stream.of("Jaya", "Gautham", "Ram", "Simon").sorted().forEach(s -> System.out.println(s));

		// Array to Array list
		List<String> a = Arrays.asList("Jaya", "Jaya sri", "Lava", "Dhanu");
		a.stream().filter(s -> s.startsWith("J")).sorted().forEach(s -> System.out.println(s));

		int c = 0;
		// Concat the two array
		List<String> Obj1 = new ArrayList<String>();
		Obj1.add("Jaya");
		Obj1.add("Jaya Dharani");
		Obj1.add("Jaya Sri");
		Obj1.add("Lava");
		for (int i = 0; i < Obj1.size() - 1; i++) {

			String person = Obj1.get(i);
			if (person.contains("Sri")) {
				c++;
				person.toUpperCase();
			}
		}
		System.out.println(c + " string");

		List<String> Obj2 = Arrays.asList("Kavi", "Mythili", "Lakshmi", "Suji", "Praiya");

		Stream<String> obj3 = Stream.concat(Obj1.stream(), Obj2.stream());
		obj3.sorted().filter(s -> s.endsWith("i")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		
		//Covert Steam to to list using the collection  
		List <String> collects=Stream.of("Sun","Saturday","Star","Moon").filter(s->s.startsWith("s")).collect(Collectors.toList());
		for(int j=0;j<collects.size();j++)
		{
			System.out.println(collects.get(j));
		}
		
		//Using anymatch method to find the name is present are not
	//Boolean flag=obj3.anyMatch(s->s.equalsIgnoreCase("Suji"));
	//Assert.assertTrue(flag);
		
		

		
		
	}
}
