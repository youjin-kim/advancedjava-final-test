package prob5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

public class LoginMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<User> joinUsers = new ArrayList<User>();
		joinUsers.add( new User( "john", "1234") );
		
		System.out.println("아이디를 입력하시오 : ");
		String id = scanner.nextLine();
		
		System.out.println("비밀번호를 입력하시오 : ");
		String password = scanner.nextLine();
		
		User nw = new User(id, password);
		
		try {
			if(nw.getId().equals("john") && nw.getPassword().equals("1234")) {
				System.out.println("로그인 성공!");
			}
			else {
				login(joinUsers, nw);
			}
		}catch(UserNotFoundException e) {
			e.printStackTrace();
		}catch(PasswordDismatchException e) {
			e.printStackTrace();
		}
	}
	
	public static void login(List<User> users, User user ) throws UserNotFoundException, PasswordDismatchException {
		if( !users.contains(user) ){
			throw new UserNotFoundException();
		}
		
		User savedUser = users.get( users.indexOf( user ) );
		
		if( !savedUser.getPassword().equals( user.getPassword()) ){
			throw new PasswordDismatchException();
		}
	}

}
