package top.lldwb.qr.action;

import top.lldwb.qr.service.QRCode;
import top.lldwb.qr.service.QRCodeImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/qr")
public class QRCodeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String url = req.getParameter("codeContent");
        String size = req.getParameter("size");
//        System.out.println(url);
        //System.out.println(size);
        QRCode qrCode = new QRCodeImpl();
        //传入(文本,输出流,大小)
        qrCode.createImgUrl(url, resp.getOutputStream(), Integer.parseInt(size!=null?size:"300"));
    }
}
