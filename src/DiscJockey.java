
public class DiscJockey {
	SongComponent songList;

	public DiscJockey(SongComponent songList) {
		super();
		this.songList = songList;
	}

	public void getSongList() {
		songList.displaySongInfo();
	}
	
	
}
