package com.edmontheprogrammer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Controller; The @Controller annotation indicates that "CoursesController" is a controller
 *
 */
@Controller
public class CoursesController {

    /**
     * @RequestMapping; The @RequestMapping annotation maps HTTP requests to handler methods of MVC. It creates a URL
     * "127.0.0.1:8080/courses" when a user visits this URL, they'll be able to view the String courses() method
     * returns. In this case, the String "Welcome to Backend Development" on the html web page
     * Notes on Tomcat server: Spring Boot comes with a built-in web server out of the box just like Django gives you
     * a development web server and an Admin Login website out of the box when you install Django for the first time.
     * The Tomcat server gets configured automatically by Spring Boot and ready to run web apps. You can change the
     * Tomcat server's port number from 8080 to something else such as 8083 in the "application.properties" file using
     * this statment "server.port=8083"
     *I cannot configure Spring Boot with JSP file. When I visit the URL for the JSP file does not show the html page
     *   instead it creates a file in a directory. I click on the file and it displays this error "This file  does not have an
     *   associated with it for performing this action. please install an app ... "
     *
     *  @ResponseBody; The "@ResponseBody" annotation is use when we want to return data. Use the "@ResponseBody"
     *  annotation when you want to return actual data such as the String being return by a method
     *  instead of a web page. Technically you want to include both "@RequestMapping("/course.jsp")
     *     @ResponseBody" on top of the method when you want to return the actual data being returned by the method to
     *     the web page
     *  Use @RequestMapping annotation when you want to return the JSP HTML web page that's a
     *  included in the method.
     *
     */

    @RequestMapping("/course")
    public String courses()
    {
        System.out.println("Welcome to Backend Development");
        return "course.jsp";
    }
}
