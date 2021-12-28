package asg1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	/*
	 * 사람에게 주민등록 번호와 같은 역할을 수행
	 * 객체의 직렬화와 같이 객체에 저장된 데이터를 일렬로 입출력할 때 JVM은 같은 클래스 이름과 버전 ID를 가진 객체를 출력함
	 * JVM은 버전 ID가 다른 객체의 직렬화 된 형태와 연결하는 것을 거부함
	 * 클래스는 명시적으로 serialVersionUID 필드를 정의해 클래스 버전에 따른 고유 번호를 포함함
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//클라이언트에게 응답 할 페이지 정보를 셋팅한다.
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		//html문서 부분
		pw.print("<html><body><h1>");
		pw.print("Hello");
		pw.print("</h1></body></html>");
		pw.close();
	}
}
