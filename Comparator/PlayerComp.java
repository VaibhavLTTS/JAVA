import java.util.Comparator;

public class PlayerComp implements Comparator<Player> {


	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
