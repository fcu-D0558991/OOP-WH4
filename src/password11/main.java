package password11;
import java.util.Scanner;
public class main {
	
			public static void main(String[] args){
				System.out.println("please enter a password");
				Scanner input=new Scanner(System.in);
				String ps1=input.next();
				String a="exit";
				boolean z=ps1.equalsIgnoreCase(a);
				while(z==false){
					password PS=new password();
					PS.encode(ps1);
				}
}

}
