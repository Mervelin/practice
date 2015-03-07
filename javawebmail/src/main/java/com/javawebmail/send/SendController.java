package com.javawebmail.send;

import java.util.List;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
public class SendController {

	//@Autowired
	//Send send;
	
    //@Autowired
    //private JavaMailSender mailSender;
	
	@RequestMapping(value = "/send.do", method = RequestMethod.POST)
	public ModelAndView sendMessage(
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		JavaMailSenderImpl mail = new JavaMailSenderImpl();
		
		mail.setHost("smtp.gmail.com");
		mail.setUsername("javatestwebapp");
		mail.setPassword("administrator123");
		mail.setPort(587);
		Properties javaMailProperties = new Properties();
		javaMailProperties.setProperty("mail.transport.protocol", "smtp");
		javaMailProperties.setProperty("mail.smtp.auth", "true");
		javaMailProperties.setProperty("mail.smtp.starttls.enable", "true");
		mail.setJavaMailProperties(javaMailProperties);

		SimpleMailMessage email = new SimpleMailMessage();
	    email.setTo(request.getParameter("TO"));
	    email.setSubject(request.getParameter("SUBJECT"));
	    email.setText(request.getParameter("MESSAGE"));
	     
	     
	    mail.send(email);
	    
	    return new ModelAndView("result");
	}
	
	@RequestMapping(value = "/emailform", method = RequestMethod.GET)
	public ModelAndView getEmailForm(final HttpServletRequest request) throws Exception {
		return new ModelAndView("jsp/emailform.jsp");
	}
}
