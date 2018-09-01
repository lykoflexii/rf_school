package org.dotintell.ecole;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.dotintell.ecole.dao.ClasseRepository;
import org.dotintell.ecole.dao.CycleRepository;
import org.dotintell.ecole.dao.EtudiantRepository;
import org.dotintell.ecole.dao.ProfesseurRepository;
import org.dotintell.ecole.entities.Classe;
import org.dotintell.ecole.entities.Cycle;
import org.dotintell.ecole.entities.Etudiant;
import org.dotintell.ecole.entities.Professeur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcoleFrancoArabeApplication implements CommandLineRunner {
	@Autowired
	private ClasseRepository classeRepository;
	@Autowired
	private ProfesseurRepository professeurRepository;
	@Autowired
	private EtudiantRepository etudiantRepository;
	@Autowired
	private CycleRepository cycleRepository;
	
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) {
		SpringApplication.run(EcoleFrancoArabeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cycle c1 = cycleRepository.save(new Cycle("Premier_Cycle", "C1"));
		Cycle c2 = cycleRepository.save(new Cycle("Second_Cycle", "C2"));
		
		Classe cl_c1_A = classeRepository.save(new Classe("Classe C1 A", c1));
		Classe cl_c1_B = classeRepository.save(new Classe("Classe C1 B", c1));
		Classe cl_c1_C = classeRepository.save(new Classe("Classe C1 C", c1));
		Classe cl_c2_A = classeRepository.save(new Classe("Classe C2 A", c2));
		Classe cl_c2_B = classeRepository.save(new Classe("Classe C2 B", c2));
		Classe cl_c2_C = classeRepository.save(new Classe("Classe C2 C", c2));
		
		professeurRepository.save(new Professeur("PESP_10000", "DIOP", "Idy", "771000000", "Grand Mbao", c1));
		professeurRepository.save(new Professeur("PESP_10001", "FALL", "Ibrahima", "771000001", "Dakar", c2));
		professeurRepository.save(new Professeur("PESP_10002", "GUEYE", "Bamba", "771000002", "Petit mbao", c2));
		professeurRepository.save(new Professeur("PESP_10003", "DIALLO", "Moussa", "771000003", "Keur Massar", c1));
		
		etudiantRepository.save(new Etudiant("BASSE", "Mignane", "........", "........", df.parse("01/01/2000"), "Dakar", "781000000", "Mariste", cl_c1_A));
		etudiantRepository.save(new Etudiant("NDIAYE", "Issa", "........", "........", df.parse("02/02/2001"), "Keur Massar", "781000001", "KM", cl_c2_A));
		etudiantRepository.save(new Etudiant("KOTE", "Sambaly", "........", "........", df.parse("03/03/2003"), "Malika", "781000002", "MLK", cl_c2_B));
		etudiantRepository.save(new Etudiant("FALL", "Mery", "........", "........", df.parse("04/04/2004"), "Patte D'Oie", "781000003", "PDO", cl_c1_B));
		etudiantRepository.save(new Etudiant("GAYE", "Awa", "........", "........", df.parse("05/05/2005"), "Keur Ndiaye Lo", "781000004", "KNL", cl_c1_C));
		etudiantRepository.save(new Etudiant("BA", "Mamadou", "........", "........", df.parse("06/06/1988"), "Nord Foire", "781000005", "NF", cl_c2_C));
		
	}
}
