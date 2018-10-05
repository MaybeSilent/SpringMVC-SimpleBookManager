package controller;

import dao.bookImpl;
import model.book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class mainController {
    private bookImpl bookQuery;

    public mainController() {
        this.bookQuery = new bookImpl();
    }

    @RequestMapping(value = "/show" , method = GET)
    public String index(Model model){
        model.addAttribute("bookList" ,
                bookQuery.findBooks() );
        return "show";
    }

    @RequestMapping(value = "/change" , method = GET)
    public String change(){
        return "change";
    }

    @RequestMapping(value = "/change_post" , method = POST)
    public String change_post(@RequestParam("name") int id , @RequestParam("price") int price){
        boolean flag = bookQuery.changeBook(id , price);
        if(flag){
            return "redirect:/show";
        }
        return "redirect:/change";
    }

    @RequestMapping(value = "/delete" , method = GET)
    public String delete(){
        return "delete";
    }

    @RequestMapping(value = "/delete_post" , method = POST)
    public String delete_post(@RequestParam("name") int id){
        boolean flag = bookQuery.deleteBook(id);
        if(flag){
            return "redirect:/show";
        }
        return "redirect:/delete";
    }

    @RequestMapping(value = "/search" , method = GET)
    public String search(){
        return "search";
    }


    @RequestMapping(value = "/search_result" , method = POST)
    public String search_result(@RequestParam("name") String word , Model model){
        model.addAttribute("bookList",
                bookQuery.searchBook(word));
        return "search_result";
    }

    @RequestMapping(value = "/save" , method = POST)
    public String insert_post(book book){
        boolean flag = bookQuery.insertBook(book.getName(), book.getAuthor(), book.getPrice());
        if(flag){
            return "redirect:/show";
        }
        return "redirect:/insert";
    }
    @RequestMapping(value = "/insert" , method = GET)
    public String insert_get(){
        return "insert";
    }
}
