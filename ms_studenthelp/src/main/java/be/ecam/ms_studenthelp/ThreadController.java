package be.ecam.ms_studenthelp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import be.ecam.ms_studenthelp.Interfaces.IForumThread;
import be.ecam.ms_studenthelp.Object.ForumThread;


@RestController
public class ThreadController {

    @GetMapping("/CreateThread")
    public IForumThread CreateThread(){
        IForumThread thread = new ForumThread("Le meilleur titre du monde","Quelqu'un","Une catégorie banale");
        MsStudenthelpApplication.DatabaseManager.CreateForumThread(thread);
        return thread;
    }

    @GetMapping("/getThread")
    public IForumThread GetEasyThread(){
        IForumThread thread = new ForumThread("Le meilleur titre du monde","Quelqu'un","Une catégorie banale");
        return thread;
    }

    /*@GetMapping("/helloMapping")
    public IForumThread index_ter() {

        //MsStudenthelpApplication.DatabaseManager.CreateForumThread(ft);



        IForumThread test = MsStudenthelpApplication.DatabaseManager.GetThread("uuid");

        MsStudenthelpApplication.DatabaseManager.UpdateThread(test);


        test.setContent("C'est la vie de chateau les blEUs?!!");
        //const myJSON = JSON.stringify(obj)
        return test;//"coucou";
    }*/

}