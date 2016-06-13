package ru.astashev.services.impl;

import org.junit.BeforeClass;
import ru.itis.astashev.entity.FootballLeague;
import ru.itis.astashev.repository.FootballLeagueRepository;
import ru.itis.astashev.services.impl.FootballLeagueServiceImpl;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FootballLeagueServiceImlTest {
     static FootballLeagueServiceImpl footballLeagueService;

    @BeforeClass
    public static void init(){
        footballLeagueService = new FootballLeagueServiceImpl();
        footballLeagueService.footballLeagueRepository = mock(FootballLeagueRepository.class);
        FootballLeague league = new FootballLeague();
        league.setName("OAFL");
        league.setId(1);
        when(footballLeagueService.footballLeagueRepository.findOneById(1)).thenReturn(league);
    }
}