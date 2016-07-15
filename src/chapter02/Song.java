package chapter02;

public class Song {
	
	private String title;
	private String artist;
	private String albun;
	private String composer;
	private int year;
	private int track;
	
	public Song(){
		
	}
	public Song(String artist,String title){
		//this.artist=artist;
		//this.title=title;
		this(artist,title,null,null,0,0);
	}
	public Song(String artist,String title,String albun,String composer,int year,int track){
		this.artist=artist;
		this.title=title;
		this.albun=albun;
		this.composer=composer;
		this.year=year;
		this.track=track;
		
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbun() {
		return albun;
	}
	public void setAlbun(String albun) {
		this.albun = albun;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}

	public void show() {
		System.out.println(artist+" "+title+" "+"("+albun+","+year+","+track+"번 트랙"+","+composer+"작곡가"+")" ); 
	}

}
