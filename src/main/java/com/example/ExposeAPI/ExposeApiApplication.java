package com.example.ExposeAPI;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.ExposeAPI.model.ValuationData;
import com.example.ExposeAPI.model.ValuationRate;

@SpringBootApplication
public class ExposeApiApplication implements CommandLineRunner {

	@Autowired
	ValuationData vd;
	
	@Autowired
	ValuationRate vr;
	
	List<ValuationRate> lvr = new ArrayList<ValuationRate>();
	
	public static void main(String[] args) {
		SpringApplication.run(ExposeApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		vr.setAskRate("askRate");
		vr.setBaseCurrency("baseCurrency");
		vr.setBidRate("bidRate");
		vr.setMidRate("midRate");
		vr.setQuoteCurrency("quoteCurrency");
		vr.setSnapshotDateTime("snapDT");
		vr.setSpotDate("spotDate");
		lvr.add(vr);
		vd.setTotal(1);
		vd.setValuationRate(lvr);
	}
}

