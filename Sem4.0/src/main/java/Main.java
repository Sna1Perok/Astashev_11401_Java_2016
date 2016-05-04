import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itis.astashev.repository.FootballLeagueRepository;
import ru.itis.astashev.repository.FootballTeamRepository;
import ru.itis.astashev.repository.GamesRepository;
import ru.itis.astashev.repository.UserRepository;

/**
 * Created by 1 on 27.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("spring-config.xml");

        //  GroupRepository gr = ac.getBean(GroupRepository.class);
        //  FootballTeamRepository tr = ac.getBean(FootballTeamRepository.class);
        // Group g = gr.findByName("11-401");
        GamesRepository gamesRepository = ac.getBean(GamesRepository.class);
        UserRepository userRepository = ac.getBean(UserRepository.class);
        FootballTeamRepository footballTeamRepository = ac.getBean(FootballTeamRepository.class);
        FootballLeagueRepository footballLeagueRepository = ac.getBean(FootballLeagueRepository.class);

        System.out.println("*");
        System.out.println(footballLeagueRepository.findAll());
        System.out.println(footballTeamRepository.findAll());
        System.out.println(userRepository.findAll());
        System.out.println(gamesRepository.findAll());
        //System.out.println(g.getName());

    }
}
