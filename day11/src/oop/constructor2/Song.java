package oop.constructor2;

public class Song {
	private String title, artist, album;
	private int play, like;
	
	public Song(String title, String artist, String album, int play, int like) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.setPlay(play);
		this.setLike(like);
	}
	private String getArtist(String artist) {
		if (artist == null) return "Various artist";
		else return artist;
	}
	private void setPlay(int play) {
		if (play < 0) return;
		this.play = play;
	}
	private void setLike(int like) {
		if (like < 0) return;
		this.like = like;
	}
	private String getBest() {
		if (play > 100000) return "(베스트)";
		else return "";
	}
	private String getPopular() {
		if (like > 100000) return "(인기곡)";
		else return "";
	}
	private int getRankingPoint() { return play * 2 + like / 2; }
	public void show() {
		System.out.println("노래 제목: "  + this.title + this.getBest() + this.getPopular());
		System.out.println("가수: " + this.getArtist(artist));
		System.out.println("앨범: " + this.album);
		System.out.println("재생수: " + this.play);
		System.out.println("좋아요 수: " + this.like);
		System.out.println("랭킹 포인트: " + this.getRankingPoint() + "\n");
	}
}

