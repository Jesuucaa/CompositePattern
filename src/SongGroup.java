import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent {
	
	ArrayList songComponents = new ArrayList();
	
	String groupName;
	String groupDescription;
	
	public SongGroup(String groupName, String groupDescription)
	{
		this.groupName = groupName;
		this.groupDescription = groupDescription;
	}

	public String getGroupName() {
		return groupName;
	}

	public String getGroupDescription() {
		return groupDescription;
	}
	
	public void add(SongComponent songComponent)
	{
		songComponents.add(songComponent);
	}

	public void remove(SongComponent songComponent)
	{
		this.songComponents.remove(songComponent);
	}

	public SongComponent getSongComponent(int componentIndex) {
		return (SongComponent)songComponents.get(componentIndex);
	}
	
	public void displaySongInfo()
	{
		System.out.println(getGroupName() + " " +
				getGroupDescription() + "\n");
		
		Iterator songIterator = songComponents.iterator();
		
		while(songIterator.hasNext())
		{
			SongComponent songInfo = (SongComponent) songIterator.next();
			songInfo.displaySongInfo();
		}
	}
	
	
	
}
