package application;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.PortalUser;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		Set<PortalUser> set = new HashSet<>();
		
		System.out.print("How many students for Course A? ");
		Integer nA = sc.nextInt();
		
		for (int i = 1; i <= nA; i++) {
			Integer code = sc.nextInt();
			
			PortalUser user = new PortalUser(code);
			
			set.add(user);
		}
		
		System.out.print("How many students for Course B? ");
		Integer nB = sc.nextInt();
		
		for (int i = 1; i <= nB; i++) {
			Integer code = sc.nextInt();
			
			PortalUser user = new PortalUser(code);
			
			set.add(user);
		}
		
		System.out.print("How many students for Course C? ");
		Integer nC = sc.nextInt();
		
		for (int i = 1; i <= nC; i++) {
			Integer code = sc.nextInt();
			
			PortalUser user = new PortalUser(code);
			
			set.add(user);
		}
		
		
		System.out.println("Total students: " + set.size());
		sc.close();
		
	}
}
