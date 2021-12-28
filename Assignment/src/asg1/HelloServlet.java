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
	 * ������� �ֹε�� ��ȣ�� ���� ������ ����
	 * ��ü�� ����ȭ�� ���� ��ü�� ����� �����͸� �Ϸķ� ������� �� JVM�� ���� Ŭ���� �̸��� ���� ID�� ���� ��ü�� �����
	 * JVM�� ���� ID�� �ٸ� ��ü�� ����ȭ �� ���¿� �����ϴ� ���� �ź���
	 * Ŭ������ ��������� serialVersionUID �ʵ带 ������ Ŭ���� ������ ���� ���� ��ȣ�� ������
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//Ŭ���̾�Ʈ���� ���� �� ������ ������ �����Ѵ�.
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		//html���� �κ�
		pw.print("<html><body><h1>");
		pw.print("Hello");
		pw.print("</h1></body></html>");
		pw.close();
	}
}
