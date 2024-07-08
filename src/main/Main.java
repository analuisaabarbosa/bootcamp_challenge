package main;

import java.time.LocalDate;

import main.dominio.Bootcamp;
import main.dominio.Curso;
import main.dominio.Dev;
import main.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Curso introdutório da linguagem de programação Java.");
        cursoJava.setCargaHoraria(8);

        Curso cursoPython = new Curso();
        cursoPython.setTitulo("Curso Python");
        cursoPython.setDescricao("Curso introdutório da linguagem de programação Python.");
        cursoPython.setCargaHoraria(10);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria Java");
        mentoriaJava.setDescricao("Mentoria a introdução de Java");
        mentoriaJava.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp de introdução para desenvolvimento com Java");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoPython);
        bootcamp.getConteudos().add(mentoriaJava);

        Dev devAna = new Dev();
        devAna.setNome("Ana Luisa");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Ana: " + devAna.getConteudosInscritos());
        devAna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos de Ana: " + devAna.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Ana: " + devAna.getConteudosConcluidos());
        System.out.println("XP de Ana: " + devAna.calcularTotalXP());

        System.out.println("-----");

        Dev devMari = new Dev();
        devMari.setNome("Mariane");
        devMari.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Mari: " + devMari.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Mari: " + devMari.getConteudosConcluidos());
        System.out.println("XP de Mari: " + devMari.calcularTotalXP());
    }
}
