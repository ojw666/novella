package sm.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class ImgServlet extends HttpServlet{
	
	private static final String UPLOAD_DIRECTORY = "upload";
	private static final int MEMORY_THRESHOLD = 1024 * 1024 * 3; 
	private static final int MAX_FILE_SIZE = 1024 * 1024 * 40; 
	private static final int MAX_REQUEST_SIZE = 1024 * 1024 * 50;
	
	
	private static String imgUrl="";
	protected void doPost(HttpServletRequest request,
	        HttpServletResponse response) throws ServletException, IOException {
	        // ����Ƿ�Ϊ��ý���ϴ�
	        if (!ServletFileUpload.isMultipartContent(request)) {
	            // ���������ֹͣ
	            PrintWriter writer = response.getWriter();
	            writer.println("Error: ����������� enctype=multipart/form-data");
	            writer.flush();
	            return;
	        }
	  
	        // �����ϴ�����
	        DiskFileItemFactory factory = new DiskFileItemFactory();
	        // �����ڴ��ٽ�ֵ - �����󽫲�����ʱ�ļ����洢����ʱĿ¼��
	        factory.setSizeThreshold(MEMORY_THRESHOLD);
	        // ������ʱ�洢Ŀ¼
	        factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
	  
	        ServletFileUpload upload = new ServletFileUpload(factory);
	          
	        // ��������ļ��ϴ�ֵ
	        upload.setFileSizeMax(MAX_FILE_SIZE);
	          
	        // �����������ֵ (�����ļ��ͱ�������)
	        upload.setSizeMax(MAX_REQUEST_SIZE);
	  
	        // ������ʱ·�����洢�ϴ����ļ�
	        // ���·����Ե�ǰӦ�õ�Ŀ¼
	        String uploadPath = getServletContext().getRealPath("./") + File.separator + UPLOAD_DIRECTORY;
	        
	          
	        // ���Ŀ¼�������򴴽�
	        File uploadDir = new File(uploadPath);
	        if (!uploadDir.exists()) {
	            uploadDir.mkdir();
	        }
	  
	        try {
	            // ���������������ȡ�ļ�����
	            @SuppressWarnings("unchecked")
	            List<FileItem> formItems = upload.parseRequest(request);
	  
	            if (formItems != null && formItems.size() > 0) {
	                // ������������
	                for (FileItem item : formItems) {
	                    // �������ڱ����е��ֶ�
	                    if (!item.isFormField()) {
	                        String fileName = new File(item.getName()).getName();
	                        imgUrl = uploadPath + File.separator + fileName;
	                        File storeFile = new File(imgUrl);
	                        // �ڿ���̨����ļ����ϴ�·��
	                        // �����ļ���Ӳ��
	                        item.write(storeFile);
	                        request.setAttribute("message",
	                            "�ļ��ϴ��ɹ�!");
	                    }
	                }
	            }
	        } catch (Exception ex) {
	            request.setAttribute("message",
	                    "������Ϣ: " + ex.getMessage());
	        }
	       
	    }
}