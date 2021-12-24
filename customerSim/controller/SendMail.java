package com.example.sim.customerSim.controller;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	  public static void myMail(String emailId) {

	        // Recipient's email ID needs to be mentioned.
	       final String username = "YYYYYYYYY@gmail.com";

	        // Sender's email ID needs to be mentioned
	       final String password = "XXXXX";

	        // Assuming you are sending email from through gmails smtp
	       

	        // Get system properties
	        Properties properties = System.getProperties();

	        // Setup mail server
	        properties.put("mail.smtp.host", "smtp.gmail.com");
	        properties.put("mail.smtp.port", "587");
	        properties.put("mail.smtp.starttls.enable", "true");
	        properties.put("mail.smtp.auth", "true");

	        // Get the Session object.// and pass 
	        Session session = Session.getInstance(properties,
	                new javax.mail.Authenticator() {
	                    protected PasswordAuthentication getPasswordAuthentication() {
	                        return new PasswordAuthentication(username,password);

	                        
	            }

	        });
	        //session.setDebug(true);
	        try {
	            // Create a default MimeMessage object.
	            MimeMessage message = new MimeMessage(session);

	            // Set From: header field of the header.
	            message.setFrom(new InternetAddress(username));

	            // Set To: header field of the header.
	            message.addRecipient(Message.RecipientType.TO, new InternetAddress(emailId));

	            // Set Subject: header field
	            message.setSubject("Happy BirthDay To You !");

	           

				/*
				 * Multipart multipart = new MimeMultipart(); MimeBodyPart attachmentPart = new
				 * MimeBodyPart(); MimeBodyPart textPart = new MimeBodyPart();
				 * 
				 * try {
				 * 
				 * File f =new File("D:\\"+fn); attachmentPart.attachFile(f);
				 * textPart.setText("This is text"); multipart.addBodyPart(textPart);
				 * multipart.addBodyPart(attachmentPart);
				 * 
				 * } catch (IOException e) {
				 * 
				 * e.printStackTrace();
				 * 
				 * }
				 * 
				 * message.setContent(multipart);
				 */

	            System.out.println("sending...");
	            // Send message
	            Transport.send(message);
	            System.out.println("Sent message successfully....");
	        } catch (MessagingException mex) {
	            mex.printStackTrace();
	        }

	    }



}
