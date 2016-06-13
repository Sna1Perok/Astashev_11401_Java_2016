package ru.astashev.services.impl;

import org.junit.BeforeClass;
import ru.itis.astashev.entity.FootballLeague;
import ru.itis.astashev.entity.FootballTeam;

import java.util.ArrayList;
/**
 * Created by 1 on 02.06.2016.
 */

public class FootballTeamServiceImplTest {
    private static ArrayList<FootballTeam> footballTeams;
     static FootballTeamServiceImplTest footballTeamService;
    private static FootballLeague footballLeague;

    @BeforeClass
    public static void init() {
        footballTeamService = new FootballTeamServiceImplTest();
        //footballTeamService.footballTeamService = mock(FootballTeam.class)

      //  mock()
    }
}