import java.lang.*;

/*
	LAB 1 FOR INTERFACES
*/

public interface Monster {
	public int getHowBig();
	public String getName();
	public boolean isBigger(Monster other);
	public boolean isSmaller(Monster other);
	public boolean namesTheSame(Monster other);
}