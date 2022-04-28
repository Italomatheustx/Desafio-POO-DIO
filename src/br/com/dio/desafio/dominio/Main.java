package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setCargaHoraria(132);
		curso1.setDescricao("Descrição curso Java");

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setCargaHoraria(120);
		curso2.setDescricao("Descrição curso js");

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());

		/*
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devItalo = new Dev();
		devItalo.setNome("Italo");
		devItalo.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Italo" + devItalo.getConteudosInscritos());
		
		devItalo.progredir();
		devItalo.progredir();
		
		System.out.println("--");
		System.out.println("Conteúdos Inscritos Italo" + devItalo.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Italo" + devItalo.getConteudosConcluidos());
		System.out.println("XP: " + devItalo.calcularTotalXp());
		
		System.out.println("-----");
		
		Dev devMatheus = new Dev();
		devMatheus.setNome("Matehus");
		devMatheus.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Matheus:" + devMatheus.getConteudosInscritos());
		
		devMatheus.progredir();
		
		System.out.println("--");
		System.out.println("Conteúdos Inscritos Matheus:" + devMatheus.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Matheus" + devItalo.getConteudosConcluidos());
		System.out.println("XP: " + devMatheus.calcularTotalXp());
	}

}
