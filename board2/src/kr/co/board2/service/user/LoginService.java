package kr.co.board2.service.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.board2.controller.CommonService;
import kr.co.board2.dao.UserDao;
import kr.co.board2.vo.UserVO;

public class LoginService implements CommonService {

	@Override
	public String requestProc(HttpServletRequest req, HttpServletResponse resp) {
		
		if(req.getMethod().equals("GET")) {
			
			return "/user/login.jsp";
			
		}else {
			
			String uid  = req.getParameter("id");
			String pass = req.getParameter("pw");

			UserDao dao = UserDao.getInstance();
			UserVO vo = null;
			
			try {
				 vo = dao.login(uid, pass);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		// ����ó��
		if(vo != null) {
			// ȸ��
			HttpSession session = req.getSession();
			session.setAttribute("user", vo);
			return "redirect:/board2/list.do";
		}else {
			// ��ȸ��
			return "redirect:/board2/user/login.do?result=fail";
		}
		
		}
	}
}
