package com.kcomp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kcomp.model.BatterStat;
import com.kcomp.model.PitcherStat;
import com.kcomp.model.Player;
import com.kcomp.model.Stat;
import com.kcomp.service.PlayerService;
import com.kcomp.service.StatService;

public class Start {

	public static void main(String[] args) {
		ApplicationContext context = 
                new AnnotationConfigApplicationContext(Config.class);
		
		PlayerService playerService = context.getBean(PlayerService.class);
		
		BatterStat stat = new BatterStat();
		
		stat.setTeam("TOR");
		stat.setHomeruns(23);
		
		PitcherStat pstat = new PitcherStat();
		pstat.setStrikeouts(200);
		pstat.setTeam("LAA");
		
		Player player = new Player();
		
		player.setFirstName("Joe");
		player.setLastName("Smith");
		
		player.addStat(pstat);
		player.addStat(stat);
		
		pstat.setPlayer(player);
		stat.setPlayer(player);
		
		playerService.createPlayer(player);
		
		StatService statService = context.getBean(StatService.class);
		
		Stat s = statService.findStatById(2L);
		
		System.out.println(s.toString());

	}

}
