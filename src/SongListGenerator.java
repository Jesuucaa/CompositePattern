public class SongListGenerator {
	
	public static void main(String[] args) {
		SongComponent industrialMusic = new SongGroup("Industrial", 
				"es un género de música electrónica/experimental que hace uso de temas "
				+ "transgresivos y suele estar asociada con angustia e ira contraculturales.");
		
		SongComponent heavyMetalMusic = new SongGroup("HeavyMetal", 
				"es un género musical que nació a finales de los años sesenta y principios de "
				+ "los setenta tanto en el Reino Unido como en los Estados Unidos, cuyos orígenes "
				+ "provienen del blues rock, hard rock y del rock psicodélico.");
		
		SongComponent dubstepMusic = new SongGroup("Dubstep",
				"es un género musical derivado del bass que surgió a finales de los años 1990 y "
				+ "comienzos de los años 2000 en Londres, Inglaterra. Es la culminación de un linaje "
				+ "de géneros como el 2-step garage, broken beat, drum and bass, jungle, dub y reggae.");
	
		SongComponent everySong = new SongGroup("Lista de canciones", "Todas las canciones disponibles");
		
		everySong.add(industrialMusic);
		
		industrialMusic.add(new Song("Head Like a Hole", "NIN", 1990));
		industrialMusic.add(new Song("Headhunter", "Front 242", 1988));
		
		industrialMusic.add(dubstepMusic);
		
		dubstepMusic.add(new Song("Centipede", "Knife Party", 2012));
		dubstepMusic.add(new Song("Tetris", "Doctor P", 2011));
		
		everySong.add(heavyMetalMusic);
		
		heavyMetalMusic.add(new Song("War Pigs", "Black Sabath", 1970));
		heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980));
		
		DiscJockey crazyLarry = new DiscJockey(everySong);
		
		crazyLarry.getSongList();
	}
}
