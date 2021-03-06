import java.util.Scanner;
import java.util.Set;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class PlayerDetailsTreeMain {

	public static void main(String[] args)throws NumberFormatException, IOException {
		
		 TreeMap<Integer,PlayerDetailsTree> map=new TreeMap<Integer,PlayerDetailsTree>();    
		 
		 
		 BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		 
		 
		 System.out.println("Enter the number of players");
		 int n = Integer.parseInt(reader.readLine());
		 int c=1;
		 for(int i=0;i<n;i++)
		 {
			 System.out.println("Enter the details of the player "+c);
			 c++;
			 int capNumber = Integer.parseInt(reader.readLine());
			 System.out.println("Enter the name ");
			 String name = reader.readLine();
			 System.out.println("Enter the team ");
			 String Team = reader.readLine();
			 System.out.println("Enter the skill ");
			 String Skill = reader.readLine();
			 PlayerDetailsTree p=new PlayerDetailsTree();
			 p.setName(name);
			 p.setTeam(Team);
			 p.setSkill(Skill);
			 map.put(capNumber, p);
			 
		 }
		 System.out.println("Player Details");
		 
		 Set<Map.Entry<Integer,PlayerDetailsTree>> entries = map.entrySet();
		 
		 
		 for(Map.Entry<Integer, PlayerDetailsTree> entry : entries)
		 {
	            System.out.println( entry.getKey() + "--" + entry.getValue() );
	        }
	}

}
