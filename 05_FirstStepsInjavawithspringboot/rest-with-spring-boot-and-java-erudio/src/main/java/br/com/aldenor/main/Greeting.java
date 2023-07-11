package br.com.aldenor.main;


public class Greeting {

	private final long ID;
	private final String content;
	
	public Greeting(long iD, String content) {
		super();
		ID = iD;
		this.content = content;
	}

	public long getID() {
		return ID;
	}

	public String getContent() {
		return content;
	}
	
	
	
	
}
