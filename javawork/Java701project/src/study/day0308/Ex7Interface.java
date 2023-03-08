package study.day0308;

//데이타 클래스(data transfer object)
class BoardDTO
{
	private String writer;
	private String subject;
	
	BoardDTO()
	{		
	}

	public BoardDTO(String writer, String subject) {
		super();
		this.writer = writer;
		this.subject = subject;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}

//데이타 처리에 대한 할일을 미리 인터페이스로 만든다
interface BoardDAOInter
{
	public void insert(BoardDTO dto);
	public void delete(String writer);
	public void list();
	public void update(String writer);
}

//dao class(Data Access Object:데이타 로직 처리를 이한 클래스:CRUD)
class BoardDAO implements BoardDAOInter
{

	@Override
	public void insert(BoardDTO dto) {
		// TODO Auto-generated method stub
		System.out.println(dto.getWriter()+" 님의 글 "+dto.getSubject()+"를 DB 에 추가함");
	}

	@Override
	public void delete(String writer) {
		// TODO Auto-generated method stub
		System.out.println(writer+"님의 글을 삭제함");
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("전체 게시글을 조회합니다");
	}

	@Override
	public void update(String writer) {
		// TODO Auto-generated method stub
		System.out.println(writer+"님의 글을 수정합니다");
	}
	
}


public class Ex7Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardDAOInter dao=new BoardDAO();
		
		dao.insert(new BoardDTO("이영자", "안녕하세요"));
		dao.delete("김소정");
		dao.update("이미자");
		dao.list();
	}

}











