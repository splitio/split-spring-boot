package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    public SplitService _splitService;

    /**
     * Replace the place holders and run that curl in the command line
     * curl localhost:8080/getTreatment/split/<SPLIT_NAME>/key/<USER_ID>
     * @param split
     * @param userId
     * @return
     */
    @RequestMapping("/getTreatment/split/{split}/key/{userId}")
    public String index(@PathVariable String split, @PathVariable String userId) {
        return "treatment is: " + _splitService.getClient().getTreatment(userId, split);
    }

}