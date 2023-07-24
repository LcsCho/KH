package jdbc.dto;

public class BoardDto {
	private String boardTitle;
	private String boardContent;
	private String boardWriter;
	public BoardDto() {
		super();
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	@Override
	public String toString() {
		return "BoardDto [boardTitle=" + boardTitle + ", boardContent=" + boardContent + ", boardWriter=" + boardWriter
				+ "]";
	}

}
